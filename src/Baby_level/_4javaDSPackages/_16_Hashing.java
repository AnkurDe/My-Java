package Baby_level._4javaDSPackages;

import java.util.HashSet;

public class _16_Hashing {
    private static class Person{
        String name;
        int id;

        Person(String name, int id){
            this.name = name;
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            // Check if they represent the same memory address
            if (this == obj) return true;

            // Check if they are from the same classes
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;

            // Final check condition
            return person.id == id;
        }

        // hashCode works by length of the integer value
        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public String toString() {
            return
                    "(name: " + name +
                    ", id: " + id + ")";
        }
    }

    public static void main(String[] args) {
        Person temp = new Person("Ankur", 105);
        System.out.println(temp.getClass());
        System.out.println(temp.hashCode());

        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(temp);
        hashSet.add(new Person("Someone", 105)); // Ignored due to Hash Collision

        System.out.println("\n" + hashSet);
    }
}
