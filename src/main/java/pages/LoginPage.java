package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonPage{
    private By byBtnLogin;
    private By byTxtAccountLogin;
    private By byTxtPasswordLogin;
    private By byBtnLogin1;
    private By byLbLoginMsg;
    private By byLbUserProfile;

    public LoginPage(WebDriver driver){
        super(driver);
        byBtnLogin = By.linkText("Đăng Nhập");
        byTxtAccountLogin = By.id("taiKhoan");
        byTxtPasswordLogin = By.id("matKhau");
        byBtnLogin1 = By.xpath("//button[.='Đăng nhập']");
        byLbLoginMsg = By.id("swal2-title");
        byLbUserProfile = By.xpath("//a[@href='/account']/h3");
    }
    public void clickLogin(){
        click(byBtnLogin);
    }
    public void enterAccount(String account){

        sendKeys(byTxtAccountLogin,account);
    }
    public void enterPassWord(String passWord){
        sendKeys(byTxtPasswordLogin,passWord);
    }
    public void clickLoginBtn(){
        click(byBtnLogin1);
    }
    public String getMessage(){
        return getMsg(byLbLoginMsg);
    }
    public String getUserProfile(){
        return getMsg(byLbUserProfile);
    }
}
