package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            testimonialPage.clickDeleteButton();
            Hooks.deleteTestimonialTest.pass("Admin Success to click button delete testimonial");
        } catch (Exception e) {
            Hooks.deleteTestimonialTest.fail("Admin Fail to click button delete testimonial");
        }
    }

    @And("admin clicks button yes, im sure")
    public void adminClicksButtonYesImSure() {
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            testimonialPage.clickSureDelete();
            Hooks.deleteTestimonialTest.pass("Admin Success to click button sure delete");
        } catch (Exception e) {
            Hooks.deleteTestimonialTest.fail("Admin Fail to click button sure delete");
        }
    }

    @Then("the data must deleted from table")
    public void theDataMustDeletedFromTable() {
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            Assert.assertFalse(testimonialPage.isDataDisplayed());
            Hooks.deleteTestimonialTest.pass("Data Success to deleted");
        } catch (Exception e) {
            Hooks.deleteTestimonialTest.fail("Data Fail to deleted");
        }
    }
}
