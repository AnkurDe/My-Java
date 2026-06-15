void insertion(int[] arr, int start, int end) {
    if (start == end)
        return;

    int j = start;
    while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
    }
    insertion(arr, start + 1, end);
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));
    insertion(arr, 0, arr.length);
    System.out.println(Arrays.toString(arr));
}