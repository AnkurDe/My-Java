package BabyProjects.College.Storage;

import BabyProjects.College.Student;

import java.util.HashMap;

public class Section implements Stor<Student> {
    // Students in a section
    private final HashMap<Integer, Student> studentHashMap;

    public Section() {
        this.studentHashMap = new HashMap<>(80, 0.95F);
    }

    @Override
    public void add(Student student) {
        int temp = student.getClassSeating();
        if (studentHashMap.containsKey(temp))
            throw new IllegalCallerException("The student already exists");
        studentHashMap.put(temp, student);

        System.out.println("Student added");
        System.out.println(studentHashMap.get(temp));
    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public Student get(String roll) {
        // 05
        return studentHashMap.get(Integer.parseInt(roll));
    }
}
