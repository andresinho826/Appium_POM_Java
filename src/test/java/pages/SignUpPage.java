package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage {
    public SignUpPage(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='Sign up']")
    private WebElement signUpBtn;

    @AndroidFindBy(accessibility = "input-email")
    private WebElement inputEmail;


//android.widget.EditText[@content-desc='input-email']

//android.widget.EditText[@text='Email']
    //*[@text='Email']

    @FindBy(xpath = "//android.widget.EditText[@content-desc='input-password']")
    private WebElement inputPass;

    @AndroidFindBy(accessibility = "input-repeat-password")
    private WebElement repeatPass;

    @FindBy(xpath = "//android.widget.TextView[@text='SIGN UP']")
    private WebElement subMitSignUpBtn;

    public void userCreatedSignUpTab() {
        signUpBtn.click();
        inputEmail.sendKeys("andres99@gmail.com");
        inputPass.sendKeys("testingAppiumMobilee");
        repeatPass.sendKeys("testingAppiumMobilee");
        subMitSignUpBtn.click();
    }

    public void clickPopUpSingUp() {
        isAlertPresent();
    }


}
