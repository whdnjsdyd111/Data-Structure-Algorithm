Graph 개념
==========

![image](https://user-images.githubusercontent.com/66655578/169550722-887ebb7f-2aa0-4b0f-9ef5-eb5edf58fade.png)

대표적으로 오래된 그래프 문제인 Köenigsberg 다리 문제가 있다.
위와 같은 지형이 있을 때 (A, B, C, D) 지점에서 출발하여 a-f 까지의 모든 다리를 한번씩 건널 수 있는지의 문제이다.

그래프는 소셜 미디어 플랫폼에서 사람들의 네트워크와 같이 연결된 데이터를 저장하거나 위와 같은 상황처럼 객체간의 연결에 대한 데이터 구조이다.
**정점(Vertex)** 와 그 정점들을 연결하는 **간선(Edge)** 으로 이루어져 있다.
일반적으로 그래프를 `G=(V,E)` 로 표현한다.
V(G) 는 그래프 G 의 정점들 집합
E(G) 는 그래프 G 의 간선들 집합을 나타낸다.

## Graph 관련 용어

![image](https://user-images.githubusercontent.com/66655578/169553157-45c4e45f-a1a4-43ac-bfa1-88a20c24648e.png)

- 정점(Vertext) : 노드(Node)라고도 하며 정점에는 데이터가 저장되어 있다. (0, 1, 2, 3)
- 간선(Edge) : 정점(노드)를 연결하는 선으로 link, branch 라고도 한다.
- 인접 정점(Adjacent Vertex) : 간선에 의해 직접 연결된 정점이다. (0, 3) 는 서로 인접정점
- 단순 경로(Simple Path) : 한붓그리기처럼 경로 중 반복되는 정점이 없는 경우다. (0-1-3-2) 는 단순경로
- 차수(Degree) : 무방향 그래프에서 하나의 정점에 인접한 정점의 수다. 0의 차수는 3
- 진출 차수(in-degree) : 방향 그래프에서 외부로 향하는 간선의 수다.
- 진입 차수(out-degree) : 방향 그래프에서 외부에서 들어오는 간선의 수다.
- 경로 길이(Path length) : 경로를 구성하는데 사용된 간선의 수다.
- 사이클(Cycle) : 단순 경로의 시작 정점과 종료 정점이 동일한 경우이다.

## Graph 특징

- 그래프는 네트워크 모델이다.
- 그래프는 인접행렬(Adjacency Matrix) 또는 인접 리스트(Adjacency List) 등으로 표현할 수 있다.
- 지도, 지하철 노선도, 전기회로, 도로상의 최단 경로 찾기 등의 문제에 사용
- 루트(최상단) 노드의 개념, 부모-자식 관계의 개념이 존재하지 않음
- 순회 방법에는 DFS(깊이우선탐색), BFS(너비우선탐색) 등이 존재한다. 이때 스택과 큐의 자료구조를 이용한다.
- 순환, 비순환 모두 가능하며, 자체 간선(self-loop)도 가능하다.

## Graph 종류

### 무방향 그래프(Undirected Graph)

정점들 간의 간선을 나타낼 때 방향이 없는 그래프다.
간선 (x, y) 는 (y, x) 와 동일하다.

![image](https://user-images.githubusercontent.com/66655578/169570580-dd1a3fd9-334c-46be-a8d9-4a0702e710f4.png)

### 방향 그래프(Directed Graph)

정점들 간의 간선을 나타낼 때 방향이 있는 그래프다.
간선 <x, y> 는 <y, x> 와 다르다.

![image](https://user-images.githubusercontent.com/66655578/169572149-897aed0c-46e1-4811-83ce-837974bb5521.png)

V(G) = {A, B, C, D}
E(G) = { <B,A>, <A,C>, <C,D>, <D,B>, <B,D> }

### 연결 그래프(Connected Graph)

무방향 그래프의 모든 정점 쌍에 대해 항상 경로가 존재하는 그래프이다.
모든 노드가 빠짐 없이 간선에 의해 연결되어 있는 상태이다. 대표적으로 Tree 가 있다.

![image](https://user-images.githubusercontent.com/66655578/169696235-74fe4d57-1247-4850-87bb-89c415004537.png)

### 비연결 그래프(Disconnected Graph)

무방향 그래프의 특정 정점 사이에 경로가 존재하지 않는 그래프이다.
모든 노드 중 간선에 연결되지 않은 노드가 있는 상태이다.

![image](https://user-images.githubusercontent.com/66655578/169696289-c9d092c3-df2f-48bb-8ad2-592818f4dc79.png)

### 부분 그래프(Sub Graph)

왼쪽 그래프가 오른쪽 그래프에 포함될 때 부분 그래프라 한다.

![image](https://user-images.githubusercontent.com/66655578/169700993-dc97e930-7446-4712-a77e-d829fb662fc1.png)

### 완전 그래프(Completed Graph)

간선을 최대한으로 가진 그래프이다.
정점이 n개인 그래프가 있다고 하자.
무방향 그래프 최대 간선 수 : n (n - 1) / 2
방향 그래프 최대 간선 수   : n (n 0 1)

![image](https://user-images.githubusercontent.com/66655578/169701256-9494d699-71c4-4d8e-9157-dab9f49ac61a.png)

### 가중치 그래프(Weighted Graph)

가중치 그래프는 두 정점 간의 이동하는데 드는 비용을 나타내는 그래프이다.

![image](https://user-images.githubusercontent.com/66655578/169701322-0b9b66fb-5a7a-4fba-bd84-5aeaddf37eee.png)


## Graph 표현

### 인접행렬(Adjacency Matrix)

### 인접리스트(Adjacency List)

