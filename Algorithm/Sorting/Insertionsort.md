삽입 정렬 (Insertionsort)
=========================

# 삽입 정렬 알고리즘

1. 타깃은 2번째 원소부터 시작한다.
2. 2번째 원소를 1번째 원소와 비교하여 작다면 서로 교환시킨다.
3. 위 방법으로 다음 타겟은 2번째와 비교, 2번째를 1번째와 비교하면서 반복한다.

n번째 타깃을 n-1번째, n-1번째를 n-2 ... 과정을 거치며 반복한다.

![image](https://upload.wikimedia.org/wikipedia/commons/4/42/Insertion_sort.gif)

# 삽입 정렬 특징

- 삽입 정렬은 존 모클리가 개발한 정렬 알고리즘
- **비교 정렬**
- **안정 정렬**
- 교환할 임시변수를 제외한 추가적인 공간을 필요로 하지 않아 **제자리 정렬**이다.
- 구현이 쉽지만 원소 수가 많을 수록 불리

최선|평균|최악|메모리|안정|방식|
---|---|---|---|---|---|
O(n)|O(n²)|O(n²)|O(1)|안정|삽입|

# 삽입 정렬 구현

![image](https://user-images.githubusercontent.com/66655578/172782709-565fd4b1-c935-412c-a73b-f2b418a87fa5.png)

```java
public static void insertionSort(int[] arr) {
  for(int i = 1; i < arr.length; i++) {
    int tmp = arr[i];
    int bf = i - 1;

    while(bf >= 0 && arr[bf] > tmp) {
      arr[bf + 1] = arr[bf];
      bf--;
    }

    arr[bf + 1] = tmp;
  }
}
```
