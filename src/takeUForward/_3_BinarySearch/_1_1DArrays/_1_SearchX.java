int searchPos(int[] arr, int k) {
    int low = 0, high = arr.length - 1;
    while (low < high) {
        int mid = (low + high) / 2;
        final int ele = arr[mid];
        if (ele == k) {
            return mid;
        } else if (ele < k) {
            low = mid;
        } else {
            high = mid;
        }
    }
    return -1;
}

void main() {
    int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
    System.out.println("The element is located in pos: " + searchPos(arr, 0));
}