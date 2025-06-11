import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.UUID;
import java.time.Duration;

public class ProschoolAutomation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            // 1. Open Proschool.ai and go to registration
            driver.get("https://proschool.ai");
            driver.findElement(By.linkText("Sign Up")).click();

            // 2. Register new user
            String email = "test+" + UUID.randomUUID() + "@gmail.com";
            String password = "Pass@12345";

            driver.findElement(By.name("email")).sendKeys(email);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();

            // 3. Select "Teacher" profile
            driver.findElement(By.xpath("//button[contains(text(),'I am a Teacher')]")).click();

            // Fill teacher profile
            driver.findElement(By.name("fullName")).sendKeys("Automation Teacher");
            driver.findElement(By.name("bio")).sendKeys("Automated test teacher profile.");
            driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();

            // 4. Create a Course
            driver.findElement(By.linkText("Create Course")).click();
            driver.findElement(By.name("courseTitle")).sendKeys("Java Automation Course");
            driver.findElement(By.name("courseDescription")).sendKeys("Course created by automation script.");
            driver.findElement(By.xpath("//button[contains(text(),'Create Course')]")).click();

            // 5. Add a Lesson
            driver.findElement(By.linkText("Add Lesson")).click();
            driver.findElement(By.name("lessonTitle")).sendKeys("Selenium Basics");
            driver.findElement(By.name("lessonContent")).sendKeys("This is a lesson about Selenium basics.");
            driver.findElement(By.xpath("//button[contains(text(),'Add Lesson')]")).click();

            // 6. Add an Assignment
            driver.findElement(By.linkText("Add Assignment")).click();
            driver.findElement(By.name("assignmentTitle")).sendKeys("Selenium WebDriver Task");
            driver.findElement(By.name("assignmentInstructions")).sendKeys("Automate a login page using Selenium.");
            driver.findElement(By.xpath("//button[contains(text(),'Create Assignment')]")).click();

            System.out.println("✅ Automation steps executed successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}