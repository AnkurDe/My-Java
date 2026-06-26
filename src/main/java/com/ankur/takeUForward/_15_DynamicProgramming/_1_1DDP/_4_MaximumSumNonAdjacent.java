// Problem Statement: Given an array of N positive integers, we need to return the maximum sum of the subsequence such that no two elements of the subsequence are adjacent elements in the array.
//
//Note: A subsequence of an array is a list with elements of the array where some elements are deleted (or not deleted at all) and the elements should be in the same order in the subsequence as in the array.

int maxSumNonAdjacent(int[] arr, int index, int[] dp) {
    if (index < 0) return 0;

    if (index == 0) return arr[0];

    if (dp[index] != -1) return dp[index];

    int pick = arr[index] + maxSumNonAdjacent(arr, index - 2, dp);
    int notPick = maxSumNonAdjacent(arr, index - 1, dp);

    return dp[index] = Math.max(pick, notPick);
}

int maxSumNonAdjacent(int[] arr) {
    int[] dp = new int[arr.length];
    Arrays.fill(dp, -1);
    return maxSumNonAdjacent(arr, arr.length - 1, dp);
}

void tester(int[] arr) {
    System.out.printf("The maximum sum for non adjacent elements are %d\n", maxSumNonAdjacent(arr));
}

void main() {
    int[][] arrays = {
            {1, 2, 4},
            {2, 1, 4, 9},
    };

    for (int[] array : arrays)
        tester(array);
}
