package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(AndroidDriver driver) {
        super(driver);
    }

    // refresh button


    @FindBy(xpath = "//*[@text='\uDB80\uDC6A']")
    private WebElement refreshBtn;

    //Drag 1.1

    @FindBy(xpath = "//*[@content-desc='drag-l1']/android.widget.ImageView")
    private WebElement dragOneDotOne;
    //drop 1.1

    @FindBy(xpath = "//*[@content-desc='drop-l1']/*")
    private WebElement dropOneDotOne;

    //Drag 1.2

    @FindBy(xpath = "//*[@content-desc='drag-c1']/android.widget.ImageView")
    private WebElement dragOneDotTwo;
    //drop 1.2

    @FindBy(xpath = "//*[@content-desc='drop-c1']/*")
    private WebElement dropOneDotTwo;


    //Drag 1.3

    @FindBy(xpath = "//*[@content-desc='drag-r1']/android.widget.ImageView")
    private WebElement dragOneDotThree;
    //drop 1.3

    @FindBy(xpath = "//*[@content-desc='drop-r1']/*")
    private WebElement dropOneDotThree;


    //Drag 2.1

    @FindBy(xpath = "//*[@content-desc='drag-l2']/android.widget.ImageView")
    private WebElement dragTwoDotOne;
    //drop 2.1

    @FindBy(xpath = "//*[@content-desc='drop-l2']/*")
    private WebElement dropTwoDotOne;


    //Drag 2.2

    @FindBy(xpath = "//*[@content-desc='drag-c2']/android.widget.ImageView")
    private WebElement dragTwoDotTwo;
    //drop 2.2

    @FindBy(xpath = "//*[@content-desc='drop-c2']/*")
    private WebElement dropTwoDotTwo;

    //Drag 2.3

    @FindBy(xpath = "//*[@content-desc='drag-r2']/android.widget.ImageView")
    private WebElement dragTwoDotThree;
    //drop 2.3

    @FindBy(xpath = "//*[@content-desc='drop-r2']/*")
    private WebElement dropTwoDotThree;

    //Drag 3.1

    @FindBy(xpath = "//*[@content-desc='drag-l3']/android.widget.ImageView")
    private WebElement dragThreeDotOne;
    //drop 3.1

    @FindBy(xpath = "//*[@content-desc='drop-l3']/*")
    private WebElement dropThreeDotOne;


    //Drag 3.2

    @FindBy(xpath = "//*[@content-desc='drag-c3']/android.widget.ImageView")
    private WebElement dragThreeDotTwo;
    //drop 3.2

    @FindBy(xpath = "//*[@content-desc='drop-c3']/*")
    private WebElement dropThreeDotTwo;

    //Drag 3.3

    @FindBy(xpath = "//*[@content-desc='drag-r3']/android.widget.ImageView")
    private WebElement dragThreeDotThree;
    //drop 3.3

    @FindBy(xpath = "//*[@content-desc='drop-r3']/*")
    private WebElement dropThreeDotThree;

    // congrats message

    @FindBy(xpath = "//*[@text='Congratulations']")
    private WebElement congratMessage;

    // retry button

    @FindBy(xpath = "//*[@content-desc='button-Retry']/android.view.ViewGroup")
    private WebElement retryBtn;






}
