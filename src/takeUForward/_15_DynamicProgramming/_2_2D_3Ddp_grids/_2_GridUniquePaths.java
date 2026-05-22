/**
 * <h1>Problem Statement</h1>
 * Problem Statement: Given two integers m and n, representing the number of rows and columns of a 2d array named matrix. Return the number of unique ways to go from the top-left cell (matrix[0][0]) to the bottom-right cell (matrix[m-1][n-1]).
 */

int uniquePaths(int m, int n) {
    // m number of rows and n columns
    int[] arr = new int[n];
    Arrays.fill(arr, 1);

    for (int i = 0; i < m-1; i++) {
        for (int j = 1; j < n; j++) {

        }
    }
    return arr[n-1];
}

void main() {

}