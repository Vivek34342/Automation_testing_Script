package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursePage extends BasePage {
    public CoursePage(WebDriver driver) {
        super(driver);
    }

    public void createCourse(String title, String description) {
        driver.findElement(By.linkText("Create Course")).click();
        driver.findElement(By.name("courseTitle")).sendKeys(title);
        driver.findElement(By.name("courseDescription")).sendKeys(description);
        driver.findElement(By.xpath("//button[contains(text(),'Create Course')]")).click();
    }
}
