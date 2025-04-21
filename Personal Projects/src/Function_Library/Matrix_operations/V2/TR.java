package Function_Library.Matrix_operations.V2;

// Transpose of matrix
// Incomplete
public class TR extends sq {
    public static double[][] Transpose(double[][] input) {
        double[][] result = new double[input[0].length][input.length];
        for (int i = 0; i < input.length; i++)
            for (int j = 0; j < input[0].length; j++)
                result[j][i] = input[i][j];
        return result;
    }

    public static float[][] Transpose(float[][] input) {
        float[][] result = new float[input[0].length][input.length];
        for (int i = 0; i < input.length; i++)
            for (int j = 0; j < input[0].length; j++)
                result[j][i] = input[i][j];
        return result;
    }
}
