package entities;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import entities.Student;

public class Course {
    private String name;
    private Set<Student> students;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return Collections.unmodifiableSet(students);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course course)) return false;
        return Objects.equals(name, course.name) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students);
    }
}
