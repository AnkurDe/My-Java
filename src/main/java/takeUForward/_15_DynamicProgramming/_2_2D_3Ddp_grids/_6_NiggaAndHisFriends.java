/**
 * <h1>Problem Statement</h1>
 * We are given an ‘N*M’ matrix. Every cell of the matrix has some chocolates on it, mat[i][j] gives us the number of chocolates. We have two friends ‘Alice’ and ‘Bob’. initially, Alice is standing on the cell(0,0) and Bob is standing on the cell(0, M-1). Both of them can move only to the cells below them in these three directions: to the bottom cell (↓), to the bottom-right cell(↘), or to the bottom-left cell(↙). When Alica and Bob visit a cell, they take all the chocolates from that cell with them. It can happen that they visit the same cell, in that case, the chocolates need to be considered only once. They cannot go out of the boundary of the given matrix, we need to return the maximum number of chocolates that Bob and Alice can together collect.
 */

int niggaAndHisFriends(int[][] grid) {
    return 0;
}

void testing(int[][] grid) {
    System.out.printf("\n", niggaAndHisFriends(grid));
}

void main() {
    int[][][] grids = {
            {
                    {2, 3, 1, 2},
                    {3, 4, 2, 2},
                    {5, 6, 3, 5}
            }
    };

    for (int[][] grid : grids)
        testing(grid);
}