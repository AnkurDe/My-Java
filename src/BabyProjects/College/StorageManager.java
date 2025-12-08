package BabyProjects.College;

import BabyProjects.College.Storage.Enums.Campus;

import java.util.EnumMap;

public class StorageManager {

    private final EnumMap<Campus, BabyProjects.College.Storage.Campus> hashMap;

    public StorageManager() {
//        System.out.println("Running in: StorageManager()");
        hashMap = new EnumMap<>(Campus.class);
        for (Campus c : Campus.values()) {
//            System.out.println("new Campus: " + c.toString());
            hashMap.put(c, new BabyProjects.College.Storage.Campus());
        }

    }

    public void addStudent(Student student) {
        Campus temp = student.getCampus();
//        if (!hashMap.containsKey(temp)) {
//            System.out.println("x");
//            hashMap.put(temp, new BabyProjects.College.Storage.Campus());
//            System.out.println("Created School "+temp.toString());
//        }
        BabyProjects.College.Storage.Campus campus = hashMap.get(temp);
        campus.add(student);
    }
}
