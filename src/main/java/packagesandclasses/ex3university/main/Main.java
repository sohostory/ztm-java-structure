package packagesandclasses.ex3university.main;

import packagesandclasses.ex3university.university.Course;
import packagesandclasses.ex3university.university.Student;
import packagesandclasses.ex3university.university.Enrollment;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.studentId = 1001;
        student.name = "Henry";

        Course course = new Course();
        course.courseId = 101;
        course.courseName = "Computer Science";

        Enrollment enrollment = new Enrollment();
        enrollment.student = student;
        enrollment.course = course;

        System.out.println("Student ID: " + enrollment.student.studentId + " , Name: " + enrollment.student.name);
        System.out.println("Course ID: " + enrollment.course.courseId + " , Name: " + enrollment.course.courseName);
    }
}
