# Stack & Queue 구조

![image](https://user-images.githubusercontent.com/66655578/167875436-824ac8b8-be9e-4d94-8138-9c262eac01a6.png)

### Stack 특징

- **한 쪽 끝**에서만 자료를 넣거나 빼는 구조. 가장 나중에 쌓인 데이터가 가장 먼저 빠져 나감(후입선출, **LIFO**)
- 가장 위 요소인 `top` 에만 접근 가능
- `top` 에만 접근하여 접근, 삽입, 삭제 빠르지만 이외의 데이터는 탐색 불가능
- 주요 기능으로 데이터를 넣는 `push`, 데이터를 꺼내는 `pop`
- 스택이 비었을 때 `pop` 시도 시 `underflow`, 스택이 꽉 찼을 때 `push` 시도 시 `overflow` 가 발생
- 활용 범위 : 재귀 알고리즘, DFS 알고리즘, 역추적 작업, 후이 연산법

### Queue 특징

- **양 쪽 각각에서 삽입과 삭제**가 이루어짐(선입선출, **FIFO**)
- 삽입되는 곳을 `rear`, 제거되는 곳을 `front`
- 주요 기능으로 데이터를 넣는 `Enqueue`, 데이터를 꺼내는 `Dequeue`
- 스택과 마찬가지로 중간의 데이터는 탐색 불가능
- 스택과 마찬가지로 `underflow`, `overflow` 발생
- 활용 범위 : BFS 알고리즘, 프로세스 관리, 대기 순서 처리

큐에는 여러 종류의 큐가 존재한다.

1. Linear Queue 선형 큐

![image](https://user-images.githubusercontent.com/66655578/167885597-1b6d1f7b-d134-4b07-a673-4d7461124101.png)

선형 큐는 선형 구조로 `front` 와 `rear` 를 증가만 시키는 방식이다.
포인터가 끝에 도달해있다면 새 요소를 더 이상 삽입할 수 없기 때문에 새로 초기화 해야한다.

2. Circular Queue 원형 큐

![image](https://user-images.githubusercontent.com/66655578/167891442-dda020c6-9b3e-4adc-8533-ab9010ba7ea6.png)

원형 큐는 끝에 도달하면 더 이상 요소를 삽입할 수 없는 선형 큐의 단점을 보완하기 위한 큐이다.
끝에 도달하더라도 데이터가 비었다면 포인터가 다시 처음으로 돌아올 수 있기 때문에 지속적인 삽입이 가능하다.

3. Deque 덱/데크

![image](https://user-images.githubusercontent.com/66655578/167892316-7aa7e0a3-d385-46a0-b113-b3cbc912d670.png)

덱도 선형 큐의 단점을 보완하기 위한 큐이다.
양 쪽 모두 삽입, 제거가 가능한 큐이다.

# Stack & Queue 성능지표

-|Stack|Queue|
---|---|---|
검색|-|-|
추가|O(1)|O(1)|
제거|O(1)|O(1)|
