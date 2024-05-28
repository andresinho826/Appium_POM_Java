package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{
    public SignUpPage(AppiumDriver driver) {
        super(driver);
    }

    //private  String varEmail= "new UiSelector().text('Email')";

    @FindBy(xpath = "//android.widget.TextView[@text='Sign up']")
    private WebElement signUpBtn;

    //@FindBy(xpath = "//android.widget.EditText[@content-desc='input-email']")


    @AndroidFindBy(uiAutomator = "new UiSelector().text('Email')")
    private WebElement inputEmail;


    @FindBy(xpath = "//android.widget.EditText[@content-desc='input-password']")
    private WebElement inputPass;

    @AndroidFindBy(accessibility = "input-repeat-password")
    private WebElement repeatPass;

    @FindBy(xpath = "//android.widget.TextView[@text='SIGN UP']")
    private WebElement subMitSignUpBtn;

    public void userCreatedSignUpTab(){
        signUpBtn.click();
        inputEmail.sendKeys("andres@gmail.com");
        inputPass.sendKeys("testingAppiumMobile");
        repeatPass.sendKeys("testingAppiumMobile");
        subMitSignUpBtn.click();


    }
    public void clickPopUp(){
        isAlertPresent();
    }


    /*
    //tab sign up
        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign up']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-email']")).sendKeys("andres@gmail.com");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-password']")).sendKeys("testingAppiumMobile");
        driver.findElement(new AppiumBy.ByAccessibilityId("input-repeat-password")).sendKeys("testingAppiumMobile");
        driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();
     */

}
