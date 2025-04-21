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
}
