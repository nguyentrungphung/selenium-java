package components;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopBarNavigation extends BasePage {
    private By byLnkLogin;
    private By byLnkRegister;

    public TopBarNavigation(WebDriver driver){
        super(driver);
        byLnkLogin = By.linkText("Đăng Nhập");
        byLnkRegister = By.xpath("//a[@href='/sign-up']");
    }
    public void navigationLoginPage(){
        click(byLnkLogin);
    }
    public void navigationRegisterPage(){
        click(byLnkRegister);
    }
}
