package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends CommonPage{
    private By byLbUserProfile;
    public HomePage(WebDriver driver){
        super(driver);
        byLbUserProfile = By.xpath("//a[@href='/account']/h3");
    }
    public String getUserProfile (){
        return getMsg(byLbUserProfile);
    }

}
