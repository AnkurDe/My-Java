package BabyProjects.College.Storage;

import BabyProjects.College.Student;

public interface Stor <T> {
    void add(Student student);

    void add(T t);

    void remove(Student student);

    Student get(String roll);
}
