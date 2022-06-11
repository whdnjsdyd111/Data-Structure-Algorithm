힙 정렬 (Heapsort)
==================

# 힙 정렬 알고리즘

1. n 개의 원소를 완전 이진 트리로 구성한다.
2. 최대 힙을 구성시킨다.
3. 가장 큰 수(루트)를 가장 작은 수와 교환한다.
4. 2번, 3번을 반복한다.

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/Sorting_heapsort_anim.gif/220px-Sorting_heapsort_anim.gif)

# 힙 정렬 특징 

- **비교 정렬**
- **불안정 정렬**
- **제자리 정렬**
- 항상 nlogn 을 보장
- 제자리 정렬이라 합병 정렬보다 효율적
- 이론적으론 퀵, 합병 정렬보다 우위지만, 일반적으로 평균 속도는 퀵이 더 빠르다.

최선|평균|최악|메모리|안정|방식|
---|---|---|---|---|---|
O(nlogn)<br>키가 구별될 경우 O(n)|O(nlogn)|O(nlogn)|O(1)|불안정|선택|

# 힙 정렬 구현

https://upload.wikimedia.org/wikipedia/commons/4/4d/Heapsort-example.gif

```java
public static void heapSort(int[] arr) {
  int tmp;

  for(int i = arr.length / 2 - 1; i >= 0; i--)
    heapify(arr, arr.length, i);

  for(int i = arr.length - 1; i > 0; i--) {
    tmp = arr[0];
    arr[0] = arr[i];
    arr[i] = tmp;
    heapify(arr, i, 0);
  }
}

private static void heapify(int[] arr, int n, int i) {
  int max = i;
  int left = 2 * i + 1;
  int right = 2 * i + 2;
  int tmp;

  if(left < n && arr[left] > arr[max]) max = left;
  if(right < n && arr[right] > arr[max]) max = right;
  if(max != i) {
    tmp = arr[i];
    arr[i] = arr[max];
    arr[max] = tmp;
    heapify(arr, n, max);
  }
}
```
