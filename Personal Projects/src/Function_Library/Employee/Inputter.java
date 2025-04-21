package Function_Library.Employee;

import java.util.Scanner;

public class Inputter {
    public String string_input(){
        Scanner x = new Scanner(System.in);
        return x.nextLine();
    }

    public int int_input(){
        Scanner x = new Scanner(System.in);
        return x.nextInt();
    }

    public double double_input(){
        Scanner x = new Scanner(System.in);
        return x.nextDouble();
    }

    public float float_input(){
        Scanner x = new Scanner(System.in);
        return x.nextFloat();
    }
}
