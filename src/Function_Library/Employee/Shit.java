package Function_Library.Employee;

public class Shit {
    private boolean is_pass_capok(String password){
        if (password.contains("A")||password.contains("B")||password.contains("C")||password.contains("D")||password.contains("E")||password.contains("F")||password.contains("G")||password.contains("H")||password.contains("I")||password.contains("J")||password.contains("K")||password.contains("L")||password.contains("M")||password.contains("N")||password.contains("O")||password.contains("P")||password.contains("Q")||password.contains("R")||password.contains("S")||password.contains("T")||password.contains("U")||password.contains("V")||password.contains("W")||password.contains("X")||password.contains("Y")||password.contains("Z")) {
            System.out.println("Capital letters present");
            return true;
        }else {
            System.out.println("Capital letters absent");
            return false;
        }
    }

    private boolean is_pass_smallok(String password) {
        if (password.contains("a") || password.contains("b") || password.contains("c") || password.contains("d") || password.contains("e") || password.contains("f") || password.contains("g") || password.contains("h") || password.contains("i") || password.contains("j") || password.contains("k") || password.contains("l") || password.contains("m") || password.contains("n") || password.contains("o") || password.contains("p") || password.contains("q") || password.contains("r") || password.contains("s") || password.contains("t") || password.contains("u") || password.contains("v") || password.contains("w") || password.contains("x") || password.contains("y") || password.contains("z")) {
            System.out.println("Small case letters present");
            return true;
        } else {
            System.out.println("Small case letters absent");
            return false;
        }
    }

    private boolean is_pass_numok(String password){
        if (password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")||password.contains("0")) {
            System.out.println("Numbers present");
            return true;
        } else {
            System.out.println("Numbers absent");
            return false;
        }
    }

    private boolean is_pass_splok(String password){
        if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-") || password.contains("_") || password.contains("+") || password.contains("=") || password.contains("{") || password.contains("}") || password.contains("[") || password.contains("]") || password.contains("\\") || password.contains("|") || password.contains(":") || password.contains(";") || password.contains("<") || password.contains(">") || password.contains(",") || password.contains(".") || password.contains("?") || password.contains("/")) {
            System.out.println("Small case letters present");
            return true;
        } else {
            System.out.println("Small case letters absent");
            return false;
        }
    }

    private boolean is_pass_ok(String new_password)
    {
        Shit o = new Shit();
        int pass_size = 8;
        if ((new_password.length() > pass_size) && is_pass_capok(new_password) && is_pass_smallok(new_password) && is_pass_numok(new_password) && is_pass_splok(new_password))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Shit obj = new Shit();
        System.out.println(obj.is_pass_ok("AAnkur_Dee9ffgf"));
    }
}
