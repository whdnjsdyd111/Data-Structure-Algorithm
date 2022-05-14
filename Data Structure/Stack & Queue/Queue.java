package DataStructure.Queue;

/**
 * 
 * @author whdnjsdyd111
 *
 * @param <E>
 * 
 * @version 1.0_
 */

public interface Queue<E> {
	/**
	 * 요소 삽입
	 * 
	 * @param 삽입할 요소
	 * @return 삽입한 요소
	 * @throws QueueOverflowError
	 */
	E enqueue(E item);
	
	/**
	 * 요소 꺼내기
	 * 
	 * @return 꺼낸 요소
	 * @throws EmptyQueueException
	 */
	E dequeue();
	
	/**
	 * 가장 먼저 나올 데이터 반환
	 * 
	 * @return 먼저 나오게될 요소, 비었을 경우 {@code null} 반환
	 */
	E peek();
	
	/**
	 * 요소가 비었는지 여부 반환
	 * 
	 * @return 비었는지 여부
	 */
	boolean isEmpty();
	
	/**
	 * 요소가 꽉 찼는지 여부 반환
	 * 
	 * @return 꽉 찼는지 여부
	 */
	boolean isFull();
	
	/**
	 * 요소 개수 반환
	 * 
	 * @return 요소 개수
	 */
	int size();
}
