package BabyProjects.StudentManagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Sms {
    // NEED TO KNOW
    private static final List<Student> students = new ArrayList<>();

    static void addStudent(Scanner sc){
        String temp1;
        int temp2;//give some meaningful name for temp
        double temp3;
        System.out.println("Enter the name of the student");
        temp1 = sc.next();
        System.out.println("Enter the ID of student");
        temp2 = sc.nextInt();
        System.out.println("Enter the CGPA of student");
        temp3 = sc.nextDouble();
        students.add(new Student(temp1, temp2, temp3));
    }

    static void removeStudent(Scanner sc){
        int temp2;
        System.out.println("Enter the student ID to remove a student");
        temp2 = sc.nextInt();
        boolean flag1 = false;
        for (int i =0; i<students.size(); ++i){
            if (students.get(i).getID() == temp2){
                students.remove(i);
                System.out.println("Student deleted");
                flag1 = true;
                break;
            }
            if (!flag1){
                System.out.println("Student not found");
            }
        }
    }

    static void updateDetails(Scanner sc){
        int temp2;
        System.out.println("Enter the student ID to be modified");
        temp2 = sc.nextInt();
        boolean flag2 = false;
        for (int i =0; i<students.size(); ++i){
            if (students.get(i).getID() == temp2){
                System.out.println("Select the property to be modified\n1) Student name\n2) Student Id\n3) Student CGPA");
                temp2 = sc.nextInt();


                if (temp2 == 1){
                    System.out.println("Enter new student name");
                    students.get(i).setName(sc.next());
                }
                else if (temp2 == 2){
                    System.out.println("Enter new student ID");
                    students.get(i).setID(sc.nextInt());
                }
                else if (temp2 == 3){
                    System.out.println("Enter new student CGPA");
                    students.get(i).setCGPA(sc.nextDouble());
                }
                else {
                    System.out.println("Wrong code");
                }


                flag2 = true;
                break;
            }
            if (!flag2){
                System.out.println("Student not found");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String temp1;int temp2; double temp3;

        System.out.println("Starting system");
        loop:
        while (true){
            System.out.println("Press the following keys\n1) Add a student\n2) Remove a student\n3) Update details");
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
            }

            switch (choice){
                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    removeStudent(sc);
                    break;

                case 3:
                    updateDetails(sc);
                    break;
                default:
                    break loop;
            }
        }
        sc.close();
    }
}
