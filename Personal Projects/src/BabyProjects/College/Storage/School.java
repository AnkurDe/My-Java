package BabyProjects.College.Storage;

import BabyProjects.College.Student;

import java.util.HashMap;

public class School implements Stg{
    // Courses offered in a School
    private HashMap<BabyProjects.College.Storage.enums.Course, Course> courseHashMap;

    public School() {
        courseHashMap = new HashMap<>(70, 0.9F);
    }

    @Override
    public void add(Student student) {
        Course course = courseHashMap.get(student.getCourse());
        course.add(student);
    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public void get(Student student) {

    }
}
