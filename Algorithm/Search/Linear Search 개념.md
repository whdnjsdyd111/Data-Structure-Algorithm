선형 탐색(Linear Search)
=============================

# 선형 탐색 알고리즘

선형 탐색은 말 그래도 순차적으로 자료구조를 탐색한다.

아래와 같은 배열이 있을 때 `5` 를 탐색한다고 가정했을 때, 배열의 맨 앞부터 끝까지 찾아나가는 방식이다.

![image](http://www.globalsoftwaresupport.com/wp-content/uploads/2017/02/ezgif.com-video-to-gif-17.gif)

# 선형 탐색 특징

- 가장 단순하며 정렬되지 않은 리스트에도 사용 가능
- 검색 길이가 길면 비효율
- 최악의 경우 끝까지 탐색하게 되어 O(n)

최선|평균|최악|
---|---|---|
O(1)|O(n)|O(¾n)|

# 선형 탐색 구현

```java
public static int linearSearch(int[] arr, int target) {
  for(int i : arr) {
    if(i == target) return i;	// 찾은 위치 반환
  }
  return -1;	// 없다면 -1 반환
}
```
