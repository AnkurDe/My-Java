package Baby_level._4javaDSPackages;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _15_HashMap_BigExample {

    private static final HashMap<String, Student> nameMap = new HashMap<>();
    private static final HashMap<Long, Student> numberMap = new HashMap<>();
    private static final HashMap<Integer, Student> idMap = new HashMap<>();

    private static void loopMapByKey() {
        for (String name : nameMap.keySet())
            System.out.println(name);
    }

    private static void loopByValues() {
        for (Student s : nameMap.values()) {
            System.out.println(s);
        }
    }

    private static void loopByKeyValuePairs() {
        for (Map.Entry<String, Student> entry : nameMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void clearAllData() {
        numberMap.clear();
        nameMap.clear();
        idMap.clear();
    }

    private static void addStudent(String name, long number, int id) {
        Student std = new Student(name, number, id);
        nameMap.put(name, std);
        numberMap.put(number, std);
        idMap.put(id, std);
    }

    private static void removeStudent(String name, long number, int id) {
        if (idMap.containsValue(new Student(name, number, id))){
            nameMap.remove(name);
            numberMap.remove(number);
            idMap.remove(id);
        }
    }

    private static class Student {
        String name;
        long number;
        int id;

        public Student (String name, long number, int id){
            this.id = id;
            this.number = number;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Number: " + number + ", ID: " + id;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return number == student.number && id == student.id && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, number, id);
        }
    }

    public static void main(String[] args) {
        addStudent("Ankur", 7337734076L, 24105);
        addStudent("Amishi", 4165948305L, 24204);
        addStudent("Jiya", 4154468954L, 24123);
        System.out.println(nameMap.get("Jiya"));
        System.out.println(idMap.get(24204));
        System.out.println(numberMap.get(7337734076L) + "\n");

        System.out.println(nameMap.get("Utham"));

        System.out.println(nameMap.containsKey("Ankur") ? "Ankur's there in the map" : "Ankur's not there in the map");
        System.out.println(nameMap.containsKey("Pavitra") ? "Pavitra's there in the map" : "Pavitra's not there in the map");

        System.out.println(idMap.containsValue(new Student("Ankur", 7337734076L, 24105)) ? "These values are in the map" : "These values are not in teh map");

        System.out.println("\nLooping by key");
        loopMapByKey();

        System.out.println("\nLooping by values");
        loopByValues();

        System.out.println("\nLooping by Key-Value pairs");
        loopByKeyValuePairs();

        System.out.println("\n" + nameMap);
        removeStudent("Jiya", 4154468954L, 24123);
        System.out.println(nameMap);

        System.out.println("Size of map is: " + idMap.size());

        clearAllData();
        System.out.println(idMap);
    }
}
