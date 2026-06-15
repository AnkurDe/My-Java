int loc2Insert(int[] arr, int k) {
    int low = 0, high = arr.length - 1, ans = arr.length;

    while (low < high) {
        final int mid = (low + high) / 2, ele = arr[mid];

        if (ele >= k) {
            high = mid -1;
            ans = mid;
        } else {
            low = mid+1;
        }
    }
    return ans;
}

void main() {
    int[] arr = {1, 2, 4, 7};
    int x = 6;
    System.out.println("The lower bound for " + x + " is: " + loc2Insert(arr, x));
}
