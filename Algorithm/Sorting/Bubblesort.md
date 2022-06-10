거품 정렬 (Bubblesort)
=======================

# 거품 정렬 알고리즘

1. 첫 번째 원소부터 시작하여 끝까지 인접한 원소를 비교하여 큰 수를 오른쪽으로 교환한다.
2. 정렬된 마지막 원소를 제외하고 위 과정을 반복한다.

![image](https://upload.wikimedia.org/wikipedia/commons/5/54/Sorting_bubblesort_anim.gif?20140912160204)

# 거품 정렬 특징

- **비교 정렬**
- **안정 정렬**
- **제자리 정렬**
- 구현은 간단하지만, 성능이 좋지 못하다.
- 거품 정렬은 한쪽으로 진행하지만 양방향으로 번갈아 수행하면 칵테일 정렬이 된다.

최선|평균|최악|메모리|안정|방식|
---|---|---|---|---|---|
O(n)|O(n²)|O(n²)|O(1)|안정|교환|

# 거품 정렬 구현

![image](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

```java
public static void bubbleSort(int[] arr) {
  int tmp = 0;
  for(int i = 0; i < arr.length - 1; i++) {
    for(int j = 1; j < arr.length - i; j++) {
      if(arr[j] < arr[j - 1]) {
        tmp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = tmp;
      }
    }
  }
}
```
