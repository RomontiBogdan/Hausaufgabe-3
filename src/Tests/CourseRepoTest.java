package Tests;

import Entities.Course;
import Entities.Person;
import Repository.CourseRepo;

import static org.junit.jupiter.api.Assertions.*;

class CourseRepoTest {

    @org.junit.jupiter.api.Test
    void delete() {
        CourseRepo courseRepo = new CourseRepo();
        Person t1 = new Person("Adi", "Popescu");
        Course c1 = new Course(int);
        courseRepo.create();
    }

    @org.junit.jupiter.api.Test
    void update() {
    }
}