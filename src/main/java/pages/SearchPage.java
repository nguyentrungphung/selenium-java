package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    private By searchBoxLocator = By.xpath("//input[@placeholder='Tìm kiếm']");
    private By searchButtonLocator = By.xpath("//button[contains(@class,'search-button')]");
    private By searchResultsLocator = By.xpath("//div[contains(@class,'search-results')]");
    private By searchMessageLocator = By.xpath("//div[contains(@class,'search-message')]");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void enterSearchTerm(String searchTerm) {
        waitForVisibilityOfElementLocated(searchBoxLocator);
        sendKeys(searchBoxLocator, searchTerm);
    }

    public void clickSearchButton() {
        waitForElementToBeClickable(searchButtonLocator);
        waitForElementToBeClickable(searchButtonLocator).click();
    }

    public String getSearchResultMessage() {
        waitForVisibilityOfElementLocated(searchMessageLocator);
        return waitForVisibilityOfElementLocated(searchMessageLocator).getText();
    }

    public boolean areSearchResultsDisplayed() {
        waitForVisibilityOfElementLocated(searchResultsLocator);
        return waitForVisibilityOfElementLocated(searchResultsLocator).isDisplayed();
    }
}