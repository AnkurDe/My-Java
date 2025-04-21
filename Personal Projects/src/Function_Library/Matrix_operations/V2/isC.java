package Function_Library.Matrix_operations.V2;

// To check for corruption
public class isC extends Zeromatr {
    public static boolean isCorrupt(double[][] input) {
        boolean result = false;
        if (input.length == 1) {
            result = true;
        } else {
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i].length != input[i + 1].length) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }//Tested ok

    public static boolean isCorrupt(float[][] input) {
        if (input.length == 1)
            return true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].length != input[i + 1].length) {
                return true;
            }
        }
        return false;
    }//Tested ok
}
