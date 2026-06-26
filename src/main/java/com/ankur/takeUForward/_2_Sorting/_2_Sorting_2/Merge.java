void merge_sort(int[] arr) {
    merge_sort(arr, 0, arr.length - 1);
}

void merge_sort(int[] arr, int low, int high) {
    if (low >= high)
        return;
    int mid = (low + high) / 2;
    merge_sort(arr, low, mid);
    merge_sort(arr, mid + 1, high);
    merge(arr, low, mid, high);
}

void merge(int[] arr, int low, int mid, int high) {
    int left = low, right = mid + 1;
    List<Integer> list = new LinkedList<>();
    while (left <= mid && right <= high) {
        if (arr[left] <= arr[right]) {
            list.add(arr[left]);
            ++left;
        } else {
            list.add(arr[right]);
            ++right;
        }
    }

    while (left <= mid) {
        list.add(arr[left]);
        ++left;
    }
    while (right <= high) {
        list.add(arr[right]);
        ++right;
    }

    for (int i = low; i <= high; i++) {
        arr[i] = list.removeFirst();
    }
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));
    merge_sort(arr);
    System.out.println(Arrays.toString(arr));
}