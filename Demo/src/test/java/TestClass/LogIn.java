package TestClass;

import BaseClass.BaseTest;
import PageClass.LoginPage;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogIn extends BaseTest {
    private LoginPage loginPage;


    @BeforeClass
    public void SetUpTests() {
        super.Setup();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void LogIn(){
        loginPage.EnterUserName("standard_user");
        loginPage.EnterPassword("secret_sauce");
        loginPage.ClickLogInButton();

    }

}
