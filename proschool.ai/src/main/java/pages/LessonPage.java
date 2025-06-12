package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonPage extends BasePage {
    public LessonPage(WebDriver driver) {
        super(driver);
    }

    public void addLesson(String title, String content) {
        driver.findElement(By.linkText("Add Lesson")).click();
        driver.findElement(By.name("lessonTitle")).sendKeys(title);
        driver.findElement(By.name("lessonContent")).sendKeys(content);
        driver.findElement(By.xpath("//button[contains(text(),'Add Lesson')]")).click();
    }
}
