package Baby_level;

import java.util.ArrayList;
import java.util.Iterator;

public class _18_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add("Apple");
        a.add("Banana");
        a.add("Pineapple");
        System.out.println("Original List: " + a);

        a.add(2, "Cherry");
        System.out.println("List changed: " + a);

        a.remove(1);
        System.out.println("Removed from location 1: " + a);

        a.removeFirst();
        System.out.println("After doing removeFirst(): " + a);

        a.remove("Cherry");
        System.out.println("After removing ");

        a.add("Apple");
        a.add("Banana");

        // Using for loop to traverse
        System.out.println("Use for loop to traverse");
        for (int i = 0; i < a.size(); i++) {
            System.out.println("Element at " + i + ": " + a.get(i));
        }


        // Using ForEach to traverse
        System.out.println("Using For loops to traverse");
        for (String s : a) {
            System.out.println(s);
        }

        // Using Iterator to traverse
        System.out.println("Using Iterator to traverse");
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Using Stream API");
        a.forEach(System.out::println);
    }
}
