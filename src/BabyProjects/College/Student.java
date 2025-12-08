package BabyProjects.College;

import BabyProjects.College.Storage.Enums.Campus;
import BabyProjects.College.Storage.Enums.Course;
import BabyProjects.College.Storage.Enums.School;

/**
 * HOVER OVER VIDYAPEETHAM
 * Represents single student of Amrita Vishwa Vidyapeetham of any campus and any course
 */

public class Student {
    private final String name;
    private String rollNumber;
    final private int yearOfAdmission;
    private final int year;
    private final int semester;
    private final double cgpa;
    private final boolean isHosteler;
    private final Transport transport; // enum type
    final private Campus campus; // enum type
    final private School school; // enum type
    final private Course course; // enum type
    final private int section; // number type
    final private int classSeating;
    private Object profileImage; // Need to change the type of profile image


    /**
     * Constructs new student with parameters
     *
     * @param yearOfAdmission The year of admission
     * @param year            The year student is in - 1st, 2nd... year
     * @param semester        The semester student is studying in - 1st, 2nd, 3rd
     * @param cgpa            CGPA of student
     * @param isHosteler      True if hosteler or false if not hosteler
     * @param transport       Mode of transport
     * @param campus          The campus of Amrita
     * @param school          The schools - School of Computing, School of Engineering
     * @param course          Course opted for - U4AIE (B.Tech AI), U4CSE(B.Tech CSE)
     * @param classSeating    The arrangement as per class roll
     * @param section         Class section in the campus for the given course
     */
    public Student(String name,
                   int yearOfAdmission,
                   int year,
                   int semester,
                   double cgpa,
                   boolean isHosteler,
                   Transport transport,
                   Campus campus,
                   School school,
                   Course course,
                   int section,
                   int classSeating) {

        this.name = name;
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
        generateRollNumber();
    }

    private void generateRollNumber() {
        String string;
        String cSF = campus.shortForm;
        if (cSF == null)
            throw new NullPointerException("The campus names are null\nImplementation gaps present");

        string = cSF + "." + school + "." + course + (yearOfAdmission % 100) + section + classSeatingToString();
        rollNumber = string;
    }

    private String classSeatingToString() {
        if (classSeating / 10 == 0) {
            return "0" + classSeating;
        } else {
            return Integer.toString(classSeating);
        }
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

    public int getClassSeating() {
        return classSeating;
    }

    @Override
    public String toString() {
        return
                " Name: " + name +
                        "\n Roll Number: " + rollNumber +
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
                        "\n Class Seating: " + classSeating +
                        "\n --------DEV TOOLS--------" +
                        "\n Hash Code: " + hashCode() +
                        "\n";
    }

    @Override
    public int hashCode() {
        return classSeating;
    }
}
