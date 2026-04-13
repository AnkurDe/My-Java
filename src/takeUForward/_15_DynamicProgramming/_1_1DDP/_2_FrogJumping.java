// Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair.
// At a time the frog can climb either one or two steps.
// A height[N] array is also given.
// Whenever the frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference.
// We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1 ...


/*
Define a recursive function solve(ind) that returns the minimum cost to reach index ind
Base case: solve(0) = 0, since starting at the first stone has no cost.
For each index, calculate:
    Jump One: Cost from ind-1 to ind.
    Jump Two: Cost from ind-2 to ind (only if ind > 1).
Take the minimum of both jumps and store it in the DP array for reuse.
Finally, return solve(n-1) as the answer.
*/
int frogJumpMemoization(int index, int[] height, int[] dp) {
    if (index == 0) return 0;

    if (dp[index] != -1) return dp[index];

    int jumpOne = frogJumpMemoization(index - 1, height, dp) + Math.abs(height[index] - height[index - 1]);
    int jumpTwo = Integer.MAX_VALUE;

    if (index > 1)
        jumpTwo = frogJumpMemoization(index - 2, height, dp) + Math.abs(height[index] - height[index - 2]);

    dp[index] = Math.min(jumpOne, jumpTwo);

    return dp[index];
}

int frogJumpMemoization(int[] height) {
    int[] dp = new int[height.length];
    Arrays.fill(dp, -1);
    return frogJumpMemoization(height.length -1, height, dp);
}

void tester(int[] height) {
    System.out.printf("The minimum energy required is: %d\n", frogJumpMemoization(height));
}

void main() {
    int[][] heights = {
            {2, 1, 3, 5, 4},
            {7, 5, 1, 2, 6},
            {30, 10, 60, 10, 60, 50}
    };

    for (int[] height : heights)
        tester(height);
}