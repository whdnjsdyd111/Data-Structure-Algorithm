import java.util.Iterator;

public class GraphListUndirected<V, E> extends GraphList<V, E> {
	public GraphListUndirected() {
		super(false);
	}

	/**
	 * 두 정점 사이에 간선을 더한다.
	 * 이때 간선은 무방향이다.
	 */
	@Override
	public void addEdge(V vlabel1, V vlabel2, E label) {
		GraphListVertex<V, E> v1 = dict.get(vlabel1);
		GraphListVertex<V, E> v2 = dict.get(vlabel2);
		Edge<V, E> e = new Edge<>(v1.label(), v2.label(), label, false);
		v1.addEdge(e);
		v2.addEdge(e);
	}

	/**
	 * 그래프에서 해당 정점을 제거
	 * 주변 간선을 모두 끊음
	 */
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

	/**
	 * 두 정점 사이의 간선을 끊음
	 */
	@Override
	public boolean removeEdge(V vlabel1, V vlabel2) {
		GraphListVertex<V, E> v1 = dict.get(vlabel1);
		GraphListVertex<V, E> v2 = dict.get(vlabel2);
		Edge<V, E> e = new Edge<>(v1.label(), v2.label(), null, false);
		return v2.removeEdge(e) && v1.removeEdge(e);
	}
	
	/**
	 * 그래프의 간선 수 반환
	 */
	@Override
	public int edgeCount() {
		int count = 0;
		Iterator<GraphListVertex<V, E>> i = dict.values().iterator();
		while(i.hasNext())
			count += i.next().degree();
		return count/2;
	}
	
	@Override
	public String toString() {
		return "<GraphListUndirected: "+dict.toString()+">";
	}
	
}
