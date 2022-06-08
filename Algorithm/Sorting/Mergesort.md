병합 정렬 (Mergesort)
=====================

# 병합 정렬 알고리즘

병합 정렬 또는 병합 정렬은 비교 기반 정렬 알고리즘으로, **분할 정복(divide and conquer)** 방법으로 정렬한다.

**n-way** 합병 정렬 개념은 다음과 같다.

1. 분할 : 하나의 원소만 포함하는 n 개의 부분 리스트로 분할시킨다.
2. 정복 : 부분 리스트가 하나만 남을 때 까지 반복하여 재귀하며 정렬
3. 결합 : 병합하면서 정렬된 부분 리스트로 합친다. 이때 마지막 남은 부분 리스트가 정렬된 리스트다.
4. 복사 : 최종 임시 배열에 저장된 결과를 기존 배열에 복사

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/c/cc/Merge-sort-example-300px.gif/220px-Merge-sort-example-300px.gif)

# 병합 정렬 특징

- 병합 정렬은 존 폰 노이만이 개발한 정렬 알고리즘
- **비교 정렬**
- 공간복잡도가 O(n) 이기 때문에 **not-in-place 알고리즘**
- 차례대로 합쳐나가기 때문에 **안정 정렬**이다.

최선|평균|최악|메모리|안정|방식|
---|---|---|---|---|---|
nlogn|nlogn|nlogn|n|안정|합병|

# 병합 정렬 구현

![image](https://user-images.githubusercontent.com/66655578/172599132-e616f778-bfab-47c9-b12f-1a784e6c8277.png)

```java
public static void mergeSort(int[] a, int left, int right, int[] b) {
  if(left >= right) return;

  int mid = (left + right) / 2;	// 1. 분할

  mergeSort(a, left, mid, b);		// 2. 정복
  mergeSort(a, mid+1, right, b);

  int i = left, j = mid + 1, k = left;	// 3. 결합 i - 배열 1 인덱스, j - 배열 2 인덱스
  for(; k <= right; ++k) {
    if(i > mid) b[k] = a[j++];			// 배열 1 인덱스가 마지막까지 갔다면 배열 2 값을 선택해 넣음
    else if(j > right) b[k] = a[i++];	// 배열 2 인덱스가 마지막까지 갔다면 배열 1 값을 선택해 넣음
    else if(a[i] <= a[j]) b[k] = a[i++];// 두 배열 중 작은 값을 선택해 넣음
    else b[k] = a[j++];					// 두 배열 중 작은 값을 선택해 넣음
  }

  for(i = left; i <= right; ++i) a[i] = b[i];	// 4. 복사
}
```
