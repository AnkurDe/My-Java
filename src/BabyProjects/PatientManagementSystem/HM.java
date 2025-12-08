package BabyProjects.PatientManagementSystem;

import java.util.Scanner;

public class HM {
    static Patient pat;
    public static void main(String[] args) {
        pat = new Patient();
        System.out.println("HM Started");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Enter data\n2. display data");
            switch (sc.nextInt()){
                case 1:
                    System.out.println("Enter the date, name, temperature and sugar level");
                    try {
                        pat.insert(new Disease(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble()));
                    } catch (DuplicateException e) {
                        System.out.println("Not added due to duplicate");
                    }
                    break;
                case 2:
                    System.out.println("---disease details---");
                    pat.display();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
}
