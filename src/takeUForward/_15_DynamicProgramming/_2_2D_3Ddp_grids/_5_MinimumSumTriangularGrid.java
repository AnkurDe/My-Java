/**
 * <h1>Problem Statement</h1>
 * Given a 2D integer array named triangle with n rows. Its first row has 1 element and each succeeding row has one more element in it than the row above it. Return the minimum falling path sum from the first row to the last.
 * Movement is allowed only to the bottom or bottom-right cell from the current cell.
 */

int minSumPathTriangular(int[][] grid) {
    final int length = grid.length;
    int[] arr = Arrays.copyOf(grid[length - 1], length);

    for (int row = length - 2; row >= 0; row--) {
        for (int col = 0; col <= row; col++) {
            arr[col] = grid[row][col] + Math.min(arr[col], arr[col + 1]);
        }
    }

    return arr[0];
}

void testing(int[][] grid) {
    System.out.printf("The grid has minimum sum path of %d\n", minSumPathTriangular(grid));
}

void main() {
    int[][][] grids ={
            {
                    {1},
                    {1, 2},
                    {1, 2, 4}
            },
            {
                    {1},
                    {4, 7},
                    {4, 10, 50},
                    {-50, 5, 6, -100}
            }
    };

    for (int[][] grid : grids)
        testing(grid);
}