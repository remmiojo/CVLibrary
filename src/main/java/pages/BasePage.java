package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
    }
    public void waitForVisibilityOfElement(WebElement element){
        wait.until((ExpectedConditions.visibilityOf(element)));
    }

    public void selectFromDropDownUsingVisibilityOfText(WebElement element, String textName){
        waitForVisibilityOfElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(textName);
    }

    public void selectFromDropDownUsingIndex(WebElement element, int index){
        waitForVisibilityOfElement(element);
        Select select = new Select(element);
        select.selectByIndex(index);
    }
    public void click(WebElement element){
        waitForVisibilityOfElement(element);
        element.click();
    }

    public void sendKeys(WebElement element, String text){
        waitForVisibilityOfElement(element);
        element.clear();
        element.sendKeys(text);
    }

}
