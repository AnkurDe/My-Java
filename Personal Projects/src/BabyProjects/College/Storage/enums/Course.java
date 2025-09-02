package BabyProjects.College.Storage.enums;

public enum Course {
    U4AIE(4, "Computer Science Engineering and Artificial Intelligence"),
    U4CSE(4, "Computer Science Engineering"),
    U4ECE(4, "Electronics and Communication Engineering"),
    U4EEE(4, "Electronics and Electrical Engineering"),
    U4RAI(4, "Robotics and Artificial Intelligence");

    public final int maxYear;
    public final String courseName;

    Course(int maxYear, String courseName) {
        this.maxYear = maxYear;
        this.courseName = courseName;
    }
}
