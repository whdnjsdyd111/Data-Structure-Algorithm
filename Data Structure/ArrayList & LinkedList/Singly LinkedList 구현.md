Singly LinkedList 구현
======================

ArrayList 에 사용된 List.java 인터페이스를 이용한다.

[List.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/ArrayList%20%26%20LinkedList/List.java)

이번에 구현해볼 것은 LinkedList 의 종류인 Singly LinkedList 를 구현해보자.
ArrayList 는 배열을 사용하는 것과 달리 LinkedList 는 **노드** 객체를 사용하여 서로 연결한다는 차이가 있다.

![image](https://user-images.githubusercontent.com/66655578/167077251-e5d479cf-ab48-4bc9-bc83-f6d1dcf0697d.png)

노드는 위 그림에서 보이듯, 데이터와 다음 노드를 참조하는 참조 데이터가 담겨있다.
이번에 구현할 것은 이러한 LinkedList 중에서 Singly LinkedList 를 구현할 것이다.

## Node 구현

먼저 LinkedList 에 필요한 노드를 구현한다.
데이터를 담을 변수와 다음 노드를 참조할 변수를 생성하고, 노드를 제거했을 때 null로 처리할 `clear` 함수도 작성한다.

```java
class Node<E> {
	E data;
	Node<E> next;
	
	Node(E data) {
		this.data = data;
		this.next = null;
	}
}
```

## Singly LinkedList 클래스 및 생성자

Singly LinkedList 의 클래스는 다음과 같다.

```java
public class SinglyLinkedList<E> implements List<E> {
  private Node<E> head; // 노드 첫 부분
  private Node<E> tail; // 노드 마지막 부분
  private int size;     // 요소 개수
  
  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
}
```

앞서 그림으로 설명한 부분을 보면 **head** 와 **tail** 이 있는데, 각각은 리스트의 첫 부분과 마지막 노드를 가리키는 변수이다.

## 노드 탐색, `search` 구현

먼저 `add` 함수를 구현하기 전에 `search` 함수를 먼저 작성한다.
LinkedList 는 배열을 사용하지 않아 인덱스(몇 번째인지) 개념이 없어 add, remove 등의 함수에서 검색할 때 공통적으로 해당 위치를 찾을 함수가 필요하다.

미리 `search` 를 구현하면 편리하므로 작성해보자.

```java
private Node<E> search(int index) {
  // 범위 밖은 예외 발생
  if(index >= size || index < 0) throw new IndexOutOfBoundsException();

  Node<E> n = head; // 처음부터 순회하기 위해 헤드 저장

  for (int i = 0; i < index; i++) {
    n = n.next; // n 노드에 다음 노드를 저장하며 처음부터 순회
  }

  return n;
}
```

## 요소 삽입, add 구현

연결리스트는 **링크**로 연결된 리스트이기 때문에 어레이 리스트와는 삽입 방식이 다르다.

### 앞 부분 삽입, `addFirst(E value)`

먼저 LinkedList 의 가장 앞에 노드를 추가하는 것부터 구현하자.
과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167140789-57fb3597-f319-427c-aea7-4b251d97a15b.png)

새로 생성한 노드를 head 에 연결하고 head 를 새로운 노드를 가리키게 한다.

```java
public void addFirst(E value) {
  Node<E> newNode = new Node<>(value);
  newNode.next = head;
  head = newNode;
  size++;

  if(head.next == null) tail = head; // 첫 삽입이라면 head tail 같도록
}
```

### 끝 부분 삽입, `addLast(E value)`, `add(E value)`

가장 뒷 부분에 노드를 추가하는 것을 구현해본다.
과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167156367-af1aa35c-2ddb-45ec-968b-73a32e1c90d8.png)

새 노드를 tail 의 다음 노드로 연결하고 tail 을 새로운 노드로 참조하도록 한다.

```java
public void addLast(E value) {
  if(size == 0) {
    addFirst(value);
    return;
  }

  Node<E> newNode = new Node<>(value);
  tail.next = newNode;
  tail = newNode;
  size++;
}
```

`addLast` 메소드를 구현하였으므로 일반적으로 사용되는 `add(E value)` 메소드를 구현해보자.
`addLast` 메소드를 호출한 후 `true` 를 리턴해준다.

```java
@Override
public boolean add(E value) {
  addLast(value);
  return true;
}
```

### 중간 부분 삽입, `add(int index, E value)`

노드를 LinkedList 중간에 삽입하는 것을 구현해본다.
과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167161974-c1df2057-348c-4ba9-a3b8-b27d04bb0463.png)

주의할 점은, 2번과 3번 과정의 순서를 봐야한다는 것이다.
3번 과정이 먼저 시행된다면 50 데이터의 노드의 다음 노드가 새 노드로 지정되어 33 데이터 노드와의 연결이 먼저 끊어져 연결점이 사라진다는 점이다.

```java
	@Override
public void add(int index, E value) {
  if(index > size || index < 0) throw new IndexOutOfBoundsException();

  if(index == 0) {  // 첫 부분 삽입
    addFirst(value);
    return;
  } else if(index == size) {  // 끝부분 삽입
    addLast(value);
    return;
  } else {
    Node<E> newNode = new Node<E>(value);
    Node<E> prev = search(index - 1);

    newNode.next = prev.next;
    prev.next = newNode;
    size++;
  }
}
```
 
## 요소 삭제, remove 구현

LikedList 에서 삭제하는 개념은 ArrayList 와 달리 링크를 끊는 것이다.

### 특정 위치 삭제, `remove(int index)`

먼저, 과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167165505-b9436c48-cc00-4165-8d0e-88d3ccef45b2.png)

이전 노드가 참조하는 다음 노드를 삭제할 노드의 다음 노드로 참조하도록 하여 연결을 끊어버리게 하는 것이다.
처음(head) 와 끝(tail) 부분을 삭제하게 된다면 처음과 끝을 한 칸씩 땡기도록 하면 된다.

```java
@Override
public E remove(int index) {
  if(index >= size || index < 0) throw new IndexOutOfBoundsException();

  E elem = null;

  if(index == 0) {
    Node<E> n = head;
    elem = n.data;
    head = n.next;

    if(head == null) tail = null; // 모두 삭제된 상태면 tail 도 null 처리

    n.clear();
    size--;
  } else {
    Node<E> prev = search(index - 1);
    Node<E> removedN = prev.next;
    elem = removedN.data;

    if(removedN.next == null) {	// 마지막 노드라면 tail 처리
      tail = prev;
      prev.next = null;
    } else prev.next = removedN.next;	// 연결 끊기

    removedN.clear();
    size--;
  }

  return elem;
}
```

### 특정 요소 삭제, `remove(E value)`

해당 함수도 위에서 살펴본 특정 위치로 삭제하는 개념과 동일하다.

```java
@Override
public boolean remove(Object value) {
  Node<E> prev = head;

  if(value.equals(head.data)) {
    remove(0);
    size--;
    return true;
  }

  while(prev != null) {
    Node<E> removedN = prev.next;

    if(removedN != null && value.equals(removedN.data)) {
      if(removedN.next == null) {	// 마지막 노드라면 tail 처리
        tail = prev;
        prev.next = null;
      } else  prev.next = removedN.next;

      removedN.clear();
      size--;
      return true;
    }

    prev = prev.next;
  }

  return false;
}
```

## 요소 검색 및 세팅, get indexOf contains set 구현

### 요소 얻기 `get(int index)`

앞서 미리 구현해놓은 `search` 함수를 사용한다.

```java
@Override
public E get(int index) {
  return search(index).data;
}
```

### 요소 인덱스 얻기 `indexOf(Object value)`

index 변수를 0으로 지정해놓고 노드를 처음부터 탐색하며 인덱스를 증가시키며 찾는다.
찾지 못하였을 때는 `-1` 을 반환시킨다.

```java
@Override
public int indexOf(Object value) {
  int index = 0;

  for (Node<E> n = head; n != null; n = n.next) {
    if (value.equals(n.data)) return index;

    index++;
  }

  return -1;
}
```

### 요소 포함 여부 `contains(Object value)`

앞서 구현한 `indexOf` 함수를 이용하여 쉽게 구현하자.

```java
@Override
public boolean contains(Object value) {
  return indexOf(value) >= 0;
}
```

### 요소 대체 `set(int index, E value)`

요소를 대체하는 `set` 함수는 `search` 함수를 활용하여 쉽게 구현한다.

```java
@Override
public void set(int index, E value) {
  search(index).data = value
}
```

## 각종 기능, size isEmpty clear 구현

### LinkList 의 사이즈, `size`

현재 사이즈를 반환해주기만 하면 된다.

```java
@Override
public int size() {
	return size;
}
```

### 비었는지 여부, `isEmpty`

해당 메소드는 LinkedList 의 요소가 하나도 없는지 여부를 반환한다.
size 수를 비교하여 반환해주면 된다.

```java
@Override
public boolean isEmpty() {
	return size == 0;
}
```

### 요소 비우기, `clear`

`clear` 메소드는 LinkedList 의 모든 요소를 비우는 작업이다.
노드를 순회하면서 모두 null 로 초기화하여 없애도록 한다.

```java
@Override
public void clear() {
		for (Node<E> x = head; x != null;) {
			Node<E> next= x.next;
			x.clear();
			x = next;
		}
		
		head = tail = null;
		size = 0;
}
```
