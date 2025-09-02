package BabyProjects.College.Storage;

import BabyProjects.College.Student;

import java.util.HashMap;

// Class of a campus
public class Campus implements Stg{
    // Schools in a campus
    final private HashMap<BabyProjects.College.Storage.enums.School, School> hashMap;

    public Campus() {
        hashMap = new HashMap<>();
    }

    public void add(School school) {

    }

    @Override
    public void add(Student student) {
        School school = hashMap.get(student.getSchool());
        school.add(student);
    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public void get(Student student) {

    }
}
