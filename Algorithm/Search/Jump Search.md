점프 탐색(Jump Search)
======================

# 점프 탐색 알고리즘

점프 탐색은 순차적으로 탐색하는 선형 탐색과 달리 블록 단위로 점프하며 탐색하는 알고리즘이다.

1. 배열을 블록단위로 나누기 위해 블록 사이즈 `m` 을 구한다. 이때 블록 사이즈는 √n 이다.
2. 한 블록을 탐색하고 없다면 다음 블록으로 이동한다. 이때 한 블록은 선형 탐색으로 찾는다.
3. 위 과정을 반복하여 값을 찾는다.

![image](http://theoryofprogramming.com/wp-content/uploads/2016/11/jump-search-1-1024x439.jpg)

# 점프 탐색 특징

- 정렬된 배열에서만 작동한다.
- 블록의 최적 크기는 앞서 말했듯 √n 이며, 이를 통해 시간복잡도 O(√n) 으로 만들 수 있다.
- 검색 속도는 이진 탐색 O(logn) < O(√n) < 선형검색 O(¾n) 사이다.
- 이진 검색의 비용이 큰 상황에선 점프 검색이 더 효율적이다.

최선|평균|최악|
---|---|---|
O(1)|O(√n)|O(n)|

# 점프 탐색 구현

```java	
public static int jumpSearch(int[] arr, int target) {
  int lng = arr.length;
  int step = (int) Math.floor(Math.sqrt(lng));	// √n 블록 사이즈
  int prev = 0;

  while(arr[Math.min(step, lng) - 1] < target) {	// 타깃이 있을 블록을 찾음
    prev = step;
    step += (int) Math.floor(Math.sqrt(lng));
    if(prev >= lng) return -1;
  }

  while(arr[prev] < target) {	// 블록 내에서 타깃을 찾음
    prev++;
    if(prev == Math.min(step, lng)) return -1;
  }

  if(arr[prev] == target) return prev;

  return -1;
}
```
