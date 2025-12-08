package Baby_level._3arrays;

// Program to demonstrate 2-D jagged array in Java
public class _9_Jagged_Array {
    public static void main(String[] args){

        // Declaring 2-D array with 2 rows
        int arr[][] = new int[2][];

        // Making the above array Jagged
        arr[0] = new int[3];
        arr[1] = new int[2];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = count++;

        // Printing the Array Elements
        for (int[] ints : arr) {
            for (int anInt : ints) System.out.print(anInt + " ");
            System.out.println();
        }
    }
}
