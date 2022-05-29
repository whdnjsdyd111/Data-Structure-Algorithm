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

### 간선 포함여부, 추가, 삭제, 얻기 containsEdge, addEdge, removeEdge, getEdge

추가 기능을 부여하기 전에, 해당 간선이 리스트에 이미 추가돼 있는지 여부를 먼저 파악하고 추가해야한다.

```java
// 인접 간선 리스트에 간선 포함 여부
public boolean containsEdge(Edge<V, E> e) {
  return adjacencies.contains(e);
}

// 간선 포함 여부 확인 후 간선 추가
public void addEdge(Edge<V, E> e) {
  if(!containsEdge(e)) adjacencies.add(e);
}

// 간선을 삭제하고 삭제 여부 반환
public boolean removeEdge(Edge<V, E> e) {
  return adjacencies.remove(e);
}

// 인접 간선 리스트를 순회하여 동일한 간선 객체 반환
public Edge<V, E> getEdge(Edge<V, E> e) {
  Iterator<Edge<V, E>> edges = adjacencies.iterator();
  while(edges.hasNext()) {
    Edge<V, E> edge = edges.next();
    if(e.equals(Edge)) return edge;
  }
  return null;
}
```

### 부가 기능 degree, adjacentEdges, adjacentVertices

부가적으로 한 정점의 차수, 인접 정점 반복자, 인접 간선 반복자를 반환해주는 메소드를 구현하자.

먼저 차수는 정점으로부터의 간선 개수이므로 현 리스트의 사이즈를 반환해주면 된다.

```java
public int degree() {
  return adjacencies.size();
}
```

간선 반복자는 단순히 간선 리스트의 반복자를 리턴해준다.

```java
public Iterator<Edge<V, E>> adjacentEdges() {
  return adjacencies.iterator();
}
```

그 다음으로는 인접 정점에 대한 반복자를 반환하는 것이다.
현재 간선은 `here` (V1) 과 `there` (V2) 정점에 대한 객체이다.
그러므로 간선 리스트의 간선에 대한 반복자를 통해 현재 `here` 과 현재 정점이 같다면 이와 다른 정점인 `there` 을, 아니라면 `here` 인 다른 정점을 반복자로 반환해주는 것이다.

![image](https://user-images.githubusercontent.com/66655578/170833850-c82bbae0-bc7d-4a3f-8927-95b7b3f3004e.png)

```java
public Iterator<V> adjacentVertices() {
  List<V> list = new LinkedList<>();
  Iterator<Edge<V, E>> edges = adjacentEdges();
  while(edges.hasNext()) {
    Edge<V, E> e = edges.next();
    if(label().equals(e.here())) list.add(e.there());
    else list.add(e.here());
  }
  return list.iterator();
}
```

이와 별개로는 간선 리스트 정보와 인접 정점에 대한 정보 표기이다.

```java
public String verticesToString() {
  StringBuffer sb = new StringBuffer();
  for(Edge<V, E> e : adjacencies) {
    if(label().equals(e.here())) sb.append(e.there());
    else sb.append(e.here());
    sb.append(", ");
  }
  return sb.toString();
}

@Override
public String toString() {
  return "<GraphListVertex: "+label()+", Vertices : " + verticesToString() + ">";
}
```

GraphList 구현
==============

### GraphList 클래스 및 생성자

각 정점들과 이에 대한 인접 리스트를 Map 형태로 관리한다.
추가로 그래프가 방향인지 무방향인지 여부를 저장한다.

```java
public abstract class GraphList<V, E> implements Graph<V, E> {
  protected Map<V, GraphListVertex<V, E>>();
  protected boolean directed;
  
  protected GraphList(boolean dir) {
    dir = new HashMap<V, GraphListVertex<V, E>>();
    directed = dir;
  }
}
```

간선 추가나 제거와 같은 경우는 방향, 무방향에 따라 다르기 때문에 추상 메소드로 선언을 하기 위해 추상 클래스로 선언하였다.

### 정점 및 간선 포함 여부, contains containsEdge

```java
@Override
public boolean contains(V label) {
  return dict.containsKey(label); // 
}

@Override
public boolean containsEdge(V label1, V label2) {
  if(!dict.containsKey(label1)) return false;
  else {
    Edge<V, E> e = new Edge<V, E>(label1, label2, null, directed);
    return dict.get(label1).containsEdge(e);
  }
}
```

## 정점 및 간선 추가

정점 추가는 새 인접리스트를 추가한다.
간선을 추가하는 방법은 방향, 무방향 그래프 각각 방법이 다르기 때문에 추상 메소드로 정의한다.

```java
@Override
public void add(V label) {
  if(dict.containsKey(label)) return;
  GraphListVertex<V, E> v = new GraphListVertex<V, E>(label);
  dict.put(label, v);
}

abstract public void addEdge(V vtx1, V vtx2, E edge);
```

## 두 정점을 통한 간선 얻기, 모든 간선에 대한 반복자 얻기, 정점 얻기 getEdge edges get

두 정점을 통해 해당하는 간선을 얻는 방법은 임의의 간선을 만들어 첫 번째 정점의 인접 리스트에서 동일한 것을 반환하면 된다.

```java
@Override
public Edge<V, E> getEdge(V label1, V label2) {
  if(!dict.containsKey(label1)) return null;
  else {
    Edge<V, E> e = new Edge<V, E>(get(label1), get(label2), null, directed);
    return dict.get(label1).getEdge(e);
  }
}
```

간선 반복자를 반환하는 메소드는 다음과 같다.
`dict` 를 반복하여 각 정점들의 인접 리스트를 저장하여 반복자를 반환한다.

```java
@Override
public Iterator<Edge<V, E>> edges() {
  List<Edge<V, E>> list = new LinkedList<>();
  Iterator<GraphListVertex<V, E>> dictIt = dict.values().iterator();
  while(dictIt.hasNext()) {
    GraphListVertex<V, E> vtx = dictIt.next();
    Iterator<Edge<V, E>> vtxIt = vtx.adjacentEdges();
    while(vtxIt.hasNext() {
      Edge<V, E> e = vtxIt.next();
      if(vtx.label().equals(e.here())) list.add(e);
    }
  }
  return list.iterator();
}
```

정점의 데이터를 반환하는 메소드는 다음과 같다.

```java
@Override
public V get(V label) {
  if(!dict.containsKey(label)) return null;
  else return dict.get(label).label();
}
```

### 정점 반복자, 한 정점의 인접 정점 반복자 iterator neighbors

정점 반복자는 Map 의 키셋 반복자를 반환한다.

```java
@Override
public Iterator<V> iterator() {
  return dict.keySet().iterator();
}
```

인접 정점 반복자는 하나의 정점을 받아 해당 인접 정점 리스트 반복자를 반환한다.

```java
@Override
public Iterator<V> neighbors(V label) {
  if(dict.containsKey(label)) return null;
  else return dict.get(label).adjacentVertices();
}
```

### 정점 및 간선 방문, 방문 여부

```java
@Override
public boolean visit(V label) {
  return dict.get(label).visit();
}

@Override
public boolean visitEdge(Edge<V, E> e) {
  return e.visit();
}

@Override
public boolean isVisited(V label) {
  return dict.get(label).isVisited();
}

@Override
public boolean isVisitedEdge(Edge<V, E> e {
  return e.isVisited();
}
```

### 그 외의 부가 기능

```java
@Override
public void clear() {
  dict.clear();
}

/**
 * 해당 라벨의 정점이 존재하면, 정점의 차수 반환,
 * 존재하지 않으면 -1 반환
 */
@Override
public int degree(V label) {
  if(!dict.containsKey(label)) return -1;
  else return dict.get(label).degree();
}

/**
 * 정점과 간선들의 방문 여부를 리셋
 */
@Override
public void reset() {
  // 간선들 리셋
  Iterator<GraphListVertex<V, E>> vl = dict.values().iterator();
  while(vl.hasNext()) {
    GraphListVertex<V, E> vtx = vl.next();
    vtx.reset();
  }
  // 간선들 릿셋
  Iterator<Edge<V, E>> es = edges();
  while(es.hasNext()) {
    Edge<V, E> e = es.next();
    e.reset();
  }
}

/**
 * 그래프의 간선 개수
 */
@Override
public int size() {
  return dict.size();
}
```

### 추상 메소드

간선 추가 addEdge, 간선 카운트 edgeCount, 정점 삭제 remove, 간선 삭제 removeEdge 는 각각
무방향, 방향 그래프에서 구현하는 것이 다르기 때문에 추상 메소드로 선언한다.
