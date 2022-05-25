public class Vertex<E> {
	/**
	 * 정점 관련 라벨
	 */
	protected E label;
	
	
	/**
	 * 정점 방문 여부
	 */
	protected boolean visited;
	
	public Vertex(E label) throws VertexKeyNullException {
		if(label == null) throw new VertexKeyNullException();
		this.label = label;
		this.visited = false;
	}
	
	/**
	 * 라벨 반환
	 * @return
	 */
	public E label() {
		return label;
	}
	
	/**
	 * 해당 정점을 방문
	 * 과거 방문 여부를 반환하며, 방문 여부의 값을 true 세팅
	 * @return
	 */
	public boolean visit() {
		boolean was = visited;
		visited = true;
		return was;
	}
	
	/**
	 * 정점 방문 여부 반환
	 * @return
	 */
	public boolean isVisited() {
		return visited;
	}
	
	/**
	 * 방문 여부를 리셋
	 */
	public void reset() {
		visited = false;
	}
	
	/**
	 * 두 정점간의 비교
	 */
	@Override
	public boolean equals(Object obj) {
		Vertex<?> v = (Vertex<?>) obj;
		return label.equals(v.label());
	}
	
	@Override
	public String toString() {
		return "<Vertex: "+label+">";
	}
}

class VertexKeyNullException extends Exception {
	private static final long serialVersionUID = 1L;

	public VertexKeyNullException() {
		super("VerTex is Non-Null");
	}
}
