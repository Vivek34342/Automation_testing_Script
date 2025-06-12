package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class ProschoolTest extends BaseTest {

    @Test
    public void fullFlowTest() {
        RegisterPage registerPage = new RegisterPage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        CoursePage coursePage = new CoursePage(driver);
        LessonPage lessonPage = new LessonPage(driver);
        AssignmentPage assignmentPage = new AssignmentPage(driver);

        String email = registerPage.registerNewUser("Pass@12345");
        System.out.println("Registered email: " + email);

        profilePage.createTeacherProfile();
        coursePage.createCourse("Java Automation Course", "Course created by automation script.");
        lessonPage.addLesson("Selenium Basics", "This is a lesson about Selenium basics.");
        assignmentPage.addAssignment("Selenium WebDriver Task", "Automate a login page using Selenium.");
    }
}
