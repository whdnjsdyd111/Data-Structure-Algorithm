GraphListUndirected 구현
======================

먼저 인접 리스트 무방향 그래프를 구현하기에 앞서, [GraphList](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/GraphList%20%EA%B5%AC%ED%98%84.md) 를 먼저 살펴보자.

![image](https://user-images.githubusercontent.com/66655578/170871116-1c400b94-7c1c-42d4-861c-2db6a6edef2e.png)

### GraphListUndirected 클래스 및 생성자

GraphList 생성자에서 `directed` 필드 false 로 설정한다.

```java
public class GraphListUndirected<V, E> extends GraphList<V, E> {
  public GraphListDirected() {
    super(false);
  }
}
```

### 간선 추가, addEdge

V1 정점과 V2 정점에 대한 간선을 각각 추가한다.

```java
@Override
public void addEdge(V vlabel1, V vlabel2, E label) {
  GraphListVertex<V, E> v1 = dict.get(vlabel1);
  GraphListVertex<V, E> v2 = dict.get(vlabel2);
  Edge<V, E> e = new Edge<>(v1.label(), v2.label(), label, false);
  v1.addEdge(e);
  v2.addEdge(e);
}
```

### 간선 삭제, removeEdge

두 정점을 통해 임의의 간선을 생성하여 해당 간선과 동일한 간선을 각 정점에서의 인접 리스트에서 삭제하도록 한다.

```java
@Override
public boolean removeEdge(V vlabel1, V vlabel2) {
  GraphListVertex<V, E> v1 = dict.get(vlabel1);
  GraphListVertex<V, E> v2 = dict.get(vlabel2);
  Edge<V, E> e = new Edge<>(v1.label(), v2.label(), null, false);
  return v2.removeEdge(e) && v1.removeEdge(e);
}
```

### 정점 삭제, remove

![image](https://user-images.githubusercontent.com/66655578/170871230-83879d9f-1dd6-41c1-a3d6-5387b45fcb96.png)

 위 그림과 같이 하나의 정점을 삭제하면 이와 관련된 모든 간선을 삭제해야 한다.
 
```java
@Override
public boolean remove(V label) {
  GraphListVertex<V, E> v = dict.get(label);
  if(v == null) return false;

  Iterator<V> vi = neighbors(label);
  while(vi.hasNext()) {
    V vtx = vi.next();
    removeEdge(label, vtx);
  }
  dict.remove(label);
  return true;
}
```

### 간선의 수 edgeCount

인접 리스트 반복자를 통해 각 정점의 차수들을 모두 더한다.
마지막으로, 무방향 그래프는 방향 그래프와 다르게 방향 개념이 없으므로 `V1->V2`, `V2->V1` 는 하나로 보기 때문에 2 를 나눈 값을 반환

```java
@Override
public int edgeCount() {
  int count = 0;
  Iterator<GraphListVertex<V, E>> i = dict.values().iterator();
  while(i.hasNext())
    count += i.next().degree();
  return count/2;
}
```
