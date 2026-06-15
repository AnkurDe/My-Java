/**
 * <h1>Problem Statement</h1><br>
 * Ninja is planning to train for N days. On each day,
 * they can perform any one of three training activities:
 * <br>
 * <ol>
 *     <li>Running</li>
 *     <li>Fighting Practice</li>
 *     <li>Learning New Moves</li>
 * </ol>
 * Each activity yields a specific amount of merit points, which can vary from day to day.
 * To keep things interesting and maximize their overall development, Ninja has a strict rule:
 * They cannot perform the same activity on two consecutive days.
 * Given a 2D array (or matrix) points of size N x 3, where points[i][0],
 * points[i][1], and points[i][2] represent the merit points gained for the three activities on the i-th day,
 * find the maximum total merit points Ninja can earn after N days of training.
 * <br>
 * <h1>Input Format</h1>
 * <ol>
 *     <li>An integer N, representing the total number of training days.</li>
 *     <li>A 2D array points of size N x 3, where each row represents a day and the 3 columns contain the merit points for each of the three activities on that day.</li>
 * </ol>
 * <h1>Output Format</h1>
 *     Return a single integer representing the maximum total merit points Ninja can accumulate.
 */

void spaceOptimised(int[][] matrix, int[] dp, int n) {
    if (n == matrix.length - 1) {
        int max = Integer.MIN_VALUE, maxPos = -1;
        for (int i = 0; i < matrix[n].length; i++) {
            if (max < matrix[n][i]) {
                max = matrix[n][i];
                maxPos = i;
            }
        }
        System.out.print(max + ", ");
        dp[n] = maxPos;
        return;
    }
    spaceOptimised(matrix, dp, n + 1);
    int prevChoice = dp[n + 1], max = Integer.MIN_VALUE, maxPos = -1;
    for (int i = 0; i < matrix[n].length; i++) {
        if (i != prevChoice) {
            if (max < matrix[n][i]) {
                max = matrix[n][i];
                maxPos = i;
            }
        }
    }
    System.out.print(max + ", ");
    dp[n] = maxPos;
}


int spaceOptimised(int[][] matrix) {
    int[] dp = new int[matrix.length]; // Stores the done on each day in the array based on index
    Arrays.fill(dp, -1);
    spaceOptimised(matrix, dp, 0);
    int sum = 0;
    for (int i = 0; i < dp.length; i++) {
        sum += matrix[i][dp[i]];
    }
    return sum;
}

int tabulation(int[][] matrix) {
    int[][] dp;
    return 0;
}

int memoization(int[][] matrix) {
    return 0;
}

void testing(int[][] matrix) {
    System.out.println("The maximum number using memoization is: " + memoization(matrix));
    System.out.println("The maximum number using tabulation is: " + tabulation(matrix));
    System.out.println("The maximum number using space optimization is: " + spaceOptimised(matrix));
}

void main() {
    int[][][] testMatrices = {
            {
                    {10, 40, 70},
                    {20, 50, 80},
                    {30, 60, 90}
            },
            {
                    {70, 40, 10},
                    {180, 20, 5},
                    {200, 60, 30}
            },
            {
                    {100, 10, 10},
                    {100, 90, 10},
                    {10, 10, 100}
            }
    };

    for (int[][] matrix : testMatrices)
        testing(matrix);
}
