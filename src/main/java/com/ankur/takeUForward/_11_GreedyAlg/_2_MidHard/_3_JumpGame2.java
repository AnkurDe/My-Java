/*
Problem Statement:
You are given a 0-indexed array nums of length n representing your maximum jump capability from each index.
You start at index 0. Each element nums[i] represents the maximum number of steps you can jump forward from index i.
Your goal is to reach the last index of the array (nums[n - 1]) using the minimum number of jumps
Return the minimum number of jumps required to reach the last index.

You can assume that it is always possible to reach the last index.
 */

int minStepsRequired(int[] arr) {
    int jumps = 0, currentEnd = 0, farthest = 0;

    for (int i = 0; i < arr.length - 1; i++) {
        farthest = Math.max(farthest, arr[i] + i);

        if (i == currentEnd) {
            jumps++;
            currentEnd = farthest;
        }
    }

    return jumps;
}

void testing(int[] arr) {
    System.out.printf("For %s the minimum number of steps required are: %d \n", Arrays.toString(arr), minStepsRequired(arr));
}

void main() {
    int[][] arrays = {
            {2, 3, 1, 1, 4},
    };

    for (int[] arr : arrays)
        testing(arr);
}
