void rotate(int[][] matrix) {
    final int n = matrix.length;
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            final int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n / 2; j++) {
            final int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - j - 1];
            matrix[i][n - j - 1] = temp;
        }
    }
}

String matrixToString(int[][] matrix) {
    StringBuilder sb = new StringBuilder();

    for (int[] arr : matrix)
        sb.append(Arrays.toString(arr)).append("\n");

    return sb.toString();
}

void main() {
    int[][][] matrices = {
            {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            },
            {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            },
            {
                    {5, 1, 9, 11},
                    {2, 4, 8, 10},
                    {13, 3, 6, 7},
                    {15, 14, 12, 16}
            }
    };


    for (int[][] matrix : matrices) {
        System.out.printf("Original\n%s\n", matrixToString(matrix));
        rotate(matrix);
        System.out.printf("Rotated\n%s\n\n\n", matrixToString(matrix));
    }
}