package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CVLibraryHomePage extends  BasePage{

    public CVLibraryHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "keywords")
    private WebElement keywordLocator;
    @FindBy (id = "location")
    private WebElement locationLocator;
    @FindBy (id = "distance")
    private WebElement distanceLocator;
    @FindBy(id = "toggle-hp-search")
    private WebElement moreSearchOptionButtonLocator;
    @FindBy (id = "salarymin")
    private WebElement minSalaryLocator;
    @FindBy (id = "salarymax")
    private WebElement maxSalaryLocator;
    @FindBy (id = "salarytype")
    private WebElement salaryTypeLocator;
    @FindBy (id = "tempperm")
    private WebElement jobTypeLocator;
    @FindBy (id = "hp-search-btn")
    private WebElement findJobsSearchButtonLocator;

public void enterKeyword(String keyword){
    sendKeys(keywordLocator, keyword);
}
    public void enterLocation(String location){
        sendKeys(locationLocator, location);
    }
    public void selectDistance(String distance){
        selectFromDropDownUsingVisibilityOfText(distanceLocator, distance);
    }
    public void clickOnMorSearchOption(){
        click(moreSearchOptionButtonLocator);
    }
    public void enterMinSalary(String minSalary){
        sendKeys(minSalaryLocator, minSalary);
    }
    public void enterMaxSalary(String maxSalary){
        sendKeys(maxSalaryLocator, maxSalary);
    }
    public void selectSalaryType(String salaryType){
        selectFromDropDownUsingVisibilityOfText(salaryTypeLocator, salaryType);
    }
    public void selectJobType(String jobType){
        selectFromDropDownUsingVisibilityOfText(jobTypeLocator, jobType);
    }
public void clickOnFindJobsButton(){
    click(findJobsSearchButtonLocator);
}

}
