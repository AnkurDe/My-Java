package Function_Library.Matrix_operations.V2;

// To perform matrix multiplication
public class Mult extends chkr {
    public static double[][] Multiply(double[][] A, double[][] B) {
        complm(A, B);
        double[][] result = new double[A.length][B[0].length];
        Zeros(result);
        //rows
        for (int i = 0; i < A.length; i++) {
            //columns
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }//Tested ok

    public static float[][] Multiply(float[][] A, float[][] B) {
        complm(A, B);
        float[][] result = new float[A.length][B[0].length];
        Zeros(result);
        //rows
        for (int i = 0; i < A.length; i++) {
            //columns
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }//Tested ok
}
