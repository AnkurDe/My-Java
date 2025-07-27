package Baby_level;

import java.util.Arrays;
import java.util.HashSet;

public class _14_HashSet {
    public static void main(String[] args) {
        System.out.println("Hash set Initialised");
        HashSet<String> hs = new HashSet<>();
        System.out.println(hs);

        hs.add("Apple");
        System.out.println(hs);

        hs.add("Mango");
        System.out.println(hs);

        hs.add("Mango"); // Duplicate - won't be added
        System.out.println(hs);

        hs.add("Peach");
        System.out.println(hs);

        hs.remove("Apple");
        System.out.println(hs);

        System.out.println(hs.contains("Peach") ? "Has Peach": "Does not have Peach");
        System.out.println(hs.contains("Pear") ? "Has Pear": "Does not have Pear");

        System.out.println("Size of hashset is " + hs.size());

        System.out.println(Arrays.toString(hs.toArray()));

        hs.clear();
        System.out.println(hs);
    }
}
