BinaryTree 구현
===============

먼저, 이진 트리에 필요한 Node 를 구현한다.

Node 구현
=========

노드는 다음과 같이 왼쪽 노드, 아래 노드, 그리고 부모 노드에 대한 정보가 필요하다.

![image](https://user-images.githubusercontent.com/66655578/171425311-fe50f636-2153-4fcf-b0b9-88bf095c4330.png)

그러므로 데이터와 함께 멤버 변수로 parent, left, right 를 각각을 선언한다.

### Node 클래스 및 생성자

```java
class Node<E> {
  private E element;
  private Node<E> parent;
  private Node<E> left;
  private Node<E> right;
  
  public Node(E e) {
    element = e;
    parent = null;
    left = null;
    right = null;
  }
  
  public Node(E e, Node<E> parent) {  // 부모 노드 바로 설정
    element = e;
    this.parent = parent;
    left = null;
    right = null;
  }
}
```

### 게터 세터 설정

나머지는 element, left, right 에 대한 게터와 세터를 선언한다.

```java
	public Node<E> getLeft() {
		return left;
	}

	public void setLeft(Node<E> left) {
		this.left = left;
	}

	public Node<E> getRight() {
		return right;
	}

	public void setRight(Node<E> right) {
		this.right = right;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
	
	public Node<E> getParent() {
		return parent;
	}
	
	public void setParent(Node<E> parent) {
		this.parent = parent;
	}
```

### 부가 기능

부가적으로는 노드의 다음 노드가 비었는지, 꽉 찼는지 여부와 eqauls 를 오버라이드 한다.

```java
	public boolean isEmpty() {
		return left == null && right == null;
	}
	
	public boolean isFull() {
		return left != null && right != null;
	}
	
	@Override
	public boolean equals(Object obj) {
		Node<?> v = (Node<?>) obj;
		return element.equals(v.getElement());
	}
```
