package Function_Library.Matrix_operations.V2;

// For taking diagonal products of elements
public class DP extends RREF {
    public static double diag_prod(double[][] Matrix) {
        double dp = 1;
        for (int i = 0; i < Matrix.length; i++) {
            dp *= Matrix[i][i];
        }
        return dp;
    }
}
