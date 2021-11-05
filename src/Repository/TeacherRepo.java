package Repository;

import Entities.Teacher;

public class TeacherRepo extends InMemoryRepository<Teacher>{
    public TeacherRepo() {
        super();
    }

    /**
     * Updates the teacher from repo
     * @param teacher
     * @return updated teacher
     */
    @Override
    public Teacher update(Teacher teacher) {
        Teacher updatedTeacher = this.repoList.stream().filter(teach -> teach.getTeacherId() == teacher.getTeacherId()).findFirst().orElseThrow();
        updatedTeacher.setCourses(teacher.getCourses());
        updatedTeacher.setFirstName(teacher.getFirstName());
        updatedTeacher.setLastName(teacher.getLastName());

        return updatedTeacher;
    }
}
