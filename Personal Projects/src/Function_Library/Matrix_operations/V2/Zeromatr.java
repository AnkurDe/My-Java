package Function_Library.Matrix_operations.V2;

// To generate zero matrix
public class Zeromatr extends IS {
    public static double[][] Zeros(double[][] input) {
        for (int i = 0; i < input.length; i++) {
            int j;
            for (j = 0; j < input[0].length; j++) {
                input[i][j] = 0.0;
            }
        }
        return input;
    }//Tested ok
}
