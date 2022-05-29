GraphListDirected 구현
======================

먼저 인접 리스트 방향 그래프를 구현하기에 앞서, [GraphList](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/GraphList%20%EA%B5%AC%ED%98%84.md) 를 먼저 살펴보자.

![image](https://user-images.githubusercontent.com/66655578/170864831-a52921de-45a1-43c7-b57c-759cae946912.png)

### GraphListDirected 클래스 및 생성자

GraphList 생성자에서 `directed` 필드를 설정해야 했었다.

```java
public class GraphListDirected<V, E> extends GraphList<V, E> {
  public GraphListDirected() {
    super(true);
  }
}
```

### 간선 추가, addEdge

V1 정점에서 V2 정점으로 향하는 간선을 추가한다.

```java
public void addEdge(V vLabel1, V vLabel2, E label) {
  GraphListVertex<V, E> v1 = dict.get(vLabel1);
  GraphListVertex<V, E> v2 = dict.get(vLabel2);
  Edge<V, E> e = new Edge<>(v1.label(), v2.label(), label, true);
  v1.addEdge(e);
}
```

### 간선 삭제, removeEdge

두 정점을 통해 임의의 간선을 생성하여 해당 간선과 동일한 간선을 인접 리스트에서 삭제하도록 한다.

```java
public boolean removeEdge(V vLabel1, V vLabel2) {
  GraphListVertex<V, E> v1 = dict.get(vLabel1);
  GraphListVertex<V, E> v2 = dict.get(vLabel2);
  Edge<V, E> e = new Edge<V, E>(v1.label(), v2.label(), null, true);
  return v1.removeEdge(e);
}
```

### 정점 삭제, remove

![image](https://user-images.githubusercontent.com/66655578/170866893-7ee4ef33-f88c-45cf-959c-1a79cbcb17d3.png)

 위 그림과 같이 하나의 정점을 삭제하면 이와 관련된 모든 간선을 삭제해야 한다.
 
```java
public boolean remove(V label) {
  GraphListVertex<V, E> v = dict.get(label);
  if(v == null) return false;
  
  Iterator<V> vi = iterator();
  while(vi.hasNext()) {
    V v2 = vi.next();
    if(!label.equals(v2)) removeEdge(v2, label);
  }
  dict.remove(label);
  return true;
}
```

### 간선의 수 edgeCount

인접 리스트 반복자를 통해 각 정점의 차수들을 모두 더한다.

```java
@Override
public int edgeCount() {
  int count = 0;
  Iterator<GraphListVertex<V, E>> i = dict.values().iterator();
  while(i.hasNext()) count += i.next().degree();
  return count;
}
