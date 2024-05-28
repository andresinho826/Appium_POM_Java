package tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignUpPage;
import pages.WebDriverioPage;


public class AndroidTest extends BaseTest {
    //AppiumDriver driver;
    LoginPage loginPage;
    SignUpPage signUpPage;
    WebDriverioPage webDriverioPage;

    @Test
    public void login_signUp_form(){
        // click on login window
       webDriverioPage = new WebDriverioPage(driver);
       webDriverioPage.clickBtnLogin();

        // Login tab
        loginPage = new LoginPage(driver);
        loginPage.userLoginOnPage();

        // sign up tab
        signUpPage = new SignUpPage(driver);
        signUpPage.userCreatedSignUpTab();
        signUpPage.clickPopUp();


}




}
