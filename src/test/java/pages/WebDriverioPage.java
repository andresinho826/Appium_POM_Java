package pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebDriverioPage extends BasePage {
    AndroidDriver driver;

    public WebDriverioPage(AndroidDriver driver) {
        super(driver);

    }

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

    public void clickBtnLogin() {
        //isElementDisplayed(lbtn);
        lbtn.click();
    }

    public void clickBtnHome() {
        homeBtn.click();
    }

    public void clickBtnWebView() {
        webViewBtn.click();
    }

    public void clickBtnForms() {
        formsBtn.click();
    }

    public void clickBtnSwipe() {
        swipeBtn.click();
    }

    public void clickBtnDrag() {
        dragBtn.click();
    }

}
