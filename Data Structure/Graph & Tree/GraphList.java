package DataStructure.Graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public abstract class GraphList<V, E> implements Graph<V, E> {
	
	protected Map<V, GraphListVertex<V, E>> dict;
	protected boolean directed;
	
	protected GraphList(boolean dir) {
		dict = new HashMap<V, GraphListVertex<V, E>>();
		directed = dir;
	}
	
	/**
	 * 인접 리스트에 정점 추가
	 */
	@Override
	public void add(V label) {
		if(dict.containsKey(label)) return;
		GraphListVertex<V, E> v = new GraphListVertex<V, E>(label);
		dict.put(label, v);
	}

	/**
	 * 두 정점 간의 간선 추가
	 */
	abstract public void addEdge(V vtx1, V vtx2, E edge);

	@Override
	public void clear() {
		dict.clear();
	}

	/**
	 * 정점 포함 여부
	 */
	@Override
	public boolean contains(V label) {
		return dict.containsKey(label);
	}

	@Override
	public boolean containsEdge(V label1, V label2) {
		if(!dict.containsKey(label1)) return false;
		else {
			Edge<V, E> e = new Edge<V, E>(label1, label2, null, directed);
			return dict.get(label1).containsEdge(e);
		}
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
	 * 무방향 간선과 방향 간선은 카운트하는 방법이 다르므로 추상화
	 */
	abstract public int edgeCount();

	/**
	 * 그래프에 존재하는 간선들 반환
	 */
	@Override
	public Iterator<Edge<V, E>> edges() {
		List<Edge<V, E>> list = new LinkedList<>();
		Iterator<GraphListVertex<V, E>> dictIt = dict.values().iterator();
		while(dictIt.hasNext()) {
			GraphListVertex<V, E> vtx = dictIt.next();
			Iterator<Edge<V, E>> vtxIt = vtx.adjacentEdges();
			while(vtxIt.hasNext()) {
				Edge<V, E> e = vtxIt.next();
				if(vtx.label().equals(e.here())) list.add(e);
			}
		}
		return list.iterator();
	}

	/**
	 * 정점의 라벨을 반환
	 */
	@Override
	public V get(V label) {
		if(!dict.containsKey(label)) return null;
		else return dict.get(label).label();
	}

	/**
	 * 정점 두 개 사이의 간선 반환
	 */
	@Override
	public Edge<V, E> getEdge(V label1, V label2) {
		if(!dict.containsKey(label1)) return null;
		else {
			Edge<V, E> e = new Edge<V, E>(get(label1), get(label2), null, directed);
			return dict.get(label1).getEdge(e);
		}
	}

	/**
	 * 방향, 무방향 그래프 여부
	 */
	@Override
	public boolean isDirected() {
		return directed;
	}

	/**
	 * 그래프 비었는지 여부
	 */
	@Override
	public boolean isEmpty() {
		return dict.isEmpty();
	}

	/**
	 * 정점의 방문 여부
	 */
	@Override
	public boolean isVisited(V label) {
		return dict.get(label).isVisited();
	}

	/**
	 * 간선의 방문 여부
	 */
	@Override
	public boolean isVisitedEdge(Edge<V, E> e) {
		return e.isVisited();
	}

	/**
	 * 정점 반복자 반환
	 */
	@Override
	public Iterator<V> iterator() {
		return dict.keySet().iterator();
	}

	
	/**
	 * 인접 정점 반복자 반화
	 */
	@Override
	public Iterator<V> neighbors(V label) {
		if(dict.containsKey(label)) return null;
		else return dict.get(label).adjacentVertices();
	}

	/**
	 * 정점 제거
	 */
	abstract public V remove(V vtx);

	/**
	 * 간선 제거
	 */
	abstract public E removeEdge(V vtx1, V vtx2);

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

	/**
	 * 정점에 방문
	 */
	@Override
	public boolean visit(V label) {
		return dict.get(label).visit();
	}

	/**
	 * 간선에 방문
	 */
	@Override
	public boolean visitEdge(Edge<V, E> e) {
		return e.visit();
	}

}
