void insertion(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));
    insertion(arr);
    System.out.println(Arrays.toString(arr));
}