package entities;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

public class Student {
    private Integer id;
    private final Set<Course> courses = new HashSet<>();

    public Student(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Course> getCourses() {
        return Collections.unmodifiableSet(courses);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
