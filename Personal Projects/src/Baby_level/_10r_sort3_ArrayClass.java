package Baby_level;

// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;

// A class to represent a student.
class student {
    int rollno;
    String name, address;

    // Constructor
    public student(int rollno, String name,
                   String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " "
                + this.name + " "
                + this.address;
    }
}

class Sortbyroll_1 implements Comparator<student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(student a, student b)
    {
        return a.rollno - b.rollno;
    }
}

// Driver class
class _10r_sort3_ArrayClass {
    public static void main(String[] args)
    {
        student[] arr = { new student(111, "bbbb", "london"),
                new student(131, "aaaa", "nyc"),
                new student(121, "cccc", "jaipur") };

        System.out.println("Unsorted");
        for (student value : arr) System.out.println(value);

        Arrays.sort(arr, 1, 2, new Sortbyroll_1());

        System.out.println("\nSorted by rollno");
        for (Baby_level.student student : arr) System.out.println(student);
    }
}
