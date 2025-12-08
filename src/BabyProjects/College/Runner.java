package BabyProjects.College;

// Simulating College like system of database entry of Amrita
// Roll number BL.SC.U4AIE24105
// Campus - BL
// SC - School Of Computing
// U4AIE - B.Tech AIE
// 24 - Year of admission
// 1 - Section number (Starting from 0)
// 05 -    Number id class

import BabyProjects.College.Storage.Enums.Campus;
import BabyProjects.College.Storage.Enums.Course;
import BabyProjects.College.Storage.Enums.School;

public class Runner {
    static void main() {
        long time = System.currentTimeMillis();
        StorageManager students = new StorageManager();
        students.addStudent(new Student(
                "Ankur De",
                2024,
                2,
                3,
                8.71,
                false,
                Transport.Bike,
                Campus.Bengaluru,
                School.SC,
                Course.U4AIE,
                1,
                5
        ));
        students.addStudent(new Student(
                "SK Karthikeya Kunda",
                2024,
                2,
                3,
                8.4,
                false,
                Transport.Car,
                Campus.Bengaluru,
                School.SC,
                Course.U4AIE,
                1,
                46
        ));
        students.addStudent(new Student(
                "Amishi Singh",
                2024,
                2,
                3,
                9.9,
                true,
                Transport.NA,
                Campus.Bengaluru,
                School.SC,
                Course.U4AIE,
                2,
                4
        ));
        time = System.currentTimeMillis()-time;
        System.out.println(time);
    }
}
