// A frog wants to climb a staircase with n steps.
// Given an integer array heights, where heights[i] contains the height of the ith step, and an integer k.
// To jump from the ith step to the jth step, the frog requires abs(heights[i] - heights[j]) energy, where abs() denotes the absolute difference.
// The frog can jump from the ith step to any step in the range [i + 1, i + k], provided it exists.
// Return the minimum amount of energy required by the frog to go from the 0th step to the (n-1)th step.


int frogJumpKDistances(int index, int[] height, int[] dp, int k) {
    if (index == 0) return 0;

    if (dp[index] != -1) return dp[index];

    int  cost = Integer.MAX_VALUE;
    for (int i = 1; i <= k; i++) {
        if (index - i >= 0) {
            int jump = frogJumpKDistances(index - i, height, dp, k) + Math.abs(height[index] - height[index - i]);
            cost = Math.min(cost, jump);
        }
    }
    dp[index] = cost;
    return cost;
}

int frogJumpKDistances(int[] height, int k) {
    int[] dp = new int[height.length];
    Arrays.fill(dp, -1);
    return frogJumpKDistances(height.length-1, height, dp, k);
}

void tester(int[] height, int k) {
    System.out.printf("The minimum energy required is: %d\n", frogJumpKDistances(height, k));
}

void main() {
    int[][] heights = {
            {10, 5, 20, 0, 15},
            {15, 4, 1, 14, 15},
            {30, 10, 60, 10, 60, 50}
    };
    int[] ks = {2, 3, 2};
    for (int i = 0; i < heights.length; i++) {
        tester(heights[i], ks[i]);
    }
}