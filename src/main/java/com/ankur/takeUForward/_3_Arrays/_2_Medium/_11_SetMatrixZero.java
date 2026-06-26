int[][] deepCopy(int[][] matrix) {
    int[][] matr = new int[matrix.length][];

    for (int i = 0; i < matrix.length; i++) {
        matr[i] = matrix[i].clone();
    }

    return matr;
}

void better(int[][] matrix) {
    final int rows = matrix.length, cols = matrix[0].length;
    Set<Integer> zeroCols = new HashSet<>();
    Set<Integer> zeroRows = new HashSet<>();

    for (int currRow = 0; currRow < rows; currRow++) {
        for (int currCol = 0; currCol < cols; currCol++) {
            if (matrix[currRow][currCol] == 0) {
                zeroCols.add(currCol);
                zeroRows.add(currRow);
            }
        }
    }

    for (int row : zeroRows) {
        for (int col = 0; col < cols; col++) {
            matrix[row][col] = 0;
        }
    }

    for (int col : zeroCols) {
        for (int row = 0; row < rows; row++) {
            matrix[row][col] = 0;
        }
    }
}

void optimal(int[][] matrix) {
    final int rows = matrix.length, cols = matrix[0].length;

    boolean firstRowZero = false, firstColZero = false;

    // Check if first row has any zero
    for (int i = 0; i < cols; i++) {
        if (matrix[0][i] == 0) {
            firstRowZero = true;
            break;
        }
    }

    for (int i = 0; i < rows; i++) {
        if (matrix[i][0] == 0) {
            firstColZero = true;
            break;
        }
    }

    // Use first row as row/column markers
    for (int i = 1; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][0] = 0;
                matrix[0][j] = 0;
            }
        }
    }

    // Set cells to zero based markers
    for (int i = 1; i < rows; i++) {
        for (int j = 1; j < cols; j++) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0;
            }
        }
    }

    if (firstRowZero) {
        for (int i = 0; i < cols; i++) {
            matrix[0][i] = 0;
        }
    }

    if (firstColZero) {
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = 0;
        }
    }
}

String matrixToString(int[][] matrix) {
    StringBuilder sb = new StringBuilder();

    for (int[] arr : matrix)
        sb.append(Arrays.toString(arr)).append("\n");

    return sb.toString();
}

void testing(int[][] matrix) {
    System.out.println("The matrix is");
    System.out.println(matrixToString(matrix));

    int[][] matrix1 = deepCopy(matrix);
    int[][] matrix2 = deepCopy(matrix);

    better(matrix1);
    System.out.println("The transformed is --better");
    System.out.println(matrixToString(matrix));

    optimal(matrix2);
    System.out.println("The transformed is --optimal");
    System.out.println(matrixToString(matrix2));

    System.out.println("--------------------------------");
}

void main() {
    int[][][] matrices = {{{1, 1, 1}, {1, 0, 1}, {1, 1, 1},},

            {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5},}};

    for (int[][] matrix : matrices)
        testing(matrix);
}