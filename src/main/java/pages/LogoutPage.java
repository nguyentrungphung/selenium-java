package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends CommonPage{
    private By clickLogout;
    public LogoutPage(WebDriver driver){
        super(driver);
        clickLogout = By.xpath("//a[@href='/']/h3");
    }
    public void clickLogout(){
        click(clickLogout);
    }
}
