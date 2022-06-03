먼저, 이진 탐색 트리에 필요한 Node 를 구현한다.

Node 구현
=========

노드는 다음과 같이 왼쪽 노드, 아래 노드, 그리고 부모 노드에 대한 정보가 필요하다.

![image](https://user-images.githubusercontent.com/66655578/171425311-fe50f636-2153-4fcf-b0b9-88bf095c4330.png)

그러므로 데이터와 함께 멤버 변수로 parent, left, right 를 각각을 선언한다.

### Node 클래스 및 생성자

```java
public class Node<E> {
  protected E element;
  protected Node<E> parent;
  protected Node<E> left;
  protected Node<E> right;
  
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
left 와 right 를 설정할 때는 부모를 자신으로 할 필요도 있다.

```java
	public Node<E> getLeft() {
		return left;
	}

	public void setLeft(Node<E> left) {
		this.left = left;
		if(left != null) left.parent = this;
	}

	public Node<E> getRight() {
		return right;
	}

	public void setRight(Node<E> right) {
		this.right = right;
		if(right != null) right.parent = this;
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

### 부모와의 관계

부모에게 왼쪽인지, 오른쪽인지 판별할 필요가 있다.

```java
	public boolean isLeftChild() {
		if(parent == null) return false;
		return this == parent.left;
	}
	
	public boolean isRightChild() {
		if(parent == null) return false;
		return this == parent.right;
	}
	

	public String getHand() {
		if(isLeftChild()) return "L";
		if(isRightChild()) return "R";
		return "Root";
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

BinraySearchTree 구현
==============

### BinraySearchTree 클래스 및 생성자

트리는 `root` 에서 왼쪽, 오른쪽으로 뻗어 나가므로 root 가 필요하다. root 에 대한 게터와 세터를 추가하자.
추가로 size 와 `Comparator` 객체를 추가한다.

이진트리는 루트에서 작으면 왼쪽, 크면 오른쪽으로 뻗어나가면서 삽입한다.
이를 위해 객체를 삽입하기 위해서는 비교할 객체가 필요하게 된다. 그래서 `MyComparator` 비교 객체를 추가한다.

```java
public class BinarySearchTree<E> {
	protected Node<E> root;
	private int size;
	
	private static interface MyComparator<T> {
		boolean compare(T t1, T t2);
	}
	
	/**
	 *
	 * compare - t1 이 t2 보다 작으면 true 를 리턴 하도록 유도
	 *
	 * @param <T>
	 */
	private MYComparator<E> comp;
	public final MyComparator<? extends Number> DEFAULT_COMP = (t1, t2) -> t1.doubleValue() < t2.doubleValue();	// 기본 비교
	
	public BinarySearchTree(E e) {
		if(Number.class.isInstance(e)) comp = (MyComparator<E>) DEFAULT_COMP;
		else System.out.println("Comparator 구현 필요");
		Node<E> root = new Node<>(e);
		this.root = root;
		size = 1;
	}
	
	public BinarySearchTree(MyComparator<E> comp) {
		this.comp = comp;
		size = 0;
	}
	
	public BinarySearchTree(E e, MyComparator<E> comp) {
		Node<E> root = new Node<>(e);
		this.root = root;
		this.comp = comp;
		size = 1;
	}
	
	public void setRoot(E e) {
		if(root == null) root = new Node<>(e);
		else root.element = e;
	}
	
	public E getRoot() {
		if(root == null) return null;
		else return root.element;
	}
}
```

### 노드 추가, insert

![image](https://user-images.githubusercontent.com/66655578/171866366-e07dfbaa-cb80-4a61-b531-94f7a140724d.png)

위와 같은 트리에 9를 추가한다고 가정하자.

먼저 루틴은, 위에서 부터 시작하여 노드와 비교하여 작으면 왼쪽, 크면 오른쪽 으로 이동한다.
위 루틴을 반복하여 더 이상 갈 곳이 없으면 해당 자리에 추가하는 방식이다.

이는 반복문으로 구현할 수 있지만 재귀함수를 사용하면 더 쉽게 구현할 수 있다.

```java
private void insert(E e, Node<E> root) {
	if(comp.compare(e, root.element)) {	// 비교
		if(root.left == null) {		// 왼쪽 노드가 없다면 갈 곳 없으므로 추가
			Node<E> newNode = new Node<>(e, root);
			root.left = newNode;
		} else insert(e, root.left);	// 왼쪽 노드가 있다면 다시 비교해야 하므로 재귀
	} else {
		if(root.right == null) {	// 동일
			Node<E> newNode = new Node<>(e, root);
			root.right = newNode;
		} else insert(e, root.right);
	}
}
```

삽입은 루트부터 비교해야 하므로 위 메서드는 private 로 지정하고 실제 삽입 메서드는 다음과 같다.

```java
public boolean insert(E e) {
	if(root == null) {
		setRoot(e);
		return true;
	}
	
	insert(e, this.root);
	
	size++;
	return true;
}
```


### 노드 탐색, search

![image](https://user-images.githubusercontent.com/66655578/171866179-c2bdb7c3-38d2-4ebb-88e6-a2fb50801cdc.png)

파라미터로 받은 입력값이 루트에서 시작하여 크면 오른쪽, 작으면 왼쪽으로 이동시키며 값이 일치하는 노드를 리턴시킨다.

```java
public Node<E> search(E e){
	Node<E> search = root;
	Node<E> temp = new Node<>(e);

	while(search != null) {
		if(search.equals(temp)) return search;

		if(comp.compare(temp.element, search.element)) {
			search = search.left;
		} else {
			search = search.right;
		}
	}

	return null;
}
```

편의성을 위해 탐색할 노드가 존재하는지 불 값을 리턴하는 메소드도 추가해준다.

```java
public boolean find(E e) {
	return search(e) != null;
}
```

### 트리 최댓값, 최솟값 탐색 minNode maxNode

![image](https://user-images.githubusercontent.com/66655578/171867666-bde2fed7-ac59-4fec-9505-bc3adef9df5f.png)

특정 노드에서 최솟값 또는 최댓값을 찾는 것은 계속 왼쪽 또는 오른쪽으로 이동시키면 된다.
이 기능은 재귀함수로 쉽게 구할 수 있다.

```java
public Node<E> minNode(Node<E> node) {
	if(node.left == null) return node;
	else return minNode(node.left);
}

public Node<E> maxNode(Node<E> node){
	if(node.right == null) return node;
	else return maxNode(node.right);
}
```

편의성을 위해 파라미터가 없다면 루트부터 탐색하는 오버로드를 작성하자.

```java
public Node<E> minNode() {
	return minNode(root);
}

public Node<E> maxNode() {
	return maxNode(root);
}
```

### 노드 삭제, delete

이진 탐색 트리에서 특정 노드를 삭제할 때 3가지 상황에 따라 삭제하는 방법이 달라진다.

case 1. 자식 노드가 없을 때

![image](https://user-images.githubusercontent.com/66655578/171869828-92b6d3f2-fc63-411a-87cd-47edefc19c74.png)

위 이미지와 같이 부모와의 연결을 끊으면 된다.

case 2. 자식 노드가 하나일 때

![image](https://user-images.githubusercontent.com/66655578/171870083-35d69216-6798-4405-960a-4e31652b8360.png)

위 이미지와 같이 부모의 연결을 자식과 연결시켜 중간에 삭제할 노드를 탐색할 수 없도록 연결을 끊는다.

case 3. 자식 노드가 찼을 때

제일 복잡한 삭제이다. 다음을 살펴보자.

![image](https://user-images.githubusercontent.com/66655578/171871044-099896b5-f6a6-4b7a-b9d3-30a5edda49a3.png)

자식 노드가 모두 차있을 때 왼쪽 또는 오른쪽 자식 중 **제일 작은 값** 을  삭제할 노드에 대체를 한다.
그런 다음, 대체된 노드 자리를 다시 삭제하는 반복작업이 있다.

대체된 노드의 자리는 재귀함수를 통해 다시 삭제작업을 이루어지도록 하면 구현하기 쉽다.

작은 값을 탐색할 때 왼쪽 오른쪽은 구현자의 마음이다. 일반적으로 오른쪽으로 행해지므로 여기서도 오른쪽으로 구현한다.

```java
public boolean delete(Node<E> node) {
	if(node == null) return false;

	if(node.isFull()) {	// case 3
		Node<E> min = minNode(node.right);	// 오른쪽 min 노드
		node.element = min.element;		// 삭제할 자리에 작은 값 대체
		delete(min);				// 대체된 자리는 재귀함수로 삭제
	} else if(node.isEmpty()) {	// case 1
		if(node.isRightChild()) node.parent.setRight(null);	// 오른쪽 왼쪽 판별하여 연결 끊음
		else if(node.isLeftChild()) node.parent.setLeft(null);
		else root = null;
	} else {	// case 2
		Node<E> child = node.right == null ? node.left : node.right;	// 오른쪽 왼쪽 판별하고
		Node<E> parent = node.parent;					// 부모와 연결 끊음

		if(node.isRightChild()) parent.setRight(child);
		else if(node.isLeftChild()) parent.setLeft(child);
		else {
			root = child;
			root.parent = null;
		}

	}
	size--;
	return true;
}
```

위 코드에서 보이듯 삭제할 노드가 root 일 때도 잘 판별하여 삭제해주자.
그렇지 않으면 `parent[=null 임]` 에 대한 도트 연산자는 널 포인트 익셉션을 발생시킬 것이다.

편의를 위해 노드가 아닌 데이터를 받아 삭제하는 메서드도 추가하자.

```java
public boolean delete(E e) {
	return delete(search(e));
}
```

### 깊이와 높이, height depth

먼저 높이부터 살펴보자.

![image](https://user-images.githubusercontent.com/66655578/171877666-a5f5e3b2-6193-41d6-9ca1-e8383c29cbfd.png)

위와 같이 각각의 노드마다 높이라는 성질을 가진다.
말 그대로 몇 층에 위치해 있다는 높이이며, 특정 노드에서 시작하여 **자식 노드가 있는 방향**으로 계속 나아가 끝에 도달했을 때의 높이를 구하면 된다.

이를 재귀함수로 나타내면 구현하기 쉽다.

```java
public int height(Node<E> node) {
	if(node == null || node.isEmpty()) return 0;
	return 1 + Math.max(height(node.left), height(node.right));
}
```

왼쪽 노드로 재귀함수, 오른쪽 노드로 재귀함수를 실행시켜 큰 값(가장 높은 높이)를 리턴하도록 한다.

편의성을 위해 특정 값에서, 그리고 루트에서의 높이를 리턴하는 메서드를 작성하자.

```java
public int height() {
	return height(root);
}

public int height(E e) {
	Node<E> node = search(e);
	if(node == null) return -1;
	else return height(node);
}
```

깊이 depth 를 살펴보자.

![image](https://user-images.githubusercontent.com/66655578/171879750-516a0053-ac84-489d-947b-bb5a20f53388.png)

깊이란, 루트에서부터 몇개의 간선을 거쳐서 도달하는지에 대한 값이다.
그래서 위 이미지를 예로 들면, 루트로부터 2개의 간선을 거치므로 13의 depth 는 2이다.

높이와는 반대로 자식으로 뻗어나가는 것이 아닌, 특정 노드로부터 **부모 방향**으로 뻗어나가서 나아간 개수를 리턴하면 된다.
해당 기능도, 재귀함수로 쉽게 구할 수 있다.

```java
public int depth(Node<E> node) {
	if(node.parent == null) return 0;
	return 1 + depth(node.parent);
}
```

편의를 위해 특정 값에서 깊이를 리턴하는 메서드도 작성하자.

```java
public int depth(E e) {
	Node<E> node = search(e);
	if(node == null) return -1;
	else return depth(node);
}
```

### 그외 편의 기능

현재 사이즈를 리턴하는 메서드를 작성하자.

```java
public int size() {
	return size;
}
```

이진 탐색 트리를 트리 형태로 출력하는 메서드를 작성해보자.
특정 노드를 깊이만큼 들여쓰기하고 노드의 정보를 출력한 후, 왼쪽과 오른쪽 노드를 각각 재귀함수로 문자열을 더하는 형태로 진행한다.

```java
public String treeString(Node<E> node) {
	String s = "";
	
	for(int i = 0; i < depth(node); i++) {
		s += "\t|";
	}
	
	s+= ("<" + node.element + " : " + node.getHand() + ">\n");
	
	if(node.left != null) s += treeString(node.left);
	if(node.right != null) s += treeString(node.right);
	
	return s;
}
```

편의를 위해 루트에서 트리를 출력하는 메서드를 마지막으로 작성하자.

```java
public String treeString() {
	return treeString(root);
}
```

```java
BinarySearchTree<Integer> bst = new BinarySearchTree<>(10);
bst.insert(5);
bst.insert(4);
bst.insert(3);
bst.insert(9);
bst.insert(15);
bst.insert(17);
bst.insert(12);
bst.insert(13);

System.out.println(bst.treeString());
```

위 트리를 출력하면 다음과 같이 출력된다.

```
<10 : Root>
	│<5 : L>
	│	│<4 : L>
	│	│	│<3 : L>
	│	│<9 : R>
	│<15 : R>
	│	│<12 : L>
	│	│	│<13 : R>
	│	│<17 : R>
```
