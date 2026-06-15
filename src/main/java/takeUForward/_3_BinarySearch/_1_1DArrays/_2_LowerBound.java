int lowerBound(int[] arr, int k) {
    int low = 0, high = arr.length;

    while (low < high) {
        int mid = low + (low + high) / 2;
        final int ele = arr[mid];

        if (ele < k) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    if (low == arr.length) return -1;
    return low;
}


void main() {
    int[] arr = {1, 2, 2, 3};
    int x = 2;
    System.out.println("The lower bound for " + x + " is: " + lowerBound(arr, x));
}