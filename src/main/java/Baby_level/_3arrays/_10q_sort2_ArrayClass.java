package Baby_level._3arrays;

// Java program to demonstrate
// Arrays.sort() method

import java.util.Arrays;

public class _10q_sort2_ArrayClass {
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        // To sort the array using normal sort
        Arrays.sort(intArr, 1, 3);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
    }
}
