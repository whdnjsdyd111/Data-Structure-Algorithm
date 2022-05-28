GraphList 구현
==============

사전에 아래와 같은 Vertex 클래스를 작성한다.

[Vertex.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/Vertex.java)

위 정점 클래스는 데이터를 저장하고, 방문 여부에 관한 정보를 가진다.

추가로 Edge 클래스를 작성한다.

[Edge.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/Edge.java)

위 간선 클래스는 두 정점 사이의 간선에 대한 정보를 가지는 클래스이다.
멤버 변수로 두 정점 데이터를 가지며, 방향 또는 무방향 간선에 대한 정보를 나타내기 위해 방향 여부를 포함하고 있다.
물론 간선의 방문 여부도 포함하고 있다.

간선에 대한 라벨링을 할 수 있어 추후에 가중치 개념을 추가할 수 있다.

![image](https://user-images.githubusercontent.com/66655578/170816177-3bc45d12-8a72-4f1d-bd0c-93eef2bfae61.png)

마지막으로 Gpraph 인터페이스를 추가한다.

[Graph.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/Graph.java)

그래프 인터페이스는 정점 추가, 간선 연결 등의 추상 메소드를 가지는 인터페이스이다.
이를 통해 인접리스트와 인접행렬을 각각 구현한다.
이번에 알아볼 그래프는 인접 리스트를 통해 구현하는것으로, 무방향 또는 방향 그래프의 공통적인 부분을 구현한다.

GraphListVertex 구현
====================

인접 리스트에 대해 간략하게 개념을 짚고 넘어가면, 배열을 사용하는 인접 행렬과 다르게 리스트는 말 그대로 리스트를 이용한다.

![image](https://user-images.githubusercontent.com/66655578/169703346-ce4420b2-d1be-4464-8ce0-69f3ee62add7.png)

자바 컬렉션 프레임워크의 리스트를 바로 사용할 수 있지만, 그래프의 기능들을 탑재한 형태로 구현을 하기 위해서 범위를 확장하여 구현을 진행하자.

그러기 위해선 먼저 GraphListVertex 클래스를 구현한다.

## GraphListVertex  클래스 및 생성자

GraphListVertex 클래스를 생성하고 생성자 및 필드를 살펴보자.

위 그림과 같이 한 정점에 연결된 정점들을 리스트로 표현한다.
해당 리스트가 어느 정점의 리스트인지 정확히 표기하기 위해 GraphListVertex 는 정점을 상속하고 라벨링이 가능하도록 한다.

위 작업을 통해 생성자에 `super(key)` 로 키가 되는 정점의 라벨과 동일하도록 한다.
추가적으로 필드에는 인접하고 있는 간선들을 리스트로 생성한다.

```java
public class GraphListVertex<V, E> extends Vertex<V> {
  protected List<Edge<V, E>> adjacencies; // 정점에 인접한 간선 리스트
  
  public GraphListVertex(V key) {
    super(key);
    adjacencies = new LinkedList<>();
  }
}
```

![image](https://user-images.githubusercontent.com/66655578/170817933-9b2b2d8e-1148-43db-a99f-33e930d51dc5.png)
