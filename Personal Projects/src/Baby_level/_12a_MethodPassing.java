package Baby_level;

public class _12a_MethodPassing {

    private static class Student {

        // Properties Declared
        int id;
        String name;

        @Override
        public String toString() {
            return "Id: " + id +"\nName: " + name;
        }
    }

    public static void main(String[] args)
    {
        Student obj = new Student();

        obj.id = 1;
        obj.name = "ABC";

        System.out.println(obj);
    }
}
