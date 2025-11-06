package testcases.search;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.SearchPage;

public class TC04_SearchTest extends BaseTest {
    @Test
    public void testSearch() throws InterruptedException {
        // Initialize pages
        LoginPage loginPage = new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        System.out.println(driver + "- Test Search running......");

        // Login first (reusing TC02 login steps)
        Reporter.log("Pre-condition: Login to the system");
        driver.get("https://demo1.cybersoft.edu.vn");
        driver.manage().window().maximize();
        loginPage.clickLogin();
        loginPage.enterAccount("Test2883527738ad44a7acf06f9e01c4cfd0");
        loginPage.enterPassWord("Test123456@");
        loginPage.clickLoginBtn();

        // Verify login successful
        String actualLoginMsg = loginPage.getMessage();
        Assert.assertEquals(actualLoginMsg, "Đăng nhập thành công", "Login message");

        // Step 1: Enter search term
        Reporter.log("Step 1: Enter search term in the search box");
        searchPage.enterSearchTerm("Java");

        // Step 2: Click search button
        Reporter.log("Step 2: Click search button");
        searchPage.clickSearchButton();

        // Step 3: Verify search results are displayed
        Reporter.log("Step 3: Verify search results");
        Assert.assertTrue(searchPage.areSearchResultsDisplayed(), "Search results should be displayed");

        // Step 4: Verify search message
        Reporter.log("Step 4: Verify search message");
        String searchMessage = searchPage.getSearchResultMessage();
        Assert.assertTrue(searchMessage.contains("kết quả tìm kiếm"), "Search message should contain results text");

        Thread.sleep(3000);
        driver.quit();
    }
}
