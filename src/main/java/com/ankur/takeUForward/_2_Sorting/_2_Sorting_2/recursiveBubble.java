void bubble_brute(int[] arr, int length) {
    if (length == 1)
        return;

    for (int i = 0; i < length - 2; i++) {
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
    }
    bubble_brute(arr, --length);
}


void bubble_optimal(int[] arr, int length) {
    if (length == 1)
        return;

    boolean didSwap = false;

    for (int i = 0; i < length - 2; i++) {
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            didSwap = true;
        }
    }

    if (!didSwap)
        return;

    bubble_optimal(arr, --length);
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));

    int[] arr1 = arr.clone();
    bubble_brute(arr1, arr1.length);
    System.out.println(Arrays.toString(arr1));
    int[] arr2 = arr.clone();
    bubble_optimal(arr2, arr2.length);
    System.out.println(Arrays.toString(arr2));
}