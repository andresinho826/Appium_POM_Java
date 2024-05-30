package pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
    AndroidDriver driver;
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//android.widget.TextView[@text='Login'])[1]")
    private WebElement loginBtnPage;

    @AndroidFindBy(accessibility = "input-email")
    private WebElement getEmailInput;

    @AndroidFindBy(accessibility = "input-password")
    private WebElement getPassInput;


    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup")
    private WebElement submitBtn;

    public void userLoginOnPage(){
        loginBtnPage.click();
        getEmailInput.sendKeys("andres@gmail.com");
        getPassInput.sendKeys("testingAppiumMobile");
        submitBtn.click();
    }

    public void clickPopUpLogIn() {
        isAlertPresent();
    }

}
