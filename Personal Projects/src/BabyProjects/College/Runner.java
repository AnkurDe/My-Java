package BabyProjects.College;

// Simulating College like system of database entry of Amrita
// Roll number BL.SC.U4AIE24105
// Campus - BL
// SC - School Of Computing
// U4AIE - B.Tech AIE
// 24 - Year of admission
// 1 - Section number (Starting from 0)
// 05 - Number id class

import BabyProjects.College.Storage.enums.Campus;
import BabyProjects.College.Storage.enums.Course;
import BabyProjects.College.Storage.enums.School;

public class Runner {

    Student getStudent(Student student) {
        return null;
    }

    public static void main(String[] args) {
        Student student = new Student(2024, 2, 3, 8.7, false, Transport.Bike, Campus.Bengaluru, School.SC, Course.U4AIE, 05, 1);
        System.out.println(student);
    }
}
