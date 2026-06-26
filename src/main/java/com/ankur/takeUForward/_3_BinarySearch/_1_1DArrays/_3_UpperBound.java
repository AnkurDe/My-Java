int upperBound(int[] arr, int k) {
    int low = 0, high = arr.length;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] <= k) {
            low = mid+1;
        } else {
            high = mid;
        }
    }

    if (low == arr.length) return -1;
    return low;
}

void main() {
    int[] arr = {3, 5, 8, 9, 15, 19};
    int x = 9;
    System.out.println("The upper bound for " + x + " is: " + upperBound(arr, x));
}