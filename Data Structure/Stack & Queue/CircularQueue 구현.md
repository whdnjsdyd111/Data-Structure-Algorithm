CircularQueue 구현
==================

[Queue.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Stack%20%26%20Queue/Queue.java)

이전에 LinearQueue 에서 사용한 인터페이스를 사용하자.

원형 큐는 선형 큐의 한계(재사용 불가)를 해결하기 위해 구조화한 것이다.

## 원형 큐 클래스 및 생성자

원형 큐 클래스를 생성한다.

```java
public class CircularQueue<E> implements Queue<E> {
  private int front;
  private int rear;
  private int size;
  private Object[] array;
  
  public CircularQueue(int size) {
    this.front = 0;
    this.rear = 0;
    this.size = size + 1;
    array = new Object[this.size];
  }
}
```

원형 큐는 삽입과 제거가 지속적으로 일어날 수 있도록 원형 형태를 띄고 있다고 했다.
이를 지속적으로 유지하기 위해서는 한 자리의 빈 자리가 필요하다. 이유는 다음과 같다.

![image](https://user-images.githubusercontent.com/66655578/168614529-84c542e3-527e-410c-b8ab-c4ed0efc1769.png)

선형 큐에서는 `front` 와 `rear` 이 같은 자리에 있으면 빈 상태인 것으로 판단했다.
원형 큐에서도 두 위치가 같으면 처음엔 빈 상태일 수 있지만 한 바퀴 돈 상태(포화상태)에서도 위와 같이 빈 상태로 판단될 것이다.
이와 같은 상황을 배제하기 위해선 비어있는 한 자리가 필요하다. 그렇기 때문에 `size` 를 하나 더한 값으로 배열을 구축한다.

## 원형 큐 상태, isEmpty isFull size 메소드 구현

먼저, 원형 큐의 요소가 비었는지, 꽉 찼는지, 요소 개수가 몇 개인지 구현한다.

앞서 말했듯 빈 상태는 `front` 와 `rear` 가 같은지 판단하고 포화상태는 `rear` 에 1 을 더하고 나머지 계산한 것이 현재 `front` 의 나머지 계산과 같으면 포화상태이다.
요소의 개수는 `rear` 에 `front` 을 뺀 값이다.

```java
@Override
public boolean isEmpty() {
  return front == rear;
}

@Override
public boolean isFull() {
  return front % size == (rear + 1) % size;
}

@Override
public int size() {
  return rear - front;
}
```

## 요소 삽입, enqueue 메소드 구현

원형 큐는 기본적으로 순환하기 위해서 나머지 연산을 사용해 계산한다.
`rear` 을 1 증가 시킨 후 `size` 로 나머지를 계산한다.

```java
@Override
public E enqueue(E item) {
  if(isFull()) {
    System.out.println("큐 오버플로우!!");
    return null;
  }

  array[++rear % size] = item;
  return item;
}
```

## 요소 제거, dequeue 메소드 구현

삽입과 반대로 `front` 를 1 증가 시키고 `size` 로 나머지 계산을 한다.

```java
@Override
public E dequeue() {
  if(isEmpty()) {
    System.out.println("큐 언더플로우!!");
    return null;
  }

  Object obj = array[++front % size];
  return (E) obj;
}
```

## 요소 얻기, peek 메소드 구현

현재 `front` 에 `size` 로 나머지한 값이 현재 값이다.

```java
@Override
public E peek() {
  if(isEmpty())
    return null;

  return (E) array[front % size];
}
```
