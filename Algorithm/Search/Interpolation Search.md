보간 탐색(Iterpolation Search)
==============================

# 보간 탐색 알고리즘

정렬된 리스트 내에서 범위를 줄여가며 탐색하는 알고리즘이다.
동작 방식은 이진 탐색과 비슷하지만 위치 지정하는 방식이 다르다.

1.  ![image](https://user-images.githubusercontent.com/66655578/175553608-dd177cdb-0899-4314-aab6-16d94adc0723.png) 이와 같은 공식으로 위치를 선정한다.
2.  해당 위치 값을 비교하여 작으면 왼쪽, 크면 오른쪽으로 위 공식으로 재탐색한다.
3.  위 과정을 반복하여 타깃 값을 찾는다.

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Interpolation_sort.gif/440px-Interpolation_sort.gif)

# 보간 탐색 특징

- 원소가 균등한 간격으로 분포되어 있을 때 이진 탐색보다 효율적
- 최악의 경우는 이진 탐색보다 느림

최선|평균|최악|
---|---|---|
O(1)|O(log(logn))|O(n)|

# 보간 탐색 구현

```java
public static int interpolationSearch(int arr[], int target) {
  int l = 0;
  int h = arr.length - 1;
  int pos = 0;

  while(arr[l] != arr[h] && arr[l] <= target && target <= arr[h]) {
    pos = l + (h - l) / (arr[h] - arr[l]) * (target - arr[l]);

    if(arr[pos] == target) return pos;
    else if(arr[pos] > target) h = pos - 1;
    else l = pos + 1;
  }

  if(arr[l] == target) return l;
  else return -1;
}
```

같은 과정을 만복하므로 이진 탐색처럼 재귀함수로도 구현 가능하다.

```java
public static int interpolationSearch2(int arr[], int target, int l, int h) {
  int pos;

  if(arr[l] != arr[h] && arr[l] <= target && target <= arr[h]) {
    pos = l + (h - l) / (arr[h] - arr[l]) * (target - arr[l]);

    if(arr[pos] == target) return pos;
    else if(arr[pos] > target) return interpolationSearch2(arr, target, l, pos - 1)
    else return interpolationSearch2(arr, target, pos + 1, h);
  }

  return -1;
}
```
