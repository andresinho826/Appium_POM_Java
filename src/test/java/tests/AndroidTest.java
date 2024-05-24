package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndroidTest {
    AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("appium:automationName","UiAutomator2");
        caps.setCapability("appium:platformVersion","13.0");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:app", System.getProperty("user.dir") + "/src/apps/android.wdio.native.app.v1.0.8.apk");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void login_signUp_form(){
        //code login
        driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();

        // login al interior de la pagina
        driver.findElement(By.xpath("(//android.widget.TextView[@text='Login'])[1]")).click();
        driver.findElement(new AppiumBy.ByAccessibilityId("input-email")).sendKeys("andres@gmail.com");
        driver.findElement(new AppiumBy.ByAccessibilityId("input-password")).sendKeys("testingAppiumMobile");
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup")).click();

        //code sign up
        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign up']")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-email']")).sendKeys("andres@gmail.com");
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-password']")).sendKeys("testingAppiumMobile");
        //driver.findElement(new AppiumBy.ByAccessibilityId("input-email")).sendKeys("andres@gmail.com");
        //driver.findElement(new AppiumBy.ByAccessibilityId("input-password")).sendKeys("testingAppiumMobile");
        driver.findElement(new AppiumBy.ByAccessibilityId("input-repeat-password")).sendKeys("testingAppiumMobile");
        driver.findElement(By.xpath("//android.widget.TextView[@text='SIGN UP']")).click();

        /*
        driver.findElement(By.xpath("//android.widget.TextView[@text='Home']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Webview']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Forms']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Swipe']")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='Drag']")).click();

         */

    }

    @AfterTest
    public void tearDown(){

        if (null != driver){
            driver.quit();
        }
    }
}
