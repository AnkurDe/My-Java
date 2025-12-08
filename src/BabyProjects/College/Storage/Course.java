package BabyProjects.College.Storage;

import BabyProjects.College.Student;

import java.util.HashMap;

public class Course implements Stor<Section> {
    // All the sections in the given year
    private HashMap<Integer, Section> sectionHashMap;

    Course() {
        sectionHashMap = new HashMap<>();
    }

    @Override
    public void add(Student student) {
        int temp = student.getSection();
        if (!sectionHashMap.containsKey(temp)) {
//            System.out.println("new Section " + temp);
            sectionHashMap.put(temp, new Section());
        }
        Section section = sectionHashMap.get(temp);
        section.add(student);
    }

    @Override
    public void add(Section section) {

    }

    @Override
    public void remove(Student student) {

    }

    @Override
    public Student get(String roll) {
        // 24105
        return sectionHashMap.get(Integer.parseInt(roll.substring(0, 2))).get(roll.substring(3));
    }
}
