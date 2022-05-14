Stack 구현
==========

## Stack 클래스 및 생성자

Stack 클래스를 생성한다.

```java
public class Stack<E> {
  private int size; // 사이즈
  private int top;  // 스택의 꼭대기 위치
  private Object array[]; // 배열
  
  public Stack(int size) {
    this.size = size;
    this.top = -1;
    this.array = new Object[size];
  }
}
```

이번에 구현해볼 스택은 먼저 배열에 초점을 둔 스택을 구현할 것이다.
꼭대기(접근되는 포인트)부분은 `top` 을 통해 접근될 것이다.

## 스택 상태, isEmpty isFull size 메소드 구현

먼저, 스택의 요소가 비었는지, 꽉 찼는지에 대한 메소드를 구현한다.
앞서 말한 `top` 은 처음에 -1 로 시작하는 점을 기억해야 한다.

```java
public boolean isEmpty() {
  return top == -1;
}
```

```java
public boolean isFull() {
  return top == size - 1;
}
```

사이즈를 반환하는 함수는 다음과 같다.

```java
public int size() {
  return size;
}
```

## 요소 삽입, add 메소드 구현

스택은 앞서 말했듯, 끝 부분에서만 삽입이 이루어진다는 것을 명심해야 한다.

![image](https://user-images.githubusercontent.com/66655578/168311364-17ea3211-9c23-4b36-9d1b-bde8ad22c871.png)

```java
	public E push(E item) {
		if(isFull()) throw new StackOverflowError();
		
		stack[++top] = item;
		return item;
	}
```

배열의 마지막 위치에 item 릇 삽입한다.
스택이 꽉 찼다면, `StackOverflowError` 예외를 발생시킨다.

## 요소 삭제, pop 메소드 구현

제거는 끝 부분의 요소를 삭제하며 그 요소를 반환해준다.

![image](https://user-images.githubusercontent.com/66655578/168325001-b72267ea-7aa4-4206-9b1c-45468e40e73b.png)

```java
public E pop() {
  if(isEmpty()) throw new EmptyStackException();
  
  Object obj = stack[top--];
  return (E) obj;
}
```

배열이 빈 상태에서 요소를 제거하려고 한다면 `EmptyStackException` 을 발생시킨다.

## 요소 얻기, peek 메소드 구현

```java
public E peek() {
  if(isEmpty()) return null;
  
  return (E) stack[top];
}
```

요소가 비어있다면 null 을 반환하고, 요소가 존재한다면 가장 마지막 요소를 반환해준다.

