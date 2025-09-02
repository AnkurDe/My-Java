package Baby_level;

import java.util.HashMap;

public class _16a_Hashing_Many {
    private static class Student {
        String name;
        int roll;

        public Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }
    }

    HashMap<Integer, Student> byRoll = new HashMap<>();
    HashMap<Integer, Student> byName = new HashMap<>();

    void add(Student student) {
        byRoll.put(student.roll, student);
        byName.put(student.name.length(), student);// Used String in real life but hashed by integer
    }

    public static void main(String[] args) {

    }
}
