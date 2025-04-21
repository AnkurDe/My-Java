public class t {
    public static void main(String[] args) {
        String str = null;  // str is explicitly set to null
        System.out.println("Length of string: " + str.length());  // This line causes NullPointerException
    }
}
