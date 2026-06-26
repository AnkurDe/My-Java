void quick(int[] arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);

        quick(arr, low, pivotIndex - 1);
        quick(arr, pivotIndex + 1, high);
    }
}

int partition(int[] arr, final int low, final int high) {
    // Take last element as pivot
    final int pivot = arr[high];

    // Initialise i
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    System.out.println(Arrays.toString(arr));
    return i + 1;

}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));
    quick(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
}