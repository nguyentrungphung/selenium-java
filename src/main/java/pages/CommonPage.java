package pages;

import base.BasePage;
import components.TopBarNavigation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BasePage {
    protected TopBarNavigation topBarNavigation;
    public CommonPage(WebDriver driver){
        super(driver);
        topBarNavigation = new TopBarNavigation(driver);
    }

    public void navigationLoginPage(){
        topBarNavigation.navigationLoginPage();
    }
    public void navigationRegisterPage(){
        topBarNavigation.navigationRegisterPage();
    }
}
