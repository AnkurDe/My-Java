package Baby_level;

// Java program to demonstrate
// Arrays.deepEquals() method

import java.util.Arrays;

public class _10h_deepEquals_ClassArray {
    public static void main(String[] args)
    {

        // Get the Arrays
        int[][] intArr = { { 10, 20, 15, 22, 35 } };

        // Get the second Arrays
        int[][] intArr1 = { { 10, 15, 22 } };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.deepEquals(intArr, intArr1));
    }
}
