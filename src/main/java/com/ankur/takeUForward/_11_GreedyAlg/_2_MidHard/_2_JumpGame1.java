/*
Problem Statement:
Given an array where each element represents the maximum number of steps you can jump forward from that element, return true if we can reach the last index starting from the first index.
Otherwise, return false.

Example:
arr = [2, 3, 1, 0, 4]
when in arr[0], since value is 2 it can go to arr[1] or arr[2]
when in arr[1], since value is 3 it can go to arr[2], arr[3] or arr[4]
 */

boolean canJump(int[] arr) {
    int maxIndex = 0;

    for (int i = 0; i < arr.length; i++) {
        if (i > maxIndex) {
            return false;
        }
        maxIndex = Math.max(maxIndex, i + arr[i]);
    }
    return true;
}

void testing(int[] arr) {
    System.out.printf("The array is %s\n", Arrays.toString(arr));
    System.out.printf(canJump(arr) ? "The frog can jump\n\n\n" : "The frog can not jump\n\n\n");
}

void main() {
    int[][] arrays = {
            {2, 3, 1, 0, 4},
            {3, 2, 1, 0, 4},
            {4, 3, 7, 1, 2}
    };
    for (int[] arr : arrays)
        testing(arr);
}
