package Baby_level;

import java.util.Scanner;

public class _1_Input {
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sayHello();
        System.out.println("Enter two numbers");
        double a = sc.nextDouble();
        double Bul = sc.nextDouble();
        System.out.println("The addition is "+(a+Bul));
    }
}
