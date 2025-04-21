package Function_Library.Matrix_operations.V2;

// To check if the matrix is square matrix or not
public class sq extends compl {
    public static boolean isSquare(double[][] input) {
        return input.length == input[0].length;
    }
}
