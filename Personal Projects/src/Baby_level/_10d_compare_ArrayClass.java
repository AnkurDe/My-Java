package Baby_level;

// Java program to demonstrate
// Arrays.compare() method

import java.util.Arrays;

public class _10d_compare_ArrayClass {
    public static void main(String[] args)
    {

        // Get the Array
        int[] intArr = { 10, 20, 15, 22, 35 };

        // Get the second Array
        int[] intArr1 = { 10, 15, 22 };

        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(intArr, intArr1));
    }
}
