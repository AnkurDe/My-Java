package Function_Library.Employee;

public class Runner extends Employee {
    public static void main(String[] args) {
        Employee ank = new Employee();// Creating an object and using the constructor that accepts no value
        ank.name = "Ankur";// This is to assign values to public values in the class
        ank.salary = 1000000;// This is to assign values to public values in the class
        ank.printDetails();//Calling a function without any input in function
        System.out.println("\n\n\n");
        ank.salary_increment(2000000);//Calling a function with an input in function
        ank.printDetails();

        Employee Ruth = new Employee ("Ruthvik", 40000000);//Creating an object and using the constructor that accepts values
        System.out.println("\n\n\n");
        Ruth.printDetails();
        Ruth.new_password("000000");
    }
}