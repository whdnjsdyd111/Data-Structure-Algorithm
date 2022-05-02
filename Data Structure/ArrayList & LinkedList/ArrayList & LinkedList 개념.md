# ArrayList & LinkedList 구조

![캡처](https://user-images.githubusercontent.com/66655578/166246316-30a25b98-01b6-4dd6-bfaf-54818b199cb3.PNG)

### ArrayList 특징

- 크기가 고정된 **배열**을 통해 관리, 데이터 추가 · 삭제를 위해 임시 배열을 생성하여 데이터를 복사하는 방법을 사용
- **가장 간단**한 자료구조
- **인덱싱**으로 접근하여 접근속도가 빨라 **검색에 유리**
- 자료 개수가 n 개일 때, 삽입 시의 평균 이동 횟수는 `(n+1)/2` 이고 삭제 시엔 `(n-1)/2` 이다.
- **추가 · 삭제는 불리**

### LinkedList 특징

- 연속적인 배열이 아닌 **임의 공간(노드)에 기억**하여 순서에 따라 **포인터(링크)를 이용**하여 서로 연결된 구조
- 노드의 **삽입 · 삭제 작업 용이**
- 연결을 위한 링크가 필요하여 ArrayList 에 비해 기억 공간 효율이 좋지 않다.
- 노드를 찾는 시간이 필요하여 **접근 속도 느림**
- 노드의 연결이 끊어지면 노드 찾기가 힘듦
- 단순 연결 리스트(Single Linked List), 단순 환상 연결 리스트(Single Circular Linked List)
, 이중 연결 리스트(Doubly Linked List), 이중 환상 연결 리스트(Doubly Circular Linked List) 등 존재

# ArrayList & LinkedList 성능지표

 -|ArrayList|LinkedList|
---|---|---|
인덱싱|O(1)|O(n)|
삽입 · 삭제 첫 부분|O(n)|O(1)|
삽입 · 삭제 끝 부분|O(1)|마지막 요소 모를 때 - O(n)<br>마지막 요소 알 때 - O(1)|
삽입 · 삭제 중간|O(n)|접근 시간 + O(1)|
최악 공간복잡도|O(n)|(n)|
