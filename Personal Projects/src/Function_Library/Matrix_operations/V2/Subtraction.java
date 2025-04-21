package Function_Library.Matrix_operations.V2;

import static Function_Library.Matrix_operations.V2.Checker.checker;

// For performing subtraction
final public class S {
    public static double[][] Subtr(double[][] A, double[][] B) {
        checker(A, B);
        double[][] Subract = new double[A.length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A.length; j++)
                Subtract[i][j] = (A[i][j] - B[i][j]);
        return Subtract;
    }//Tested ok
}
