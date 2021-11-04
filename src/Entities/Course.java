package Entities;

import java.util.List;

public class Course {
    private int courseId;
    private String name;
    private Person teacher;
    private List<Student> studentsEnrolled;
    private int credits;

    public Course(int courseId, String name, Person teacher, List<Student> studentsEnrolled, int credits) {
        this.courseId = courseId;
        this.name = name;
        this.teacher = teacher;
        this.studentsEnrolled = studentsEnrolled;
        this.credits = credits;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
