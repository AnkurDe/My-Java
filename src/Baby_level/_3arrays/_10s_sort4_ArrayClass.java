package Baby_level._3arrays;

// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;

// A class to represent a student.

// Driver class
public class _10s_sort4_ArrayClass {

    private static class Student {
        int rollno;
        String name, address;

        // Constructor
        public Student(int rollno, String name,
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

    private static class SortByRoll implements Comparator<Student> {

        // Used for sorting in ascending order of
        // roll number
        public int compare(Student a, Student b)
        {
            return a.rollno - b.rollno;
        }
    }

    public static void main(String[] args)
    {
        Student[] arr = { new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur") };

        System.out.println("Unsorted");
        for (Student student : arr) System.out.println(student);

        Arrays.sort(arr, new SortByRoll());

        System.out.println("\nSorted by roll number");
        for (Student student : arr) System.out.println(student);
    }
}
