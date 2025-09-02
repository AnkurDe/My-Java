package BabyProjects.College.Storage;

import BabyProjects.College.Student;

import java.util.HashMap;

public class Course implements Stg{
    // All the sections in the given year
    private HashMap<Integer, Section> sectionHashMap;

    @Override
    public void add(Student student) {
        Section section = sectionHashMap.get(student.getSection());
        section.add(student);
    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public void get(Student student) {

    }
}
