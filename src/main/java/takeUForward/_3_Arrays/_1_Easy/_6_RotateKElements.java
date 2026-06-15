// Working
// 1. reverse entire array
// 2. Reverse first k elements
// 3. Fix remaining elements
void rotateK(int[] arr, int k) {
    int n = arr.length;
    k = k%n;

    reverse(arr, 0, n -1);
    reverse(arr, 0, k-1);
    reverse(arr, k, n-1);
}

void reverse(int[] arr, int left, int right) {
    while (left < right) {
        int temp = arr[left];
        arr[left++] = arr[right];
        arr[right--] = temp;
    }
}

void main() {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(arr));
    rotateK(arr, 3);
    System.out.println(Arrays.toString(arr));
    rotateK(arr, 2);
    System.out.println(Arrays.toString(arr));
    rotateK(arr, 1);
    System.out.println(Arrays.toString(arr));
}