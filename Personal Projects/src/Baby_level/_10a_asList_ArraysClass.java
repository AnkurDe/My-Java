package Baby_level;

// Java Program to Demonstrate Arrays Class
// Via asList() method

// Importing Arrays utility class
// from java.util package
import java.util.Arrays;
class _10a_asList_ArraysClass {

    // _10g_copyOfRange_ClassArray driver method
    public static void main(String[] args)
    {
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35};

        // To convert the elements as List
        System.out.println("Integer Array as List: "
                + Arrays.asList(intArr));
    }
}
