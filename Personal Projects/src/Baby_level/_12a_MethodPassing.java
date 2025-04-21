package Baby_level;

class Student_1 {

    // Properties Declared
    int id;
    String name;

    // Printing Student
    public void printStudent()
    {
        System.out.println("Id:" + id);
        System.out.println("Name:" + name);
    }
}

public class _12a_MethodPassing {
    public static void main(String[] args)
    {
        Student_1 obj = new Student_1();

        obj.id = 1;
        obj.name = "ABC";

        obj.printStudent();
    }
}
