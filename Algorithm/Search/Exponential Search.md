지수 탐색(Exponential Search)
=============================

# 지수 탐색 알고리즘

검색 범위를 2의 제곱씩 곱하며 검색 범위를 좁힌 후 이진 검색으로 해당 범위의 타깃 값을 찾아내는 알고리즘이다.

1. 검색 범위를 좁히기 위해 1, 2, 4, 8 ... 로 타깃 값이 해당 범위 내에 있는지 확인한다.
2. 1번 과정에서의 범위를 이진 검색으로 타깃값을 찾아냄

![image](https://user-images.githubusercontent.com/66655578/175753173-e5420a81-6eb1-42f8-ae49-cbf23b1609ba.png)

# 지수 탐색 특징

- 배열의 길이가 무한정으로 큰 경우 이진 검색보다 효율적
- 타깃 값이 첫 번째 요소에 가까때도 잘 작동됨

최선|평균|최악|
---|---|---|
O(1)|O(logn)|O(logn)|

# 지수 탐색 구현

```java
public static int exponentialSearch(int arr[], int target) {
  int n = arr.length;
  if(arr[0] == target) return 0;  // 첫 번째 요소라면 바로 리턴하도록 유도
  
  int i = 1;
  while(i < n && arr[i] <= target) i *= 2;
  
  return binarySearch2(arr, target, i / 2, Math.min(i, n - 1));
}
```

위 코드와 같이 2의 제곱씩 증가시키며 해당 범위를 찾으면, 해당 범위 내에서 [이진 탐색](/Algorithm/Search/Binary%20Search.md)으로 검색하는 것을 볼 수 있다.
