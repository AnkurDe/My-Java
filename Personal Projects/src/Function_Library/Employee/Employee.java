package Function_Library.Employee;

public class Employee extends Inputter{
    public String name;
    public int salary;
    private String password = "000000";

    public Employee(){//Constructor
        this.name = " ";
        this.salary = 0;
    }

    public Employee(String name, int salary){//Constructor taking in variables
        this.name = name;
        this.salary = salary;
    }

    public void printDetails(){
        int salary = 900; //This is only for explalation
        System.out.println("The name of Employee: "+this.name+"\n"+"The salary of Employee: "+this.salary);
        System.out.println("The temp salary is: "+salary+"\n");
        //This keyword is used for accesing the variables that are defined in the class priority if two variables with same name are declared both in the class level and function level
        // Without this keyword the function considers the variable inside the funcion level
    }

    public void salary_increment(int new_sal) {
        this.salary = new_sal;
    }

    public void new_password(String existing_password) {
        if (existing_password.equals(password)) {
            set_password();
        }
        else {
            System.out.println("Entered passkey is wrong\n");
        }
    }

    private boolean is_pass_capok(String password){
        if (password.contains("A")||password.contains("B")||password.contains("C")||password.contains("D")||password.contains("E")||password.contains("F")||password.contains("G")||password.contains("H")||password.contains("I")||password.contains("J")||password.contains("K")||password.contains("L")||password.contains("M")||password.contains("N")||password.contains("O")||password.contains("P")||password.contains("Q")||password.contains("R")||password.contains("S")||password.contains("T")||password.contains("U")||password.contains("V")||password.contains("W")||password.contains("X")||password.contains("Y")||password.contains("Z")) {
            return true;
        }else {
            return false;
        }
    }

    private boolean is_pass_smallok(String password) {
        if (password.contains("a") || password.contains("b") || password.contains("c") || password.contains("d") || password.contains("e") || password.contains("f") || password.contains("g") || password.contains("h") || password.contains("i") || password.contains("j") || password.contains("k") || password.contains("l") || password.contains("m") || password.contains("n") || password.contains("o") || password.contains("p") || password.contains("q") || password.contains("r") || password.contains("s") || password.contains("t") || password.contains("u") || password.contains("v") || password.contains("w") || password.contains("x") || password.contains("y") || password.contains("z")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean is_pass_numok(String password){
        if (password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")||password.contains("0")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean is_pass_splok(String password){
        if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("_") || password.contains("+") || password.contains("=") || password.contains("{") || password.contains("}") || password.contains("[") || password.contains("]") || password.contains("\\") || password.contains("|") || password.contains(":") || password.contains(";") || password.contains("<") || password.contains(">") || password.contains(",") || password.contains(".") || password.contains("?") || password.contains("/")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean is_pass_ok(String new_password) {
        int pass_size = 8;
        return (new_password.length() > pass_size) && is_pass_capok(new_password) && is_pass_smallok(new_password) && is_pass_numok(new_password) && is_pass_splok(new_password);
    }

    private void set_password() {
        String password;
        System.out.println("Set your new passsword: ");
        password = string_input();
        if (is_pass_ok(password))
        {
            this.password = password;
            System.out.println("Password successfully updated");
        } else {
            System.out.println("The password does not meet the requirements");
        }
    }
}