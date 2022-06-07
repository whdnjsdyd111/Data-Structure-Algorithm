퀵 정렬 (Quicksort)
==================

# 퀵 정렬 알고리즘

퀵 정렬은 합병 정렬처럼 **분할 정복(divide and conquer)** 방법을 통해 정렬한다.

1. 리스트 내의 한 원소를 고른다. 이때 고른 원소를 **피벗**이라 한다.
2. 피벗 앞에는 피벗보다 작은 모든 원소가 오고, 뒤에는 큰 원소들이 오도록 하여 리스트를 둘로 나눈다. 이렇게 둘로 나눈 것을 **분할**이라 한다. 분할을 마치고 피벗은 더이상 움직이지 않는다.
3. 분할된 두 개의 리스트를 **재귀적**으로 1, 2번 과정을 반복한다. 재귀는 리스트의 크기가 0 또는 1이 될 때까지 반복한다.

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Sorting_quicksort_anim.gif/220px-Sorting_quicksort_anim.gif)

# 퀵 정렬 특징

- 퀵 정렬은 찰스 앤터니 리처드 호어가 개발한 정렬 알고리즘
- **비교 정렬**
- 공간복잡도가 평균적으로 O(logn) 이라 **제자리 정렬** 이지만 최악일 때 O(n²) 이기도 하다.
- 중복 값이 초기 순서와 달라질 수 있어 **불안정 정렬**이다.
- 대부분 PC는 메모리 참조가 지역화되어 있어 CPU 캐시 히트율이 높고, 시간복잡도가 최악인 경우는 잘 없기 때문에 매우 빠르다. 이에 이름의 기원이 퀵이 되었다.

최선|평균|최악|메모리|안정|방식|
---|---|---|---|---|---|
nlogn|O(nlogn)|O(n²)|평균 O(logn), 최악 O(n)|불안정|파티셔닝|

# 퀵 정렬 구현

![image](https://user-images.githubusercontent.com/66655578/172367967-9d5cfba9-722a-4bcd-9500-aba7f9274742.png)

```java
public static void quickSort(int[] arr, int left, int right) {
    int l, r, pivot, tmp;
    if (left < right) {
        l = left;   r = right;
        pivot = arr[(l+r)/2];
        //분할 과정
        while (l < r) {
            while (arr[r] > pivot) r--;
            while (l < r && arr[l] < pivot) l++;

            tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
        }

        //정렬 과정 재귀
        quickSort(arr, left, l - 1);
        quickSort(arr, l + 1, right);
    }
}
```

## 결과

각기 다른 원소 5천만개의 원소들을 퀵 정렬 10번 수행했을 때의 각각에 걸린 시간이다.

```
6.661초
6.485초
6.521초
6.42초
6.424초
6.434초
6.499초
6.375초
6.472초
6.402초
```

언뜻 봤을 때 평균적으로 약 6.45초 걸린 것 같다.
위 결과는 각각의 PC 성능마다 다르므로 참고만 하자.
