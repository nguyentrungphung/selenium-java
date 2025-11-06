package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends CommonPage{
    private By byTxtAccount;
    private By byTxtPassword;
    private By byTxtConfirmPassword;
    private By byTxtName;
    private By byTxtEmail;
    private By byBtnRegister;
    private By byLbRegisterMsg;



    public RegisterPage(WebDriver driver){
        super(driver);
        byTxtAccount = By.name("taiKhoan");
        byTxtPassword = By.id("matKhau");
        byTxtConfirmPassword = By.id("confirmPassWord");
        byTxtName = By.id("hoTen");
        byTxtEmail = By.id("email");
        byBtnRegister = By.xpath("//button[.='Đăng ký']");
        byLbRegisterMsg = By.id("swal2-title");
    }

    public void enterAccount(String account){
        sendKeys(byTxtAccount,account);
    }
    public  void enterPassWord(String password){
        sendKeys(byTxtPassword,password);
    }
    public  void enterConfirmPassWord(String confirmPassWord){
        sendKeys(byTxtConfirmPassword,confirmPassWord);
    }
    public  void enterName(String name){
        sendKeys(byTxtName,name);
    }
    public  void enterEmail(String email){
        sendKeys(byTxtEmail,email);
    }
    public  void clickRegisterBtn(){
        click(byBtnRegister);
    }
    public String getMessage(){
        return getMsg(byLbRegisterMsg);
    }


}
