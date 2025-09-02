package BabyProjects.College;

import BabyProjects.College.Storage.enums.Campus;

import java.util.HashMap;

public class StorageManager {

    private final HashMap<Campus, BabyProjects.College.Storage.Campus> hashMap;

    public StorageManager() {
        hashMap = new HashMap<>(Campus.values().length + 1, 1.0F);
    }

    public void addStudent(Student student) {
        BabyProjects.College.Storage.Campus campus = hashMap.get(student.getCampus());
        campus.add(student);
    }
}
