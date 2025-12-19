// Critical assumption array is sorted
int sortedApproach(int[] arr, int n) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != i+1)
            return i+1;
    }
    return n;
}

int unsorted(int[] arr, int n) {
    int sum = 0;
    for (int element : arr)
        sum += element;

    final int sumUptoN = (n*(n+1))/2;

    return Math.abs(sum-sumUptoN);
}

void tester(int[] arr, int n) {
    System.out.printf("The missing number is %d --Considering sorted array\n", sortedApproach(arr, n));
    System.out.printf("The missing number is %d --Optimal Approach\n\n", unsorted(arr, n));
}

void main() {
    int[] array = {1,2,4,5};
    tester(array, 5);
    array =new int[] {1,3};
    tester(array, 3);
}