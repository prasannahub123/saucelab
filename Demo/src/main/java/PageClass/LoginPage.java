package PageClass;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    final By UserNameField = By.xpath("//div[@class='login-box']/descendant::input[@id='user-name']");
    final By PasswordField = By.xpath("//div[@class='login-box']/descendant::input[@id='password']");
    final By LogInButton = By.xpath("//div[@class='login-box']/descendant::input[@id='login-button']");

        @Epic("Enter the user name")
        public void EnterUserName(String username) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(UserNameField));
            driver.findElement(UserNameField).sendKeys(username);
        }
        @Epic("Enter the Password")
        public void EnterPassword(String password) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
            driver.findElement(PasswordField).sendKeys(password);
        }
        @Epic("Enter the Password")
        public void ClickLogInButton() {
            wait.until(ExpectedConditions.visibilityOfElementLocated(LogInButton));
            driver.findElement(LogInButton).click();
        }


    }

