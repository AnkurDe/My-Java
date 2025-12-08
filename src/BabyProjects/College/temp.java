package BabyProjects.College;

import BabyProjects.College.Storage.Misc.Date;
import BabyProjects.College.Storage.Enums.*;

public class temp {
    public static void main(String[] args) {
        Student student1 = new Student("Ankur De",2024, 2,
                2, 8.7, false,
                Transport.Bike, Campus.Bengaluru,
                School.SC, Course.U4AIE,
                1, 5);
        System.out.println(student1);

        student1 = new Student("Jiya Sachdeva",2024, 2,
                2, 9.1, true,
                null, Campus.Bengaluru,
                School.SC, Course.U4AIE,
                1, 23);
        System.out.println(student1);

        student1 = new Student("SK Karthikeya Kunda",2024, 2,
                2, 8.7, false,
                Transport.Car, Campus.Bengaluru,
                School.SC, Course.U4AIE,
                1, 46);
        System.out.println(student1);

        student1 = new Student("Amishi Singh",2024, 2,
                        2, 9.7, true,
                        null, Campus.Bengaluru,
                        School.SC, Course.U4AIE,
                        2, 4);
                System.out.println(student1);
        System.out.println(new Date((byte) 18, Date.Month.April, 2005));
    }
}
