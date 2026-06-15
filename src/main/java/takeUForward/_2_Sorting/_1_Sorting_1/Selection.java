void selection(int[] arr){
    for (int i = 0; i < arr.length -1; i++) {
        int minimumIndex = i;

        // Finding minimum element index
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minimumIndex]){
                minimumIndex = j;
            }
        }

        // We finally get the minimum index so now we can swap
        if (minimumIndex != i){
            int temp = arr[i];
            arr[i] = arr[minimumIndex];
            arr[minimumIndex] = temp;
        }
    }
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));
    selection(arr);
    System.out.println(Arrays.toString(arr));
}