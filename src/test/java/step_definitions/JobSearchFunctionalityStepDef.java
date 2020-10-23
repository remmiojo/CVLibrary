package step_definitions;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CVLibraryHomePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class JobSearchFunctionalityStepDef {


    private BaseUtil base;


    public JobSearchFunctionalityStepDef(BaseUtil base) {
        this.base = base;
    }
    @Given("I am on the CV library home")
    public void i_am_on_the_cv_library_home() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.cv-library.co.uk/");
    }

    @When("I search for a job with the following {string}, {string} , {string} , {string}, {string}, {string}  and {string}")
    public void i_search_for_a_job_with_the_following_and(String keyword, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType) {
        CVLibraryHomePage cvLibraryHomePage = new CVLibraryHomePage(base.driver);
        cvLibraryHomePage.enterKeyword(keyword);
        cvLibraryHomePage.enterLocation(location);
        cvLibraryHomePage.selectDistance(distance);
        cvLibraryHomePage.clickOnMorSearchOption();
        cvLibraryHomePage.enterMinSalary(salaryMax);
        cvLibraryHomePage.enterMaxSalary(salaryMax);
        cvLibraryHomePage.selectSalaryType(salaryType);
        cvLibraryHomePage.selectJobType(jobType);
        cvLibraryHomePage.clickOnFindJobsButton();
    }
    @Then("page containing {string} jobs in {string} is displayed")
    public void page_containing_jobs_in_is_displayed(String keyword, String location) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Page Titlte is : " + base.driver.getTitle());
        assertThat(base.driver.getTitle().toLowerCase().contains(keyword), is (equalTo(true)));
        assertThat(base.driver.getTitle().toLowerCase().contains(keyword), is (equalTo(true)));
    }
}
