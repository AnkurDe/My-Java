package Function_Library.Matrix_operations.V2;

public class pm {
    // extends err
    public static void printMat(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("  " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void printMat(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("  " + matrix[i][j]);
            }
            System.out.println("");
        }
    }
}
