너비 우선 탐색 (Breadth First Search, BFS)
==========================================

# BFS 알고리즘

BFS는 DFS 와 동일하게 [그래프](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/tree/main/Data%20Structure/Graph%20%26%20Tree)를 탐색하는 방법 중 하나이다.
하나의 정점을 기준으로 모든 정점을 방문하기 위한 처리이다.

1. 시작 정점 v 를 결정하여 방문한다.
2. 정점 v 로 부터 인접 정점을 모두 방문하며, 방문한 정점들을 큐에 추가한다.
3. 큐에 추가된 정점들을 차례로 꺼내며 큐가 빌 때까지 2번과 같은 행위를 반복한다.

![image](https://camo.githubusercontent.com/112810e3604ad9d1f610776414f7ba9bb3d16facceb2078b8312da3072ba8e77/68747470733a2f2f772e6e616d752e6c612f732f316665393234363930336237386661653037353737623234336130623232373931653032636233393634306435636261616531306439383439333433623465613666313632613961363737613538393266626637383139616264346566373232316562643336303838343963666236363739333431316662356536343339353163336632633538623035313364323564336238343765363865663365666563613362653864666333633335616334303138373038613763666637313364303264)

# BFS 특징

- 한 정점으로부터 넓게 퍼지며 탐색
- 재귀적으로 동작하지 않고 큐로 구현
- 경로가 여러 개인 경우에도 최단 경로를 보장
- 노드 수가 적고, 깊이가 얕을수록 유리
- 인접리스트일 때, 시간복잡도 O(V + E) (V: 정점 개수, E: 간선 개수)
- 인접행렬일 때 , 시간복잡도 O(V²)

# BFS 구현

먼저 Datastructure 에서 구현한 [그래프](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/tree/main/Data%20Structure/Graph%20%26%20Tree) 를 준비하자.
[Graph.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/Graph.java)에서 다음과 같이 BFS 메소드를 추가한다.

```java
/**
 * 
 * @param v 시작 정점
 */
void BFS(V v);
```


위 메소드는 [GraphList.java](https://github.com/whdnjsdyd111/Data-Structure-Algorithm/blob/main/Data%20Structure/Graph%20%26%20Tree/GraphList%20%EA%B5%AC%ED%98%84.md)에서 구현한다.

구현하기에 앞서 다음 이미지를 1 부터 BFS 방식으로 모든 노드를 탐색한다고 해보자.
