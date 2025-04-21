package Function_Library.Matrix_operations.V2;

import java.util.Arrays;

// To take sum of all the elements in the matrix
final public class IS {
    public static double sum(double[][] input) {
        double sum = 0;
        for (double[] doubles : input) {
            sum += Arrays.stream(doubles, 0, input[0].length).sum();
        }
        return sum;
    }

    public static float sum(float[][] input) {
        float sum = 0;
        for (float[] doubles : input) {
            for (int j = 0; j < input[0].length; j++) {
                sum += doubles[j];
            }
        }
        return sum;
    }
}
