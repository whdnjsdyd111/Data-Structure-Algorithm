import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GraphListVertex<V, E> extends Vertex<V> {
	
	/**
	 * 정점에 인접한 간선 리스트
	 */
	protected List<Edge<V, E>> adjacencies;

	public GraphListVertex(V key) throws VertexKeyNullException {
		super(key);
		adjacencies = new LinkedList<>();	// 링크 리스트
	}
	
	/**
	 * 정점의 인접 간선 리스트에 간선 추가
	 * @param e
	 */
	public void addEdge(Edge<V, E> e) {
		if(!containsEdge(e)) adjacencies.add(e);
	}
	
	/**
	 * 인접 간선 리스트에 간선 포함 여부
	 * @param e
	 * @return
	 */
	public boolean containsEdge(Edge<V, E> e) {
		return adjacencies.contains(e);
	}
	
	/**
	 * 간선을 삭제하고 삭제 여부 반환
	 * @param e
	 * @return
	 */
	public boolean removeEdge(Edge<V, E> e){
		return adjacencies.remove(e);
	}
	
	/**
	 * 인접 간선 리스트에서 해당 간선과 동일한 객체 반환
	 * @param e
	 * @return
	 */
	public Edge<V, E> getEdge(Edge<V, E> e) {
		Iterator<Edge<V, E>> edges = adjacencies.iterator();
		while(edges.hasNext()) {
			Edge<V, E> edge = edges.next();
			if(e.equals(edge)) return edge;
		}
		return null;
	}
	
	/**
	 * 차수 반환
	 * @return
	 */
	public int degree() {
		return adjacencies.size();
	}
	
	/**
	 * 인접 정점 반복자 반환
	 * @return
	 */
	public Iterator<V> adjacentVertices() {
		List<V> list = new LinkedList<>();
		Iterator<Edge<V, E>> edges = adjacentEdges();
		while(edges.hasNext()) {
			Edge<V, E> e = edges.next();
			if(label().equals(e.here())) {
				list.add(e.there());
			} else {
				list.add(e.here());
			}
		}
		
		return list.iterator();
	}
	
	/**
	 * 간선 반복자 반환
	 * @return
	 */
	public Iterator<Edge<V, E>> adjacentEdges() {
		return adjacencies.iterator();
	}
	
	public String verticesToString() {
		StringBuffer sb = new StringBuffer();
		for(Edge<V, E> e : adjacencies) {
			if(label().equals(e.here())) sb.append(e.there());
			else sb.append(e.here());
			sb.append(", ");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "<GraphListVertex: "+label()+", Vertices : " + verticesToString() + ">";
	}
}
