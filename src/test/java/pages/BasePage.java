package pages;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class BasePage {
    AndroidDriver driver;
    Actions actions;


    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //scrollDown
    public void scrollDown(){

        int startX = driver.manage().window().getSize().getWidth() / 2;
        int startY = driver.manage().window().getSize().getHeight() / 2;
        int endY = (int) (driver.manage().window().getSize().getHeight() * -0.5);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 0);

        scroll.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), startX, endY));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(scroll));
    }


    // explicit wait
    public boolean isElementDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element.isDisplayed();
    }

    // explicit wait alert present
    public void isAlertPresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // fluent wait
    public boolean isFluentElementDisplayed(WebElement webElement) {
        FluentWait<AndroidDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return true;
    }

    public void dragAndDrop(WebElement sourceElement, WebElement targetElement) {

        // Coordenadas del punto de inicio (centerX, centerY) y del punto final (centerX2, centerY2)
        int centerX = sourceElement.getLocation().getX() + (sourceElement.getSize().getWidth() / 2);
        int centerY = sourceElement.getLocation().getY() + (sourceElement.getSize().getHeight() / 2);

        // Coordenadas del punto final (centerX2, centerY2)
        int centerX2 = targetElement.getLocation().getX() + (targetElement.getSize().getWidth() / 2);
        int centerY2 = targetElement.getLocation().getY() + (targetElement.getSize().getHeight() / 2);

        // Crear el input de puntero
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        // Crear las acciones de arrastrar y soltar
        Sequence dragNDrop = new Sequence(finger, 0);
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), centerX, centerY));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX2, centerY2));
        dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        // Realizar las acciones
        driver.perform(Arrays.asList(dragNDrop));

    }



}
