# ArrayList 구현

사전에 아래와 같이 List 인터페이스를 작성한다.

[List.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/ArrayList%20%26%20LinkedList/List.java)

실제 자바의 컬렉션 프레임워크에는 이 보다 더 많은 메소드가 존재하지만, 최소한의 핵심 메소드만으로 구현해보고자 한다.

## ArrayList 클래스 및 생성자

ArrayList 클래스를 생성하여 List 인터페이스를 implements 한다.

```java
public class ArrayList<E> implements List<E> {
  private static final int DEFAULT_CAPACITY = 50; // 기본 크기
  private int size; // 요소 개수
  Object[] array;   // 요소를 담을 배열
}
```

**DEFAULT_CAPACITY** : 배열을 생성할 때, 할당할 크기를 지정하지 않았을 때 기본값으로 50 을 주기 위한 상수
**size** : 배열이 담긴 요소의 개수
**array** : 요소를 담을 배열

생성자는 2개를 만든다.
하나는 공간 할당을 미리하지 않고 객체를 만들 때와, 사용할 공간을 명시하였을 때다.

```java
  public ArrayList() {
    this.array = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }

  // 생성자의 용량으로 공간 할당
  public ArrayList(int capacity) {
    this.array = new Object[capacity];
    this.size = 0;
  }
```

## resize 메소드 구현

배열은 고정된 크기이기 때문에 삽입이 일어날 때, 공간이 꽉 차있다면 배열의 크기를 더 할당해야 하고,
반대로 삭제가 계속 일어나면 빈 공간이 많아지기 때문에 이를 관리할 메소드를 구현한다.

```java
private void resize() {
  int arr_capacity = array.length;

  // 배열 길이가 0 일 때
  if(arr_capacity == 0) {
    array = new Object[DEFAULT_CAPACITY]; // 기본 크기 할당
    return;
  }

  // 용량이 꽉 찼을 경우
  if(arr_capacity == size) {
    int new_capacity = arr_capacity * 2;  // 현재 배열 길이 2배 할당

    array = Arrays.copyOf(array, new_capacity); // 배열 복사
    return;
  }

  // 절반이 비어있을 경우
  if(size < (arr_capacity / 2)) {
    int new_capacity = arr_capacity / 2;  // 배열 절반 공간 제거

    array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY)); // 배열 복사
    return;
  }
}
```

## 요소 삽입, add 메소드 구현

삽입을 한다 하였을 때, 총 세 가지 방법이 떠오른다.
처음과 끝, 그리고 중간 삽입이다.

먼저 끝 부분 삽입부터 살펴보자.

### 기본 삽입 `add(E value)`

![캡처](https://user-images.githubusercontent.com/66655578/166445255-82e76784-765c-487e-842a-5fb40b08308b.PNG)

`add(E value)` 는 기본적으로 끝에 삽입하는 것으로 구현하자.

삽입 전에 용량이 꽉 찼는지 먼저 판별하고, 부족하면 `resize` 메소드로 추가 할당 후 삽입해주면 끝이다.
이는 `add(int index, E value)` 메소드에서 끝에 삽입하는 것과도 같으므로 `addLast(E value)` 메소드를 추가 구현한다.

```java
@Override
public boolean add(E value) {
	addLast(value);
	return true;
}
 
public void addLast(E value) {
 
	// 꽉차있는 상태 리사이징
	if (size == array.length)
		resize();
    
	array[size] = value;	// 마지막 위치 요소 추가
	size++;	// 사이즈 1 증가
}
```

### 중간 삽입 `add(int index, E value)`

![캡처](https://user-images.githubusercontent.com/66655578/166446057-eadc6c4e-da15-49a4-92fb-74de57e76a80.PNG)

`add(int index, E value)` 는 `index` 자리에 중간 삽입하는 것을 구현하자.

먼저 삽입 전, `index` 가 배열 범위를 벗어나는지 판별하고 용량이 꽉 차있는지 확인한다.
그 후 삽입할 자리의 요소부터 끝 요소까지의 요소들을 모두 뒤로 한칸 씩 이동 시킨 후, 그 자리에 요소를 저장시킨다.

삽입할 자리가 끝 부분이라면, 이전에 추가 구현한 메소드 `addLast` 를 사용하고 그 외(첫 인덱스 ~ 마지막 인덱스 전)는 동일하다.

```java
@Override
public void add(int index, E value) {
  if(index > size || index < 0) throw new IndexOutOfBoundsException();	

  if(index == size) addLast(value);
  else {
    if(size == array.length) resize();	// 꽉 찼다면 리사이징

    for(int i = size; i > index; i--)	// index 후자의 요소들 한 칸 이동
      array[i] = array[i - 1];

    array[index] = value;	// index 위치에 요소 할당
    size++;
  }
}
```

추가 구현해볼 `addFirst()` 는 어차피 모든 요소를 뒤로 밀어야 하므로 `add(0, value)` 와 같다.

```java
public void addFirst(E value) {
  add(0, value);
}
```

## 요소 검색 및 세팅, get indexOf contains set 구현

### 요소 얻기 `get(int index)`

배열의 범위를 벗어나는지 판별하고, 해당 index 의 요소를 반환한다.

```java
@Override
public E get(int index) {
  if(index >= size || index < 0) throw new IndexOutOfBoundsException();	
  
  return (E) array[index];
}
```

### 요소 인덱스 얻기 `indexOf(Object value)`

찾고자 하는 요소의 인덱스를 반환하는 메소드다.
배열의 처음부터 탐색하며 동일한 객체를 찾았을 때 해당 인덱스를 반환하고 찾고자 하는 요소가 없다면 `-1` 을 반환한다.

```java
@Override
public int indexOf(Object value) {
  int i = 0;

  // 같은 객체 탐색
  for (i = 0; i < size; i++) {
    if (array[i].equals(value)) {
      return i;
    }
  }

  // 일치하는 것이 없을 경우 -1을 반환
  return -1;
}
```

### 요소 포함 여부 `contains(Object value)`

앞서 구현한 `indexOf()` 메소드를 사용하여 `0` 이상을 반환하면 `true`, `-1` 을 반환하면 `false` 를 반환한다.

```java
@Override
public boolean contains(Object value) {
  if(indexOf(value) >= 0) return true;
  else return false;
}
```

### 요소 대체 `set(int index, E value)`

`set` 메소드는 기존 데이터를 새로운 데이터로 교체하는 것으로 매개변수로 받은 인덱스 위치의 데이터를 교체해주면 된다.

```java
@Override
public void set(int index, E value) {
  if (index >= size || index < 0) throw new IndexOutOfBoundsException();
  else array[index] = value;
}
```

## 요소 삭제, remove

### 요소 기본 위치 삭제, `remove(index)` 구현

특정 위치의 요소나 어떤 객체를 찾아 삭제하는 것은 다음과 같다.
앞서 `add` 메소드에서 구현했던 것을 거꾸로 하면 된다.

![image](https://user-images.githubusercontent.com/66655578/166964184-07a9d253-30fa-498c-a4cc-56f81820cdbc.png)

```java
@Override
public E remove(int index) {
 
	if (index >= size || index < 0) throw new IndexOutOfBoundsException();
 
	E element = (E) array[index];	// 삭제될 요소 임시로 담음
	array[index] = null;
    
	// 삭제한 요소의 뒤의 모든 요소들을 한 칸씩 당김
	for (int i = index; i < size - 1; i++) {
		array[i] = array[i + 1];
		array[i + 1] = null;
	}
	size--;
	resize();	// 마지막에 리사이징
	return element;
}
```


### 요소 객체 삭제, `remove(Object value)` 구현

`remove(Object value)` 메소드는 특정 요소를 찾아 삭제하는 것이다.
`indexOf` 메소드로 찾아 삭제하면 쉽다. 찾은 후엔 해당 인덱스로 앞서 작성한 코드 `remove(int index)` 로 재활용한다.

```java
@Override
public boolean remove(Object value) {
	// 삭제하고자 하는 요소의 인덱스 찾기
	int index = indexOf(value);

	// -1이라면 array에 요소가 없다는 의미이므로 false 반환
	if (index == -1) {
		return false;
	}

	// index 위치에 있는 요소를 삭제
	remove(index);
	return true;
}
```

## 각종 기능, size isEmpty clear 구현

### ArrayList 의 사이즈, `size`

현재 사이즈를 반환해주기만 하면 된다.

```java
@Override
public int size() {
	return size;
}
```

### 비었는지 여부, `isEmpty`

해당 메소드는 ArrayList 의 요소가 하나도 없는지 여부를 반환한다.
size 수를 비교하여 반환해주면 된다.

```java
@Override
public boolean isEmpty() {
	return size == 0;
}
```

### 요소 비우기, `clear`

`clear` 메소드는 ArrayList 의 모든 요소를 비우는 작업이다.
배열의 모든 요소를 null 로 초기화하고 사이즈를 0으로 해주고 리사이징 해준다.

```java
@Override
public void clear() {
	// 모두 null 처리
	for (int i = 0; i < size; i++) {
		array[i] = null;
	}
	
	size = 0;
	resize();
}
```
