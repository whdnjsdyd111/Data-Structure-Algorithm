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

