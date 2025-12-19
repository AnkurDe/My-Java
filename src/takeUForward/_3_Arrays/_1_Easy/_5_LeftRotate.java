void optimal(int[] arr) {
    int temp= arr[0];
    for (int i = 1; i < arr.length; i++) {
        arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
}

void main() {
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(arr));
    optimal(arr);
    System.out.println(Arrays.toString(arr));
}