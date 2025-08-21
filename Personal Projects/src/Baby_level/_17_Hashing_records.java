package Baby_level;

import java.util.HashSet;
import java.util.Objects;

public class _17_Hashing_records {
    private static record Person(String name, int id) {

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public String toString() {
            return "name: " + name +
                    ", id: " + id;
        }
    }
    public static void main(String[] args) {
        Person ank = new Person("Ankur", 105);
        System.out.println(ank);
        Person temp = new Person("Someone", 105); // Hash collision
        System.out.println(ank.equals(temp));

        HashSet<Person> hs = new HashSet<>();
        hs.add(ank);
        hs.add(temp);
        hs.add(new Person("Person", 205)); // Added to HashSet
        hs.remove(new Person("ABD", 555));
        System.out.println(hs);
    }
}
