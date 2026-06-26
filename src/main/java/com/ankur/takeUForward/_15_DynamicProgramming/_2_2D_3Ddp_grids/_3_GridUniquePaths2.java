/**
 * <h1>Problem Statement</h1>
 * Given an m x n 2d array named matrix, where each cell is either 0 or 1. Return the number of unique ways to go from the top-left cell (matrix[0][0]) to the bottom-right cell (matrix[m-1][n-1]). A cell is blocked if its value is 1, and no path is possible through that cell.
 */

int noUniquePaths2(int[][] grid) {
    int rows = grid.length, cols = grid[0].length;
    if (grid[0][0] == 1 || grid[rows-1][cols-1] == 1) return 0;
    int[] arr = new int[cols];

    for (int i = 0; i < cols; i++) {
        if (grid[0][i] == 0) {
                arr[i] = 1;
            } else {
                break;
            }
    }
    
    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (grid[i][j] == 0) {
                arr[j] += arr[j - 1];
            } else {
                arr[j] = 0;
            }
        }
    }
    return arr[cols - 1];
}

void testing(int[][] grid) {
    System.out.printf("The number of unique paths in grid is %d\n", noUniquePaths2(grid));
}

void main() {
    int[][][] grids = {
            {
                    {0, 0, 0},
                    {0, 1, 0},
                    {0, 0, 0}
            },
            {
                    {0, 0, 0},
                    {0, 0, 1},
                    {0, 1, 0}
            }
    };

    for (int[][] grid : grids) {
        testing(grid);
    }
}
