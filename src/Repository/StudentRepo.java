package Repository;

import Entities.Student;

public class StudentRepo extends InMemoryRepository<Student>{
    public StudentRepo() {
        super();
    }

    @Override
    public Student update(Student student) {
        Student updatedStudent = this.repoList.stream().filter(stud -> stud.getStudentId() == student.getStudentId()).findFirst().orElseThrow();
        updatedStudent.setEnrolledCourses(student.getEnrolledCourses());
        updatedStudent.setFirstName(student.getFirstName());
        updatedStudent.setLastName(student.getLastName());
        updatedStudent.setTotalCredits(student.getTotalCredits());

        return updatedStudent;

    }
}
