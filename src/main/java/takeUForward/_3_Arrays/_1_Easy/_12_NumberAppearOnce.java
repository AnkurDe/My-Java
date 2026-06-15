// Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.


// PROPERTY
// a ^ a = 0 and a ^ 0 = a
int func(int[] arr) {
    int once = 0;
    for (final int ele : arr)
        once = once ^ ele;
    System.gc();
    return once;
}

void testing(int[] arr) {
    System.out.printf("Number appearing once is %d\n", func(arr));
}

void main() {
    int[] arr = {2,2,1};
    testing(arr);
    arr = new int[] {4,1,2,1,2};
    testing(arr);
    arr = new int[] {1, 2, 2, 3, 3};
    testing(arr);
}