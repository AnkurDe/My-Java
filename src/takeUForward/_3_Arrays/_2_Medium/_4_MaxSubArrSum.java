// Finding maximum sum of subarrays

int maximumSubArray(int[] arr) {
    int sum = 0, max = Integer.MIN_VALUE;
    final int length = arr.length;

    for (final int j : arr) {
        sum += j;

        if (sum > max)
            max = sum;

        if (sum < 0)
            sum = 0;
    }
    return max;
}

void testing(int[] arr) {
    System.out.printf("Array: %s\nMaximum sum of subarray is: %d\n\n", Arrays.toString(arr), maximumSubArray(arr));
}

void main() {
    int[][] numsArr = new int[][]{
            {2, 3, 5, -2, 7, -4},
            {-2, -3, -7, -2, -10, -4},
            {-2, 1, -3, 4, -1, 2, 1, -5, 4},
            {1},
            {5, 4, -1, 7, 8}
    };

    for (int[] nums : numsArr)
        testing(nums);

}
