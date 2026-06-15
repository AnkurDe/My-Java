/**
 * <h1>Problem Statement</h1>
 * Given a sorted array of N integers, write a program to find the index of the first and last occurrence of the target key.
 * If the target is not found then return -1.
 * Note: Consider 0 based indexing
 */

int[] firstLast(int[] arr, int ele) {
    int[] fL = new int[2];
    Arrays.fill(fL, -1);
    int left = 0, right = arr.length - 1, left1 = 0, left2, right1, right2;

    while (left <= right) {
        int mid = (left - right) / 2 + left;
        if (arr[mid] == ele) {
            if (arr[left1] < ele) {
                left = left1;

            }
        } else {
            if (arr[left] < ele) {
                left = mid;
                left1 = mid;
                left2 = mid;
            } else if (arr[right] > ele) {
                right = ele;
                right1 = mid;
                right2 = mid;
            }
        }
    }

    return fL;
}

void testing(int[] arr, int num) {
    System.out.printf("The first and last elements in array containing %d is %s\n", num, Arrays.toString(firstLast(arr, num)));
}

void main() {
    int[][] arrays = {
            {3, 4, 13, 13, 13, 20, 40},
            {3, 4, 13, 13, 13, 20, 40},
    };
    int[] nums = {7, 13};

    for (int i = 0; i < arrays.length; i++) {
        testing(arrays[i], nums[i]);
    }
}