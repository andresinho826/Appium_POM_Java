package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestWebDriverio {
    private static final Logger logger = LogManager.getLogger(TestWebDriverio.class);
    //AppiumDriver driver;
    AppiumDriver driver;


        @BeforeTest
        public void setUp () throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("platformVersion", "14.0");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("appPackage", "com.example.myapp");
        caps.setCapability("appActivity", "com.example.myapp.MainActivity");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/android.wdio.native.app.v1.0.8.apk");
        logger.error("app ready");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        logger.error("driver");
    }


    @Test
    public void click_Any_Button(){
        // driver.findElement(By.("App")).click();


    }

    @AfterTest
    public void tearDown(){

        if (null != driver){
            driver.quit();
        }
    }

}
