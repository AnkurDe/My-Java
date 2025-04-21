package Baby_level;

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
}
