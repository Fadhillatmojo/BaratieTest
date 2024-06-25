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
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("rahasia123");
        login.clickLogin();
    }

    @Then("admin must be directed to the admin dashboard")
    public void admin_must_be_directed_to_the_admin_dashboard() {
        CompanyPage companyPage = new CompanyPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/company";
        Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
    }


    @When("admin clicks testimonial menu")
    public void admin_clicks_testimonial_menu()
    {
        CompanyPage companyPage = new CompanyPage(driver);
        companyPage.clickMenuTestimonial();
    }

    @Then("admin must be directed to the testimonial page")
    public void admin_must_be_directed_to_the_testimonial_page() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/testimonial";
        Assert.assertEquals(expectedUrl, testimonialPage.getActualUrl());
    }

    @Given("admin in the testimonial page")
    public void admin_in_the_testimonial_page(){
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/testimonial";
        Assert.assertEquals(expectedUrl, testimonialPage.getActualUrl());
    }

    @When("admin clicks button create testimonial")
    public void adminClicksButtonCreateTestimonial() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        testimonialPage.clickButtonCreate();
    }

    @Then("admin must be directed to the create testimonial page")
    public void adminMustBeDirectedToTheCreateTestimonialPage() {
        CreateTestimonialPage createTestimonialPage = new CreateTestimonialPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/testimonial/create";
        Assert.assertEquals(expectedUrl, createTestimonialPage.getActualUrl());
    }

    @When("admin enters testimonial data")
    public void adminEntersTestimonialData() {
        CreateTestimonialPage createTestimonialPage = new CreateTestimonialPage(driver);
        createTestimonialPage.enterName("Firja");
        createTestimonialPage.enterDescription("Deskripsi test");
        createTestimonialPage.enterReview("Enak");
    }
    @And("admin clicks add testimonial button")
    public void adminClicksAddTestimonialButton() {
        CreateTestimonialPage createTestimonialPage = new CreateTestimonialPage(driver);
        createTestimonialPage.clickButtonCreate();
    }

    @Then("admin must be directed again to the testimonial page")
    public void adminMustBeDirectedAgainToTheTestimonialPage() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/testimonial";
        Assert.assertEquals(expectedUrl, testimonialPage.getActualUrl());
    }

    @And("the data must appear in table")
    public void theDataMustAppearInTable() {
        TestimonialPage testimonialPage = new TestimonialPage(driver);
        Assert.assertTrue(testimonialPage.isDataDisplayed());
    }
}
