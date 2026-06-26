int[] floorCeil(int[] arr, int k) {
    int low = 0, high = arr.length - 1, floor = -1;

    while (low <= high) {
        final int mid = (low + high) / 2, ele = arr[mid];
        if (ele < k) {
            floor = arr[mid];
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    low = 0;
    high = arr.length-1;
    int ceil = -1;
    while (low <= high) {
        final int mid = (low + high) / 2, ele = arr[mid];
        if (ele >= k) {
            ceil = arr[mid];
            high = mid-1;
        } else {
            low = mid + 1;
        }
    }
    return new int[] {floor, ceil};
}

void main() {
    int[] arr = {3, 4, 4, 7, 8, 10};
    int x = 5;
    int[] res = floorCeil(arr, x);
    System.out.println("The floor and ceil are: " + res[0] + " " + res[1]);
}