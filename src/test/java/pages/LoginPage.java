package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage extends BasePage{
    AppiumDriver driver;
    public LoginPage(AppiumDriver driver) {
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



    /*
    // tab login
        driver.findElement(By.xpath("(//android.widget.TextView[@text='Login'])[1]")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("input-email")).sendKeys("andres@gmail.com");
        driver.findElement(new AppiumBy.ByAccessibilityId("input-password")).sendKeys("testingAppiumMobile");
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup")).click();
     */

}
