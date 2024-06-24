package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.admin.CompanyPage;
import org.example.pages.admin.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;
    public LoginSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
    }
    @Given("admin on the login page")
    public void i_am_on_the_login_page() {
        // setup
        driver.get("http://127.0.0.1:8000/admin/index");
    }

    @When("admin sign in with correct credentials")
    public void i_sign_in_with_correct_credentials() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("rahasia123");
        login.clickLogin();
    }

    @Then("admin should redirected to the admin Perusahaan page")
    public void i_should_redirected_to_the_admin_company_page() {
        CompanyPage companyPage = new CompanyPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/company";
        Assert.assertEquals(companyPage.getActualUrl(), expectedUrl);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
