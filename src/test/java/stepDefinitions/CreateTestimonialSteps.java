package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.admin.company.CompanyPage;
import org.example.pages.admin.LoginPage;
import org.example.pages.admin.testimonial.CreateTestimonialPage;
import org.example.pages.admin.testimonial.TestimonialPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CreateTestimonialSteps {
    WebDriver driver;
    public CreateTestimonialSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
    }

    @When("admin login with correct credentials")
    public void admin_login_with_correct_credentials()
    {
        try {
            LoginPage login = new LoginPage(driver);
            login.enterUsername("admin");
            login.enterPassword("rahasia123");
            login.clickLogin();
            Hooks.createTestimonialTest.pass("Admin Success enter the user data");

        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Fail to enter the user data");
        }
    }

    @Then("admin must be directed to the admin dashboard")
    public void admin_must_be_directed_to_the_admin_dashboard() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/company";
            Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
            Hooks.createTestimonialTest.pass("Fail to directed to create testimonial page");

        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Fail to directed to create testimonial page");
        }
    }


    @When("admin clicks testimonial menu")
    public void admin_clicks_testimonial_menu()
    {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            companyPage.clickMenuTestimonial();
            Hooks.createTestimonialTest.pass("Admin Success to click testimonial Menu");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Admin fail to click testimonial Menu");
        }
    }

    @Then("admin must be directed to the testimonial page")
    public void admin_must_be_directed_to_the_testimonial_page() {
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/testimonial";
            Assert.assertEquals(expectedUrl, testimonialPage.getActualUrl());
            Hooks.createTestimonialTest.pass("Admin success to directed to create testimonial page");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Admin Fail to directed to create testimonial page");
        }
    }

    @Given("admin in the testimonial page")
    public void admin_in_the_testimonial_page(){
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/testimonial";
            Assert.assertEquals(expectedUrl, testimonialPage.getActualUrl());
            Hooks.createTestimonialTest.pass("Admin in the testimonial page success");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Admin Fail to directed testimonial page");
        }
    }

    @When("admin clicks button create testimonial")
    public void adminClicksButtonCreateTestimonial() {
        try{
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            testimonialPage.clickButtonCreate();
            Hooks.createTestimonialTest.pass("Admin Success to click button create testimonial");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Admin Fail to click button create testimonial");
        }
    }

    @Then("admin must be directed to the create testimonial page")
    public void adminMustBeDirectedToTheCreateTestimonialPage() {

        try{
            CreateTestimonialPage createTestimonialPage = new CreateTestimonialPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/testimonial/create";
            Assert.assertEquals(expectedUrl, createTestimonialPage.getActualUrl());
            Hooks.createTestimonialTest.pass("Admin sucess directed to create testimonial page");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Fail to directed to create testimonial page");
        }
    }

    @When("admin enters testimonial data")
    public void adminEntersTestimonialData() {
        try {
            CreateTestimonialPage createTestimonialPage = new CreateTestimonialPage(driver);
            createTestimonialPage.enterName("Firja");
            createTestimonialPage.enterDescription("Deskripsi test");
            createTestimonialPage.enterReview("Enak");

            Hooks.createTestimonialTest.pass("Fill the testimonial data with all the keyword");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Fail to fill testimonial data");
        }

    }
    @And("admin clicks add testimonial button")
    public void adminClicksAddTestimonialButton() {
        try {
            CreateTestimonialPage createTestimonialPage = new CreateTestimonialPage(driver);
            createTestimonialPage.clickButtonCreate();
            Hooks.createTestimonialTest.pass("Admin Success to click add testimonial button");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Admin Fail to click add testimonial button");
        }
    }

    @Then("admin must be directed again to the testimonial page")
    public void adminMustBeDirectedAgainToTheTestimonialPage() {
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/testimonial";
            Assert.assertEquals(expectedUrl, testimonialPage.getActualUrl());
            Hooks.createTestimonialTest.pass("Admin Success to directed to testimonial page");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Admin Fail to directed to testimonial page");

        }
    }

    @And("the data must appear in table")
    public void theDataMustAppearInTable() {
        try {
            TestimonialPage testimonialPage = new TestimonialPage(driver);
            Assert.assertTrue(testimonialPage.isDataDisplayed());
            Hooks.createTestimonialTest.pass("Data Success to appear");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Data Failed to appear");

        }
    }
}
