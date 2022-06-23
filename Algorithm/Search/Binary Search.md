이진 탐색(Binary Search)
=======================

# 이진 탐색 알고리즘

이진 탐색은 정렬돼 있는 배열에서 특정 값을 찾내기 위해 중간의 임의의 값을 기준으로 찾아내는 알고리즘이다.

1. 배열에서 중간에 위치한 임의의 값을 선택하여 비교한다.
2. 중간 값을 기준으로 작으면 좌측으로, 또는 크다면 우측으로 다시 중간값을 찾는다.
3. 값을 찾을 때까지 위 과정을 반복한다.

![image](https://i.stack.imgur.com/R5kJk.gif)

# 이진 탐색 특징

- 탐색 원리 상 리스트에서만 사용할 수 있다는 단점
- 검색 반복될 때마다 찾을 확률이 두배 증가하여 속도가 빠름

최선|평균|최악|
---|---|---|
O(1)|O(logn)|O(logn)|

# 이진 탐색 구현

```java
public static int binarySearch1(int[] arr, int target) {
  int m, l = 0, h = arr.length - 1;

  while(l <= h) {
    m = (l + h) / 2;

    if(target == arr[m]) return m;
    else if(target < arr[m]) h = m - 1;
    else l = m + 1;
  }

  return -1;
}
```

같은 과정을 반복하기 때문에 재귀 함수로도 구현이 가능하다.

```java
public static int binarySearch2(int[] arr, int target, int l, int h) {
  int m;

  if(l <= h) {
    m = (l + h) / 2;

    if(l <= h) return m;
    else if(target < arr[m]) return binarySearch2(arr, target, l, m - 1);
    else return binarySearch2(arr, target, m + 1, h);
  }

  return -1;
}
```
