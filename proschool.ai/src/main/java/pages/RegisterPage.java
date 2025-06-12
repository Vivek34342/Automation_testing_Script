package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.UUID;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public String registerNewUser(String password) {
        driver.findElement(By.linkText("Sign Up")).click();
        String email = "test+" + UUID.randomUUID() + "@gmail.com";
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
        return email;
    }
}

