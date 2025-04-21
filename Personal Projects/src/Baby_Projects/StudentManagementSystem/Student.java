package Baby_Projects.StudentManagementSystem;

public class Student {
    private String name;
    private int ID;
    private double CGPA;

    public Student(String name, int ID, double CGPA){
        this.name = name;
        this.ID = ID;
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public double getCGPA() {
        return CGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}
