package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmentPage extends BasePage {
    public AssignmentPage(WebDriver driver) {
        super(driver);
    }

    public void addAssignment(String title, String instructions) {
        driver.findElement(By.linkText("Add Assignment")).click();
        driver.findElement(By.name("assignmentTitle")).sendKeys(title);
        driver.findElement(By.name("assignmentInstructions")).sendKeys(instructions);
        driver.findElement(By.xpath("//button[contains(text(),'Create Assignment')]")).click();
    }
}
