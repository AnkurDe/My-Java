void bubble_efficient(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        boolean swapped = true;
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j+1]) {
                final int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        if (!swapped){
            break;
        }
    }
}

void bubble_classic(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j+1]) {
                final int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

void main() {
    int[] arr = {10, 11, 5, -8, 7, 4, 8, 9, 3};
    System.out.println(Arrays.toString(arr));

    int[] arr1 = arr.clone();
    bubble_classic(arr1);
    System.out.println(Arrays.toString(arr1));


    int[] arr2 = arr.clone();
    bubble_efficient(arr2);
    System.out.println(Arrays.toString(arr2));
}