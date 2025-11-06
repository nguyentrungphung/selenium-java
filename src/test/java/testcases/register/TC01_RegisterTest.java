package testcases.register;
import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.RegisterPage;
import java.util.UUID;

public class TC01_RegisterTest extends BaseTest {
    @Test(priority = 0)
    public void testRegister() throws InterruptedException {
        //khoi tao page
        RegisterPage registerPage = new RegisterPage(driver);
        System.out.println(driver+ "- Test Register running......");

        //Step 1: Go to https://demo1.cybersoft.edu.vn/sign-up
        Reporter.log("Step 1: Go to https://demo1.cybersoft.edu.vn/sign-up");
        driver.get("https://demo1.cybersoft.edu.vn/sign-up");

        //Step 2: Enter value on 'Tai khoan' textbox
        Reporter.log("Step 2: Enter value on 'Tai khoan' textbox");
        //go vao Tai Khoan textbox
        String account = "Test" + UUID.randomUUID();
        String newAcount = account.replace("-", "");
        System.out.println(newAcount);
        registerPage.enterAccount(newAcount);

        //Step 3: Enter value on 'Mat Khau' textbox
        Reporter.log("Step 3: Enter value on 'Mat Khau' textbox");
        registerPage.enterPassWord("Test123456@");

        //Step 4: Enter value on 'Nhap Lai Mat Khau' textbox
        Reporter.log("Step 4: Enter value on 'Nhap Lai Mat Khau' textbox");
        registerPage.enterConfirmPassWord("Test123456@");

        //Step 5: Enter value on 'Ho ten' textbox
        Reporter.log("Step 5: Enter value on 'Ho ten' textbox");
        registerPage.enterName("PhungNguyen");

        //Step 6: Enter value on 'Email' textbox
        Reporter.log("Step 6: Enter value on 'Email' textbox");
        String email = newAcount + "@example.com";
        registerPage.enterEmail(email);

        //Step 7: Click 'Dang Ky" button
        Reporter.log("Step 7: Click 'Dang Ky' button");
        registerPage.clickRegisterBtn();

        //Step 8: Verify register successfully
        //VP: "Đăng ký thành công" message display
        Reporter.log("Step 8: Verify register successfully");
        String actualMsg= registerPage.getMessage();
        Assert.assertEquals(actualMsg,"Đăng ký thành công", "Register massage");

        Thread.sleep(7000);
        driver.quit();
    }

}
