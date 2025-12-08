package Baby_level._2objectsClasses;

public class _5_Methods {
    private int num;
    private String n;

    // Accessor (getter) methods
    public int getNumber() {
        return num;
    }
    public String getName() {
        return n;
    }

    // Mutator (setter) methods
    public void setNumber(int num) {
        this.num = num;
    }
    public void setName(String n) {
        this.n = n;
    }

    // Other methods
    public void printDetails() {
        System.out.println("Number: " + num);
        System.out.println("Name: " + n);
    }

    // _10g_copyOfRange_ClassArray method to run the code
    public static void main(String[] args) {
        _5_Methods g = new _5_Methods();
        g.setNumber(123);   // Set the number
        g.setName("_12a_MethodPassing Write");   // Set the name
        g.printDetails();
    }

    public static class _12a_MethodPassing {

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
}
