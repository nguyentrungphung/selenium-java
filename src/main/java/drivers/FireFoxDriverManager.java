package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager extends DriverManager{
    @Override
    public WebDriver createDriver() {
        return new FirefoxDriver();
    }
}
