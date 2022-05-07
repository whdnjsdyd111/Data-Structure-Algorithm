Doubly LinkedList 구현
======================

LinkedList 에 사용된 List.java 인터페이스를 이용한다.

[List.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/ArrayList%20%26%20LinkedList/List.java)

이번에 구현해볼 것은 LinkedList 의 종류인 Doubly LinkedList 를 구현해보자.
Singly LinkedList 는 단일 방향으로 관리하는 것과 달리 Doubly LinkedList 는 **양방향** 으로 연결한다는 차이가 있다.

![image](https://user-images.githubusercontent.com/66655578/167242298-a28c3b02-2ea7-4681-944a-560c721d8f5b.png)

위 그림에서 보이듯, 기존의 Singly LinkedList 는 단방향으로 링크되어 있다면 Doubly LinkedList 는 양방향으로 링크되어있다는 점이다.
그래서 Singly LinkedList 는 처음부터 순회를 하여 탐색했다면 Doubly LinkedList 는 뒤에서 앞으로도 순회가 가능하다.

## Node 구현

먼저 Doubly LinkedList 에 필요한 노드를 구현한다.
양방향으로 링크되다 보니, `next` 참조 뿐만 아니라 `prev` 참조도 필요하다.

```java
class Node<E> {
	E data;
	Node<E> next;
	Node<E> prev;
	
	Node(E data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public void clear() {
		this.data = null;
		this.next = null;
		this.prev = null;
	}
}
```

## Doubly LinkedList 클래스 및 생성자

Doubly LinkedList 의 클래스는 다음과 같다.

```java
public class DoublyLinkedList<E> implements List<E> {

	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
}
```

Singly LinkedList 와 동일하게 첫 부분(`head`) 와 끝 부분(`tail`) 그리고 사이즈 크기를 멤버 변수로 사용한다.

## 노드 탐색, `search` 구현

`add` 함수를 구현 전 `search` 탐색 함수를 먼저 구현한다.
Singly LinkedList 처럼 순회하면서 탐색하는 개념은 같지만 Doubly LinkedList 의 경우는 뒤에서부터 탐색이 가능하다.
그렇기 때문에 탐색할 `index` 위치가 `size` 반틈을 기준으로 앞, 뒤에서 탐색을 할 것이다.

```java
private Node<E> search(int index) {
	if(index >= size || index < 0) throw new IndexOutOfBoundsException();

	if(index <= size / 2) {
		Node<E> n = head;

		for(int i = 0; i < index; i++) {
			n = n.next;
		}

		return n;
	} else {
		Node<E> n = tail;

		for(int i = size - 1; i > index; i--) {
			n = n.prev;
		}

		return n;
	}
}
```

## 요소 삽입, add 구현

더블 링크드 리스트는 싱글 링크드 리스트와 달리 링크해야할 부분이 두 개가 있다는 것에 삽입 방식이 다르다.

### 앞 부분 삽입, `addFirst(E value)`

먼저 Doubly LinkedList 의 가장 앞 노드를 추가하는 것부터 구현한다. 과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167252819-747fcea5-e469-43bf-ae03-eaf61e5e081d.png)

```java
public void addFirst(E value) {
	Node<E> newNode = new Node<>(value);

	if(size == 0) {	// 사이즈가 없다면 head, tail 지정
		head = newNode;
		tail = newNode;
	} else {
		newNode.next = head;
		head.prev = newNode;

		head = newNode;
	}

	size++;
}
```

### 뒷 부분 삽입, `addLast(E value)`

뒷 부분에 노드를 추가하는 과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167253191-30048286-a6b6-4954-86bc-d2ca7ceb3b97.png)

```java
public void addLast(E value) {
	if(size == 0) {
		addFirst(value);
		return;
	}

	Node<E> newNode = new Node<E>(value);
	tail.next = newNode;
	newNode.prev = tail;

	tail = newNode;

	size++;
}
```

`addLast` 메소드를 구현했으니 `add(E value)` 메소드도 구현하자.

```java
@Override
public boolean add(E value) {
	addLast(value);
	return true;
}
```

### 중간 부분 삽입, `add(int index, E value)`

중간 부분에 노드를 삽입하는 과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167254310-14183554-e098-49bd-9f96-6ce096dc4fff.png)

```java
@Override
public void add(int index, E value) {
	if(index >= size || index < 0) throw new IndexOutOfBoundsException();

	if(index == 0) {
		addFirst(value);
		return;
	} else if(index == size) {
		addLast(value);
		return;
	} else {
		Node<E> newNode = new Node<E>(value);
		Node<E> prev = search(index - 1);	// 이전 노드
		Node<E> next = prev.next;		// 다음 노드

		newNode.next = next;
		prev.next = newNode;
		newNode.prev = prev;
		next.prev = newNode;

		size++;
	}
}
```

인덱스를 비교하여 처음이나 끝 삽입일 때는 `addFirst` 와 `addLast` 를 활용하고 그 외의 중간 삽입은 위 이미지의 과정을 거친다.

## 요소 삭제, remove 구현

Doubly LinkedList 에서 삭제하는 것은 양쪽 링크를 모두 끊어야 한다.

### 앞 부분 삭제, `removeFirst()`

앞 부분을 삭제하는 것은 Singly LinkedList 에서 앞 부분을 삭제하는 것과 비슷하다.

head 를 당겨서 지정하고 새로 지정한 head 의 이전 참조를 끊어준다. 그리고, 끊어진 앞부분의 노드를 초기화 시켜준다.

```java
public E removeFirst() {
	if(size == 0) throw new IndexOutOfBoundsException();

	E elem = null;

	Node<E> n = head;
	elem = n.data;

	if(size == 1) {
		head = null;
		tail = null;
	} else {
		Node<E> next = n.next;

		next.prev = null;
		head = next;

	}

	n.clear();
	size--;
	return elem;
}
```

### 뒷 부분 삭제, `removeLast()`

앞 부분을 삭제하는 것과 개념이 동일하다.

tail 을 앞으로 당겨주고 다음 참조를 끊은 후 끊어진 노드를 초기화 시킨다.

```java
public E removeLast() {
	if(size == 0) throw new IndexOutOfBoundsException();

	E elem = null;

	Node<E> n = tail;
	elem = n.data;

	if(size == 1) {
		head = null;
		tail = null;
	} else {
		Node<E> prev = n.prev;

		prev.next = null;
		tail = prev;
	}

	n.clear();
	size--;
	return elem;
}
```

### 특정 위치 삭제, `remove(int index)`

과정은 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/167255193-e2a57af2-0777-4c07-a1b3-6f68d19e3843.png)

이전 노드의 다음 참조를 다음 노드로, 다음 노드의 이전 참조를 이전 노드로 링크하여 중간의 삭제할 노드의 링크를 모두 끊는다.

```java
@Override
public E remove(int index) {
	if(index >= size || index < 0) throw new IndexOutOfBoundsException();

	E elem = null;

	if(index == 0) {
		elem = removeFirst();
	} else if(index == size - 1) {
		elem = removeLast();
	} else {
		Node<E> removedN = search(index);
		Node<E> prev = removedN.prev;
		Node<E> next = removedN.next;

		elem = removedN.data;

		prev.next = next;
		next.prev = prev;

		removedN.clear();
		size--;
	}

	return elem;
}
```

### 특정 요소 삭제, `remove(E value)`

특정 요소 삭제도 특정 위치를 삭제하는 함수와 개념이 동일하다.

```java
@Override
public E remove(int index) {
	if(index >= size || index < 0) throw new IndexOutOfBoundsException();

	E elem = null;

	if(index == 0) {
		elem = removeFirst();
	} else if(index == size - 1) {
		elem = removeLast();
	} else {
		Node<E> removedN = search(index);
		Node<E> prev = removedN.prev;
		Node<E> next = removedN.next;

		elem = removedN.data;

		prev.next = next;
		next.prev = prev;

		removedN.clear();
		size--;
	}

	return elem;
}
```

## 요소 검색 및 세팅, get indexOf contains set 구현

### 요소 얻기 `get(int index)`

앞서 구현한 `search` 함수를 사용한다.

```java
@Override
public E get(int index) {
	return search(index).data;
}
```

### 요소 인덱스 얻기 `indexOf(Object value)`

노드를 처음부터 순회하면서 해당 인덱스를 찾는다.

```java
@Override
public int indexOf(Object value) {
	int index = 0;

	for(Node<E> n = head; n != null; n = n.next, index++) 
		if(value.equals(n.data)) return index;

	return -1;
}
```

### 요소 포함 여부 `contains(Object value)`

앞서 구현한 `indexOf` 함수로 구현한다.

```java
@Override
public boolean contains(Object value) {
	return indexOf(value) >= 0;
}
```

### 요소 대체 `set(int index, E value)`

요소를 대체하는 `set` 함수는 `search` 함수를 활용해 구현한다.

```java
@Override
public void set(int index, E value) {
	search(index).data = value;
}
```

## 각종 기능, size isEmpty clear 구현

### Doubly LinkedList 사이즈  `size`

현재 사이즈를 반환한다.

```java
@Override
public int size() {
	return size;
}
```

### 비었는지 여부 `isEmpty`

`size` 수를 비교하여 반환한다.

```java
@Override
public boolean isEmpty() {
	return size == 0;
}
```

### 요소 비우기 `clear`

Doubly LinkedList 의 모든 요소를 비우기 위해선 노드를 순회하며 앞 뒤 참조를 초기화하고 `head1`, `tail` 를 초기화한다.

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
