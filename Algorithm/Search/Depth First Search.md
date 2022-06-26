깊이 우선 탐색 (Depth First Search, DFS)
========================================

# DFS 알고리즘

우선, DFS 는 [그래프](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/tree/main/Data%20Structure/Graph%20%26%20Tree) 탐색하는 방법 중 하나이다.
하나의 정점으로부터 시작하여 그래프의 모든 정점을 한번씩 방문하여 연산을 처리한다.

1. 시작 정점 v 를 결정하여 한번 방문한다.
2. 정점 v 로 부터 인접 정점 중
  - 방문하지 않은 정점이 있다면, 정점 v 를 스택에 push 하고 인접 정점 v2 를 반복한다.
  - 인접 정점을 모두 방문 하였다면, 스택을 pop 하여 마지막 방문 정점으로 되돌아간다.
3. 스택이 완전히 빌 때까지 2번 과정을 반복한다.

![image](https://w.namu.la/s/1fe9246903b78fae07577b243a0b22791e02cb39640d5cbaae10d9849343b4ea6f162a9a677a5892fbf7819abd4ef7221ebd3608849cfb66793411fb5e643951c3f2c58b0513d25d3b847e68ef3efeca3be8dfc3c35ac4018708a7cff713d02d)

# DFS 특징

- 한 정점으로부터 갈 수 있는 최대의 깊이만큼 들어가며 탐색
- 스택 또는 재귀함수로 구현
- 경로를 저장해야할 때 유용
- 그래프 규모가 크다면 DFS 를 고려
- 규모가 크지 않고, 최단 거리를 구할 경우엔 가까운 노드부터 찾는 BFS 가 유리
- 인접리스트일 때, 시간복잡도 O(V + E) (V: 정점 개수, E: 간선 개수)
- 인접행렬일 때  , 시간복잡도 O(V²)

# DFS 구현

먼저 Datastructure 에서 구현한 [그래프](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/tree/main/Data%20Structure/Graph%20%26%20Tree) 를 준비하자.
[Graph.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/Graph.java)에서 다음과 같이 DFS 메소드를 추가한다.

```java
	/**
	 * 
	 * @param v 시작 정점
	 */
	void DFS(V v);
```

위 메소드는 [GraphList.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/GraphList%20%EA%B5%AC%ED%98%84.md)에서 구현한다.

구현하기에 앞서 다음 이미지를 1 부터 DFS 방식으로 모든 노드를 탐색한다고 해보자.

![image](https://user-images.githubusercontent.com/66655578/175814058-4464f095-7af2-46e9-ad04-53f028e1c66b.png)

![image](https://user-images.githubusercontent.com/66655578/175814094-d65fd37a-bcb7-4491-9278-92909426b72f.png)

![image](https://user-images.githubusercontent.com/66655578/175814137-dd19dd29-62f1-466b-b2e8-b31668aea656.png)

![image](https://user-images.githubusercontent.com/66655578/175814160-761ef045-90de-434e-a322-29797341816a.png)

![image](https://user-images.githubusercontent.com/66655578/175814173-92f8b0af-97fa-46b5-92be-d448e5408539.png)

![image](https://user-images.githubusercontent.com/66655578/175814194-526ca428-cd31-42f7-b8ac-9d5ec6c1f645.png)

![image](https://user-images.githubusercontent.com/66655578/175814222-b877f450-aace-471d-9c96-96bb03c4dbf2.png)

![image](https://user-images.githubusercontent.com/66655578/175814328-36186a6d-e573-426e-afa5-8198a8482998.png)


![image](https://user-images.githubusercontent.com/66655578/175814350-06782209-0c44-4e93-b9db-347546878da0.png)

마지막 과정으로 탐색할 정점이 더이상 없으므로 pop 을 진행한다.

![image](https://user-images.githubusercontent.com/66655578/175814385-c96193ce-7c46-4654-98de-f51630bd1f13.png)

```java
@Override
public void DFS(V v) {
  GraphListVertex<V, E> start = dict.get(v);	// 시작 지점 정점 얻기

  Stack<GraphListVertex<V, E>> stack = new Stack<>();	// 스택 생성

  stack.push(start);	// 시작 정점 방문 후 스택 쌓기
  start.visit();

  StringBuffer sb = new StringBuffer(v + " -> ");

  while(!stack.empty()) {	// 스택이 없어질 때 까지 반복
    GraphListVertex<V, E> gv = stack.peek();

    Iterator<V> iterator = gv.adjacentVertices();	// 주변 정점 조회
    boolean check = false;	// 스택 추가한 정점이 있는지 체크
    while(iterator.hasNext()) {
      GraphListVertex<V, E> g = dict.get(iterator.next());
      if(!g.visited) {	// 방문하지 않은 정점 스택 쌓은 후, 방문하기
        stack.push(g);
        g.visit();
        sb.append(g.label + " -> ");
        check = true;
        break;
      }
    }

    if(!check) sb.append("( pop " + stack.pop().label() + " ) ");	// 방문한 정점이 없다면 스택 팝
  }

  reset();	// 방문 플래그를 리셋
  System.out.println(sb.toString());

}
```
