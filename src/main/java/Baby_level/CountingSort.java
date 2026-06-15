import java.util.Arrays;

void countingSort(int[] arr) {
    if (arr == null || arr.length == 0) {
        return;
    }

    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    int[] count = new int[max + 1];

    for (int value : arr) {
        count[value]++;
    }

    int index = 0;
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            arr[index++] = i;
            count[i]--;
        }
    }
}

void main(String[] args) {
    int[] data = {4, 2, 2, 8, 3, 3, 1};

    System.out.println("Before sorting: " + Arrays.toString(data));

    countingSort(data);

    System.out.println("After sorting:  " + Arrays.toString(data));
}