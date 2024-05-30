package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignUpPage;
import pages.WebDriverioPage;


public class AndroidTest extends BaseTest {

    LoginPage loginPage;
    SignUpPage signUpPage;
    WebDriverioPage webDriverioPage;

    @Test(priority = 0)
    public void login_signUp_tabs() {
        // click on login window
        webDriverioPage = new WebDriverioPage(driver);
        webDriverioPage.clickBtnLogin();

        // Login tab
        loginPage = new LoginPage(driver);
        loginPage.userLoginOnPage();
        loginPage.clickPopUpLogIn();

        // sign up tab
        signUpPage = new SignUpPage(driver);
        signUpPage.userCreatedSignUpTab();
        signUpPage.clickPopUpSingUp();


    }


}
