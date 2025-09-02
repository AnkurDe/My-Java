package BabyProjects.College;

import BabyProjects.College.Storage.enums.Campus;
import BabyProjects.College.Storage.enums.Course;
import BabyProjects.College.Storage.enums.School;

public class Student {
    private String rollNumber;
    final private int yearOfAdmission;
    private int year;
    private int semester;
    private double cgpa;
    private boolean isHosteler;
    private Transport transport; // enum type
    final private Campus campus; // enum type
    final private School school; // enum type
    final private Course course; // enum type
    final private int section; // number type
    final private int classSeating;

    public Student(int yearOfAdmission,
                   int year,
                   int semester,
                   double cgpa,
                   boolean isHosteler,
                   Transport transport,
                   Campus campus,
                   School school,
                   Course course,
                   int classSeating,
                   int section) {

        this.yearOfAdmission = yearOfAdmission;
        this.year = year;
        this.semester = semester;
        this.cgpa = cgpa;
        this.isHosteler = isHosteler;
        this.transport = transport;
        this.campus = campus;
        this.school = school;
        this.course = course;
        this.classSeating = classSeating;
        this.section = section;
    }

    private void generateRollNumber() {
        String string;
        String cSF = campus.shortForm;
        if (cSF == null)
            throw new NullPointerException("The campus names are null\nImplementation gaps present");

        string = cSF + "." + school + "." + course + section + classSeating;
        rollNumber = string;
    }

    public Campus getCampus() {
        return campus;
    }

    public School getSchool() {
        return school;
    }

    public Course getCourse() {
        return course;
    }

    public int getSection() {
        return section;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return
                " Roll Number: " + rollNumber +
                "\n Year Of Admission: " + yearOfAdmission +
                "\n Year: " + year +
                "\n Semester: " + semester +
                "\n CGPA: " + cgpa +
                "\n Stay: " + (isHosteler ? "Hosteler" : "Day Scholar") +
                "\n Transport: " + transport +
                "\n Campus: " + campus +
                "\n School: " + school +
                "\n Course: " + course +
                "\n Section: " + section +
                "\n Class Seating: " + classSeating;
    }
}
