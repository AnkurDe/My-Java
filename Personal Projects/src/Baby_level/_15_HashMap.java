package Baby_level;

import java.util.HashMap;
import java.util.Map;

public class _15_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ankur", 105);
        map.put("Kartikeya", 146);
        map.put("Pavitra", 137);

        System.out.println("The map is ");
        System.out.println(map);

        System.out.println("\nGetting values by keys");
        System.out.println(map.get("Ankur"));
        System.out.println(map.get("Jiya"));

        System.out.println("\nChecking if has keys");
        System.out.println(map.containsKey("Amishi"));
        System.out.println(map.containsKey("Kartikeya"));

        System.out.println("\nChecking if it has values");
        System.out.println(map.containsValue(105));
        System.out.println(map.containsValue(123));

        System.out.println("\nRemoving Kartikeya");
        map.remove("Kartikeya");

        System.out.println("\nPrinting map");
        System.out.println(map);

        System.out.println("\nKeysets");
        System.out.println(map.keySet());
        System.out.println("\nValues");
        System.out.println(map.values());

        System.out.println("\nIterate over keyset");
        for (String name : map.keySet())
            System.out.println(name);

        System.out.println("\nIterate over values");
        for (int value : map.values())
            System.out.println(value);

        System.out.println("\nIterate over key-value pairs");
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue());

        System.out.println("\nSize of map is: " + map.size());

        System.out.println("\nClearing map");
        map.clear();

        System.out.println(map);
    }
}
