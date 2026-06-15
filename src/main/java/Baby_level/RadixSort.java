import java.util.Arrays;

void countingSort(int[] arr, int exp) {
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];

    for (int i = 0; i < n; i++) {
        count[(arr[i] / exp) % 10]++;
    }

    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    for (int i = n - 1; i >= 0; i--) {
        int digit = (arr[i] / exp) % 10;
        output[count[digit] - 1] = arr[i];
        count[digit]--;
    }

    System.arraycopy(output, 0, arr, 0, n);
}

void radixSort(int[] arr) {
    // Find maximum number
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max)
            max = arr[i];
    }

    // Apply counting sort for every digit
    for (int exp = 1; max / exp > 0; exp *= 10) {
        countingSort(arr, exp);
    }
}

void main(String[] args) {
    int[] data = {170, 45, 75, 90, 802, 24, 2, 66};

    System.out.println("Before sorting: " + Arrays.toString(data));

    radixSort(data);

    System.out.println("After sorting:  " + Arrays.toString(data));
}
