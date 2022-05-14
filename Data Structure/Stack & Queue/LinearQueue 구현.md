Queue 구현
==========

[Queue.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Stack%20%26%20Queue/Queue.java)

실제 자바의 컬렉션 프레임워크에는 이 보다 더 많은 메소드가 존재하지만, 최소한의 핵심 메소드만으로 구현해보고자 한다.
추후 선형 큐, 원형 큐, 덱크를 구현하기 위해 미리 인터페이스를 작성하자.

## 선형 큐 클래스 및 생성자

선형 큐 클래스를 생성한다.

```java
public class LinearQueue<E> implements Queue<E> {
  private int front;
  private int rear;
  private int size;
  private Object[] array;
  
  public LinearQueue(int size) {
    this.front = -1;
    this.rear = -1;
    this.size = -1;
    array = new Object[size];
  }
}
```

큐는 양쪽 끝에서 삽입과 제거가 일어난다고 했다. 
삽입이 일어나는 `rear`, 제거가 일어나는 `front` 를 각각 정의하고 생성자에서는 어느 인덱스도 가리키지 않도록 `-1` 로 초기화한다.

## 선형 큐 상태, isEmpty isFull size 메소드 구현

먼저, 큐의 요소가 비었는지, 꽉찼는지 메소드를 구현한다.
앞서 큐의 특징에서 살펴본대로 `front` 와 `rear` 은 1씩 증가한다는 점을 기억하자.

![image](https://user-images.githubusercontent.com/66655578/168410473-a024e8fe-5c07-4ac2-b107-3ebea442bebd.png)

먼저 5 사이즈의 큐를 살펴보자.
`rear` 가 `size - 1` 이면 꽉찼다면 요소가 꽉 찬 경우이고,
`front` 와 `rear` 의 위치가 동일하다면 요소가 비어있는 경우이다.
현재 요소의 크기는 `rear` 위치에서 `front` 위치를 빼면 해당 큐의 요소 개수가 된다.

```java
@Override
public boolean isFull() {
  return rear == size - 1;
}

@Override
public boolean isEmpty() {
  return front == rear;
}

@Override
public int size() {
  return rear - front;
}
```

## 요소 삽입, enqueue 메소드 구현

큐는 rear 값을 증가시키며 요소를 삽입해야 한다.

```java
@Override
public E enqueue(E item) {
  if(isFull()) {
    System.out.println("큐 오버플로우!!");
    return null;
  }
  
  array[++rear] = item;
  return item;
}
```

## 요소 제거, dequeue 메소드 구현

`front` 을 앞으로 전진시켜 해당 요소를 제거한다.

```java
@Override
public E dequeue() {
  if(isEmpty()) {
    System.out.println("큐 언더플로우!!");
    return null;
  }
  
  Object obj = array[++front];
  return (E) obj;
}
```

## 요소 얻기, peek 메소드 구현

현재 `front` 는 제거된 곳을 가리키므로 그 앞의 요소를 반환한다.

```java
@Override
public E peek() {
  if(isEmpty()) return null;
  
  return (E) array[front + 1];
}
```
