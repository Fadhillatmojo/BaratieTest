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
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            testimonialPage.clickEditButton();
            Hooks.updateTestimonialTest.pass("Admin Success to click button edit testimonial");
        } catch (Exception e) {
            Hooks.updateTestimonialTest.fail("Admin Fail to click button edit testimonial");
        }
    }

    @Then("admin must be directed to the edit testimonial page")
    public void adminMustBeDirectedToTheEditTestimonialPage() {
        try {
            EditTestimonialPage editTesimonialPage = new EditTestimonialPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/testimonial/5/edit";
            Assert.assertEquals(expectedUrl, editTesimonialPage.getActualUrl());
            Hooks.updateTestimonialTest.pass("Admin Success directed to edit testimonial page");
        } catch (Exception e) {
            Hooks.updateTestimonialTest.fail("Admin Fail directed to edit testimonial page");
        }
    }

    @When("admin enters testimonial data to update")
    public void adminEntersTestimonialDataToUpdate() {
        try {
            EditTestimonialPage editTestimonialPage = new EditTestimonialPage(driver);
            editTestimonialPage.clearAllInputText();
            editTestimonialPage.enterName("Miftah");
            editTestimonialPage.enterDescription("Sumpah Ini Catering ter worth it sepanjang masa cuy!");
            editTestimonialPage.enterReview("Nampol Enaknya!");

            Hooks.updateTestimonialTest.pass("Admin Success Enter testimonial data");
        } catch (Exception e) {
            Hooks.updateTestimonialTest.fail("Admin Fail Enter testimonial data");
        }
    }

    @And("admin clicks update testimonial button")
    public void adminClicksUpdateTestimonialButton() {
        try {
        EditTestimonialPage editTestimonialPage = new EditTestimonialPage(driver);
        editTestimonialPage.clickUpdateTestimonial();
            Hooks.updateTestimonialTest.pass("Admin Success to click update testimonial button");
        } catch (Exception e) {
            Hooks.updateTestimonialTest.fail("Admin Fail to click update testimonial button");
        }
    }

    @And("the data must been updated in table")
    public void theDataMustBeenUpdatedInTable() {
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            Assert.assertTrue(testimonialPage.isDataUpdated());
            Hooks.updateTestimonialTest.pass("Data Success to updated");
        } catch (Exception e) {
            Hooks.updateTestimonialTest.fail("Data Failed to updated");
        }
    }


}
