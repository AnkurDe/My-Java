package Baby_level;

// Java program to demonstrate
// Arrays.deepToString() method

import java.util.Arrays;

public class _10j_deepToString_ArrayClass {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[][] = { { 10, 20, 15, 22, 35 } };

        // To get the deep String of the arrays
        System.out.println("Integer Array: "
                + Arrays.deepToString(intArr));
    }
}
