package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.admin.testimonial.EditTestimonialPage;
import org.example.pages.admin.testimonial.TestimonialPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class UpdateTestimonialSteps {
    WebDriver driver;
    public UpdateTestimonialSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
    }

    @When("admin clicks button edit testimonial")
    public void adminClicksButtonEditTestimonial() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        testimonialPage.clickEditButton();
    }

    @Then("admin must be directed to the edit testimonial page")
    public void adminMustBeDirectedToTheEditTestimonialPage() {
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/testimonial/5/edit";
            Assert.assertEquals(expectedUrl, testimonialPage.getActualUrl());
            Hooks.deleteTestimonialTest.pass("Admin Success to click button sure delete");
        } catch (Exception e) {
            Hooks.deleteTestimonialTest.fail("Admin Fail to click button sure delete");
        }
    }

    @When("admin enters testimonial data to update")
    public void adminEntersTestimonialDataToUpdate() {
        EditTestimonialPage editTestimonialPage = new EditTestimonialPage(driver);
        editTestimonialPage.clearAllInputText();
        editTestimonialPage.enterName("Miftah");
        editTestimonialPage.enterDescription("Sumpah Ini Catering ter worth it sepanjang masa cuy!");
        editTestimonialPage.enterReview("Nampol Enaknya!");
    }

    @And("admin clicks update testimonial button")
    public void adminClicksUpdateTestimonialButton() {
        EditTestimonialPage editTestimonialPage = new EditTestimonialPage(driver);
        editTestimonialPage.clickUpdateTestimonial();
    }

    @And("the data must been updated in table")
    public void theDataMustBeenUpdatedInTable() {
    }


}
