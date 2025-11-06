package testcases.login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.LoginPage;

public class TC02_LoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        //khoi tao page
        LoginPage loginPage = new LoginPage(driver);
        //Login Page
        //VP: Verify new account login successfully
        driver.get("https://demo1.cybersoft.edu.vn");
        driver.manage().window().maximize();

        //Step 1: Verify login successfully
        Reporter.log("Step 1: Verify login successfully");
        loginPage.clickLogin();
        String newAcount = "Test2883527738ad44a7acf06f9e01c4cfd0";
        loginPage.enterAccount(newAcount);
        loginPage.enterPassWord("Test123456@");
        loginPage.clickLoginBtn();

        //Step 2: Verify Login Successfully Msg
        Reporter.log("Step 2: erify Login Successfully Msg");
        String actualLoginMsg = loginPage.getMessage();
        Assert.assertEquals(actualLoginMsg,"Đăng nhập thành công", "Login massage");

        //Step 3: Verify UserName Profile
        Reporter.log("Step 3: Verify UserName Profile");
        String actualDisplayName = loginPage.getUserProfile();
        Assert.assertEquals(actualDisplayName,"PhungNguyen", "User Profile Name");

        Thread.sleep(7000);
        driver.quit();
    }

}
