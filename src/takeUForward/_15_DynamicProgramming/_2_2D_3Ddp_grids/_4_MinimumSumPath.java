/**
 * <h1>Problem Statement</h1>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 */

int minSumPath(int[][] grid) {
    final int rows = grid.length, cols = grid[0].length;
    final int[] arr = new int[cols];
    arr[0] = grid[0][0];

    // Initialize the first row
    for (int i = 1; i < cols; i++) {
        arr[i] = arr[i-1] + grid[0][i];
    }

    // Use DP for the rest
    for (int i = 1; i < rows; i++) {
        arr[0] += grid[i][0];
        for (int j = 1; j < cols; j++) {
            arr[j] = grid[i][j] + Math.min(arr[j-1], arr[j]);
        }
    }


    return arr[cols - 1];
}

void testing(int[][] grid) {
    System.out.printf("The minimum path on grid is %d\n", minSumPath(grid));
}

void main() {
    int[][][] grids = {
            {
                    {5, 9, 6},
                    {11, 5, 2}
            }
    };
    for (int[][] grid : grids)
        testing(grid);
}