퀵 정렬 (Quicksort)
==================

# 퀵 정렬 알고리즘

퀵 정렬은 합병 정렬처럼 분할 정복(divide and conquer) 방법을 통해 정렬한다.

1. 리스트 내의 한 원소를 고른다. 이때 고른 원소를 **피벗**이라 한다.
2. 피벗 앞에는 피벗보다 작은 모든 원소가 오고, 뒤에는 큰 원소들이 오도록 하여 리스트를 둘로 나눈다. 이렇게 둘로 나눈 것을 **분할**이라 한다. 분할을 마치고 피벗은 더이상 움직이지 않는다.
3. 분할된 두 개의 리스트를 재귀적으로 1, 2번 과정을 반복한다. 재귀는 리스트의 크기가 0 또는 1이 될 때까지 반복한다.

![image](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6a/Sorting_quicksort_anim.gif/220px-Sorting_quicksort_anim.gif)

