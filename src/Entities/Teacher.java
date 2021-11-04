package Entities;

import java.util.List;

public class Teacher extends Person {
    private long teacherId;
    private List<Course> courses;
    public Teacher(String firstName, String lastName, long studentId, List<Course> courses) {
        super(firstName, lastName);
        this.teacherId = studentId;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long studentId) {
        this.teacherId = studentId;
    }
}
