package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.admin.company.CompanyPage;
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
    public void admin_on_the_login_page() {
        // setup
        driver.get("http://127.0.0.1:8000/admin/index");
    }

    @When("admin sign in with correct credentials")
    public void admin_sign_in_with_correct_credentials() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("rahasia123");
    }
    @And("admin clicks login button")
    public void adminClicksLoginButton() {
        LoginPage login = new LoginPage(driver);
        login.clickLogin();
    }

    @Then("admin should redirected to the dashboard Company page")
    public void admin_should_redirected_to_the_dashboard_company_page() {
        CompanyPage companyPage = new CompanyPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/company";
        Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }


}
