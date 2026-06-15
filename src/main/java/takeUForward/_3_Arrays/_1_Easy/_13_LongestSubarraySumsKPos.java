// Longest Subarray with given Sum K(Positives)
// Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.

// Time complexity O(n) Space complexity O(1)
int optimal(int[] arr, int k) {
    int left = 0, sum = 0, maxLen = 0;
    final int length = arr.length;

    for (int right = 0; right < length; right++) {
        sum += arr[right];

        // Handles when sum of sliding window is greater than k then we need to move left pointer and adjust the sum of the window
        while (sum > k && left <= right)
            sum -= arr[left++];

        if (sum == k)
            maxLen = Math.max(maxLen, right - left + 1);

    }

    return maxLen;
}

void testing(int[] arr, int k, final int correct) {
    int ans = optimal(arr, k);
    System.out.printf("The length of longest subarray is %d --%s [Optimal]\n", ans, ans == correct);
}

void main() {
    int[] arr = new int[]{10, 5, 2, 7, 1, 9};
    testing(arr, 15, 4); // 4

    arr = new int[]{1, 2, 3, 4};
    testing(arr, 10, 4); // 4

    arr = new int[]{5, 1, 2, 3};
    testing(arr, 5, 2);// 2

    arr = new int[]{1, 1, 1, 1, 1};
    testing(arr, 3, 3); // 3

    arr = new int[]{0, 0, 0, 0};
    testing(arr, 0, 4);// 4
}