package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends  BasePage{

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "h1")
    private WebElement searchResultHeader;







}
