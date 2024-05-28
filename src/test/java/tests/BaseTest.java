package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:automationName","UiAutomator2");
        caps.setCapability("appium:platformVersion","13.0");
        caps.setCapability("appium:deviceName", "emulator-5554");
        //caps.setCapability("appium:app", System.getProperty("user.dir") + "/src/apps/android.wdio.native.app.v1.0.8.apk");
        caps.setCapability("appPackge","wdiodemoapp");
        caps.setCapability("appActivity","com.wdiodemoapp.MainActivity");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterTest
    public void tearDown(){

        if (null != driver){
            // cierra solo la pagina actual
            //driver.close();

            // cierra todas las paginas que se abren al momento de la test
            driver.quit();
        }
    }
}
