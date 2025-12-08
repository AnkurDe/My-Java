package Baby_level._2objectsClasses;

public class _6_Variable_Arguements {
    // Method that accepts variable number
    // of String arguments using varargs
    public static void Names(String... n) {

        // Iterate through the array
        // and print each name
        for (String i : n) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int Addm(int... a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }

    static void fun2(String s, int... a) {
        System.out.println("String: " + s);
        System.out.println("Number of arguments is: "
                + a.length);

        // using for each loop to
        // display contents of a
        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Calling the 'Names' method with
        // different number of arguments
        Names("geek1", "geek2");
        Names("geek1", "geek2", "geek3");
        System.out.println("The addition is " + Addm(1, 2, 3));
        System.out.println("The addition is " + Addm(1, 2, 3, 4, 5) + "\n\n");
        fun2("Ankur", 1, 3, 9);
        fun2("Someone", 1, 4);
    }
}
