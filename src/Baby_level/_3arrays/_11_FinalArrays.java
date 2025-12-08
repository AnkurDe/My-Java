package Baby_level._3arrays;

// Can Be Reassigned But Not Re-referred

public class _11_FinalArrays  {
    public static void main(String[] args) {
        final int[] numbers = {1, 2, 3, 4, 5};

        // Modifying elements is allowed
        numbers[0] = 10;
        numbers[1] = 20;

        // This will work
        System.out.println(numbers[0]); // Output: 10
        System.out.println(numbers[1]); // Output: 20

        // Reassigning the array is NOT allowed
        // numbers = new int[]{6, 7, 8, 9, 10}; // Compilation error
    }
}
