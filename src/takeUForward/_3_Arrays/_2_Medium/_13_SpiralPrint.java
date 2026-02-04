List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    int top = 0;
    int bottom = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
        // Traverse from left to right
        for (int i = left; i <= right; i++) {
            result.add(matrix[top][i]);
        }
        ++top;

        // Traverse from top to down
        for (int i = top; i <= bottom; i++) {
            result.add(matrix[i][right]);
        }
        --right;

        // Traverse from right to left
        if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            --bottom;
        }

        // Traverse from bottom to top
        if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            ++left;
        }
    }

    return result;
}

void testing(int[][] matrix) {
    System.out.println("The spiral print of matrix is");
    System.out.println(spiralOrder(matrix));
}

void main() {
    int[][][] matrices = {
            {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
            },
            {
                    {0, 1, 2, 0},
                    {3, 4, 5, 2},
                    {1, 3, 1, 5},
            }
    };

    for (int[][] matrix : matrices) {
        testing(matrix);
    }
}