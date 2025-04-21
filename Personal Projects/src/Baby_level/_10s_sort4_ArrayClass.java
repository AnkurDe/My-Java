package Baby_level;

// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;
import java.io.*;

// A class to represent a student.

// Driver class
public class _10s_sort4_ArrayClass {
    public static void main(String[] args)
    {
        Student_2[] arr = { new Student_2(111, "bbbb", "london"),
                new Student_2(131, "aaaa", "nyc"),
                new Student_2(121, "cccc", "jaipur") };

        System.out.println("Unsorted");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        Arrays.sort(arr, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
class Student_2 {
    int rollno;
    String name, address;

    // Constructor
    public Student_2(int rollno, String name,
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

class Sortbyroll implements Comparator<Student_2> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Student_2 a, Student_2 b)
    {
        return a.rollno - b.rollno;
    }
}

