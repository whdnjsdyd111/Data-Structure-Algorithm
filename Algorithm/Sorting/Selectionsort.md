선택 정렬 (Selectionsort)
=========================

# 선택 정렬 알고리즘

1. 원소 중 순회를 돌아 최소값을 찾는다.
2. 찾은 값을 맨 앞 위치의 값과 교체한다.
3. 위와 같이 교체작업을 한 원소를 제외하고 위와 같은 방법을 반복한다.

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Selection_sort_animation.gif/220px-Selection_sort_animation.gif)

# 선택 정렬 특징

- **비교 정렬**
- **불안정 정렬**
- **제자리 정렬**
- 알고리즘이 간단하고, 메모리가 제한적인 경우 상당히 이점이 있음
- 시간 복잡도가 O(n²) 인 정렬 알고리즘 중 선택 정렬이 버블 정렬보다 항상 우수
- 삽입 정렬은 k + 1 번째 요소를 찾기 위해 모든 요소를 탐색, 삽입 정렬은 필요한 만큼만 탐색하여 더 효율적
- 크기가 작은 배열에서는 분할정복 알고리즘보다 삽입이나 선택 정렬을 최적화하여 사용하는 것을 추천


최선|평균|최악|메모리|안정|방식|
---|---|---|---|---|---|
O(n²)|O(n²)|O(n²)|O(1)|불안정|선택|

# 선택 정렬 구현

![image](https://upload.wikimedia.org/wikipedia/commons/9/94/Selection-Sort-Animation.gif)

```java
public static void selectionSort(int[] arr) {
  int min, tmp;
  for(int i = 0; i < arr.length - 1; i++) {
    min = i;
    for(int j = i + 1; j < arr.length; j++) {
      if(arr[j] < arr[min]) min = j;
    }
    tmp = arr[min];
    arr[min] = arr[i];
    arr[i] = tmp;
  }
}
```
