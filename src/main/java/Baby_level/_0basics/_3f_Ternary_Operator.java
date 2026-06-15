package Baby_level._0basics;

public class _3f_Ternary_Operator {

    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 30, result;

        // result holds a max of three
        // numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = "+ result);
    }
}
