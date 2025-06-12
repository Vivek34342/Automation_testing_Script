package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void createTeacherProfile() {
        driver.findElement(By.xpath("//button[contains(text(),'I am a Teacher')]")).click();
        driver.findElement(By.name("fullName")).sendKeys("Automation Teacher");
        driver.findElement(By.name("bio")).sendKeys("Automated test teacher profile.");
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
    }
}
