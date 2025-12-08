package Baby_level;

import java.util.Scanner;
import java.util.Stack;

public class Test_ground {
    int id;
    String name;
    Test_ground (){
        System.out.println("Default constructor");
    }
    Test_ground (int j, String n){
        id = j;
        name = n;

    }

    public static void main(String[] args) {
        Test_ground t1 = new Test_ground();
        System.out.println("Value of id: "+t1.id);
        System.out.println("Value of " + t1.name);
        Test_ground t2 = new Test_ground(100, "Ankur");
        System.out.println("Value of id: "+t2.id);
        System.out.println("Value of " + t2.name);
    }
}
