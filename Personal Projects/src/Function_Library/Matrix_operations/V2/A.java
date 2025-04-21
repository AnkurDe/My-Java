package Function_Library.Matrix_operations.V2;

// For performing Addition
public class A extends S {
    public static double[][] Add(double[][] A, double[][] B) {
        checker(A, B);
        double[][] Sum = new double[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return Sum;
    }// Tested Ok

    public static float[][] Add(float[][] A, float[][] B) {
        checker(A, B);
        float[][] Sum = new float[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }
        return Sum;
    }// Tested Ok
}
