import java.util.Iterator;

public class GraphListDirected<V, E> extends GraphList<V, E> {
    public GraphListDirected()
    {
        super(true);
    }

    /**
     * 두 정점 간의 방향 간선 추가
     */
    public void addEdge(V vLabel1, V vLabel2, E label) {
	    GraphListVertex<V,E> v1 = dict.get(vLabel1);
	    GraphListVertex<V,E> v2 = dict.get(vLabel2);
	    Edge<V,E> e = new Edge<V,E>(v1.label(), v2.label(), label, true);
	    v1.addEdge(e);
    }

    /**
	 * 그래프에서 해당 정점을 제거
	 * 모든 간선 중 정점을 향하거나 정점에서 다른 정점을 향하는 간선을 모두 끊음
     */
    public boolean remove(V label) {
        GraphListVertex<V,E> v = dict.get(label);
        if(v == null) return false;

        Iterator<V> vi = iterator();
        while (vi.hasNext()) {
            V v2 = vi.next();
            if (!label.equals(v2)) removeEdge(v2,label);
        }
        dict.remove(label);
        return true;
    }

    /**
     * 첫 번째 정점에서 두 번째 정점을 향하는 간선 제거
     */
    public boolean removeEdge(V vLabel1, V vLabel2)  
    {
        GraphListVertex<V,E> v1 = dict.get(vLabel1);
        GraphListVertex<V,E> v2 = dict.get(vLabel2);
        Edge<V,E> e = new Edge<V,E>(v1.label(), v2.label(), null, true);
        return v1.removeEdge(e);
    }

    /**
     * 그래프 간선의 수 반환
     */
    @Override
    public int edgeCount() {
        int count = 0;
        Iterator<GraphListVertex<V,E>> i = dict.values().iterator();
        while (i.hasNext())
            count += i.next().degree();
        return count;
    }

    @Override
    public String toString() {
        return "<GraphListDirected: "+dict.toString()+">";
    }
}
