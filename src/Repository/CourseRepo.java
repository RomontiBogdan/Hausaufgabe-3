package Repository;

import Entities.Course;

public class CourseRepo extends InMemoryRepository<Course>{
    public CourseRepo() {
        super();
    }

    @Override
    public Course update(Course course) {
        Course updatedCourse = this.repoList.stream().filter(cou -> cou.getCourseId() == course.getCourseId()).findFirst().orElseThrow();
        updatedCourse.setCredits(course.getCredits());
        updatedCourse.setName(course.getName());
        updatedCourse.setTeacher(course.getTeacher());
        updatedCourse.setStudentsEnrolled(course.getStudentsEnrolled());

        return updatedCourse;
    }
}
