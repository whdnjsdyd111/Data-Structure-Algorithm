import java.util.Iterator;

public interface Graph<V, E> {
	
	/**
	 * 그래프에 정점 추가
	 * @param vtx
	 */
	void add(V vtx);
	
	/**
	 * 두 정점 사이에 간선 추가
	 * @param vtx1
	 * @param vtx2
	 * @param edge
	 */
	void addEdge(V vtx1, V vtx2, E edge);
	
	/**
	 * 모든 정점, 간선을 제거
	 */
	void clear();
	
	/**
	 * 정점 포함 여부
	 * @param vtx
	 */
	boolean contains(V vtx);
	
	/**
	 * 두 정점사이의 간선 포함 여부
	 * @param vtx1
	 * @param vtx2
	 * @return
	 */
	boolean containsEdge(V vtx1, V vtx2);
	
	/**
	 * 정점의 차수 반환
	 * @param vtx
	 * @return
	 */
	int degree(V vtx);
	
	/**
	 * 간선의 수 반환
	 * @return
	 */
	int edgeCount();
	
	/**
	 * 간선의 반복자 반환
	 * @return
	 */
	Iterator<Edge<V, E>> edges();
	
	/**
	 * 정점의 실제 참조 반환
	 * @param vtx
	 * @return
	 */
	V get(V vtx);
	
	/**
	 * 두 정점 사이의 간선 반환
	 * @param vtx1
	 * @param vtx2
	 * @return
	 */
	Edge<V, E> getEdge(V vtx1, V vtx2);
	
	/**
	 * 그래프가 방향을 나타내는지 여부
	 * @return
	 */
	boolean isDirected();
	
	/**
	 * 그래프가 비었는지 여부
	 * @return
	 */
	boolean isEmpty();
	
	/**
	 * 정점의 방문 여부
	 * @param vtx
	 * @return
	 */
	boolean isVisited(V vtx);
	
	/**
	 * 간선의 방문 여부
	 * @param e
	 * @return
	 */
	boolean isVisitedEdge(Edge<V, E> e);
	
	/**
	 * 정점 반복자 반환
	 * @return
	 */
	Iterator<V> iterator();
	
	/**
	 * 인접 정점들의 반복자 반환
	 * @param vtx
	 * @return
	 */
	Iterator<V> neighbors(V vtx);
	
	/**
	 * 정점 제거
	 * @param vtx
	 * @return
	 */
	V remove(V vtx);
	
	/**
	 * 간선 제거
	 * @param vtx1
	 * @param vtx2
	 * @return
	 */
	E removeEdge(V vtx1, V vtx2);
	
	/**
	 * 모든 정점과 간선의 방문 플래그를 리셋
	 */
	void reset();
	
	/**
	 * 그래프 내의 정점 수 반환
	 * @return
	 */
	int size();
	
	/**
	 * 해당 정점에 방문
	 * @param vtx
	 * @return
	 */
	boolean visit(V vtx);
	
	/**
	 * 해당 간선에 방문
	 * @param e
	 * @return
	 */
	boolean visitEdge(Edge<V, E> e);
}
