package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.admin.company.CompanyPage;
import org.example.pages.admin.testimonial.TestimonialPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DeleteTestimonialSteps {
    WebDriver driver;
    public DeleteTestimonialSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
    }
    @When("admin clicks button delete testimonial")
    public void adminClicksButtonDeleteTestimonial() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        testimonialPage.clickDeleteButton();
    }

    @And("admin clicks button yes, im sure")
    public void adminClicksButtonYesImSure() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        testimonialPage.clickSureDelete();
    }

    @Then("the data must deleted from table")
    public void theDataMustDeletedFromTable() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        Assert.assertFalse(testimonialPage.isDataDisplayed());
    }
}
