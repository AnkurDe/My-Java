package Function_Library.Matrix_operations.V2;

public class compl extends pm {
    // Checks compatibility for addition, subtraction, individual operation
    public static boolean compla(double[][] A, double[][] B) {
        return A.length != B.length || A[0].length != B[0].length;
    }// Not tested

    public static boolean compla(float[][] A, float[][] B) {
        return A.length != B.length || A[0].length != B[0].length;
    }// Not tested

    // Checks compatibility for multiplication
    public static void complm(double[][] A, double[][] B) {
        if (A.length != B[0].length) {
            throw new DimensionErrorException("The matrix is not compatible for multiplication");
        }
    }// Not tested

    public static void complm(float[][] A, float[][] B) {
        if (A.length != B[0].length) {
            throw new DimensionErrorException("The matrix is not compatible for multiplication");
        }
    }// Not tested

}
