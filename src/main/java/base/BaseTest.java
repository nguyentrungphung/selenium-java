package base;

import drivers.DriverManager;
import drivers.DriverManagerFactory;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Wait<WebDriver> fluentWait;
    @BeforeClass
    public void beforceClass(){
        System.out.println("Beforce Class executed");

    }
    @BeforeMethod
    public void beforceMethod(){
        System.out.println("Beforce Method executed");
        //
        DriverManager driverManager = DriverManagerFactory.getDriverManager("chrome");
        driver = driverManager.createDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // da hinh trong java
        fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .ignoring(NotFoundException.class)
                .pollingEvery(Duration.ofMillis(500));
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method executed");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class executed");
        driver.quit();
    }
}
