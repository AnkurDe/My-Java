package BabyProjects.College.Storage;

import BabyProjects.College.Student;

import java.util.EnumMap;

public class School implements Stor<Course> {
    // Courses offered in a School
    private EnumMap<BabyProjects.College.Storage.Enums.Course, Course> courseHashMap;

    public School() {
        courseHashMap = new EnumMap<>(BabyProjects.College.Storage.Enums.Course.class);
    }

    public void add(Student student) {
        BabyProjects.College.Storage.Enums.Course temp = student.getCourse();
        if (!courseHashMap.containsKey(temp)) {
//            System.out.println("new course: " + temp.toString());
            courseHashMap.put(temp, new Course());
        }
        Course course = courseHashMap.get(student.getCourse());
        course.add(student);
    }

    @Override
    public void add(Course course) {

    }

    public void remove(Student student) {

    }

    public Student get(String roll) {
        // SC.U4AIE-----, EN.U4EEE
        BabyProjects.College.Storage.Enums.Course co = BabyProjects.College.Storage.Enums.Course.valueOf(roll.substring(0,1));
        //U4AIE
        return courseHashMap.get(co).get(roll.substring(3));
    }
}
