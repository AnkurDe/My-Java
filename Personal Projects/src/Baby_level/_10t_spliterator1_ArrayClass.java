package Baby_level;

// Java program to demonstrate
// Arrays.spliterator() method

import java.util.Arrays;

public class _10t_spliterator1_ArrayClass {
    public static void main(String[] args)
    {

        // Get the Array
        int[] intArr = {10, 20, 15, 22, 35 };

        // To sort the array using normal sort
        System.out.println("Integer Array: "
                + Arrays.spliterator(intArr));
    }
}
