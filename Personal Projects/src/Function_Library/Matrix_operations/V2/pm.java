package Function_Library.Matrix_operations.V2;

public class pm {
    // extends err
    public static void printMat(double[][] matrix) {
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("  " + doubles[j]);
            }
            System.out.println("");
        }
    }
}
