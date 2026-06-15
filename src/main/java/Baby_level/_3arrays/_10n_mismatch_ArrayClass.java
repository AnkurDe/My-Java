package Baby_level._3arrays;

// Java program to demonstrate
// Arrays.mismatch() method

import java.util.Arrays;

public class _10n_mismatch_ArrayClass {
    public static void main(String[] args)
    {

        // Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };

        // Get the second Arrays
        int intArr1[] = { 10, 15, 22 };

        // To compare both arrays
        System.out.println("The element mismatched at index: "
                + Arrays.mismatch(intArr, intArr1));
    }
}
