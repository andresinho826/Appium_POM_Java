package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebDriverioPage extends BasePage{
    AppiumDriver driver;

    public WebDriverioPage(AppiumDriver driver) {
        super(driver);
    }

    //WebElement lbtn1 = driver.findElement(By.xpath("//android.widget.TextView[@text='Login']"));

    //WebElement lbtn1 = driver.findElement(new AppiumBy.ByAccessibilityId(""));


    @FindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement loginBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement lbtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Home']")
    private WebElement homeBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Webview']")
    private WebElement webViewBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Forms']")
    private WebElement formsBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Swipe']")
    private WebElement swipeBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Drag']")
    private WebElement dragBtn;

    public void clickBtnLogin(){
        //isElementDisplayed(lbtn);
        lbtn.click();
    }
    public void clickBtnHome(){
        homeBtn.click();
    }
    public void clickBtnWebView(){
        webViewBtn.click();
    }
    public void clickBtnForms(){
        formsBtn.click();
    }
    public void clickBtnSwipe(){
        swipeBtn.click();
    }
    public void clickBtnDrag(){
        dragBtn.click();
    }





    /*
        driver.findElement(By.xpath("//android.widget.TextView[@text='Home']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Webview']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Forms']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Swipe']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Drag']")).click();

        //driver.findElement(new AppiumBy.ByAccessibilityId("input-email")).sendKeys("andres@gmail.com");
        //driver.findElement(new AppiumBy.ByAccessibilityId("input-password")).sendKeys("testingAppiumMobile");

         */
}
