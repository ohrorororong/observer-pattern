package subject;

import observer.Student;

public interface MegaStudy {

    void addStudent(Student student);
    void removeStudent(Student student);

    void addEducation(Education education);
}
