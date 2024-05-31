package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SwipePage extends BasePage {
    public SwipePage(AndroidDriver driver) {
        super(driver);
    }

    // screen to do scroll down
    //android.widget.ScrollView[@content-desc="Swipe-screen"]/android.view.ViewGroup

    // bot found
    //android.widget.ImageView[@content-desc="WebdriverIO logo"]
    // class name = android.widget.ImageView

    // text you found me!!!
    //android.widget.TextView[@text="You found me!!!"]

    @FindBy(xpath = "//*[@content-desc='WebdriverIO logo']")
    private WebElement robotOnPage;

    @FindBy(xpath = "//*[@text='You found me!!!']")
    private WebElement robotText;

    public void find_bot() {
        scrollDown();
        // assert bot found
        Assert.assertTrue(robotOnPage.isDisplayed());
        //assert text found
        Assert.assertEquals(robotText.getText(), "You found me!!!");


    }

}
