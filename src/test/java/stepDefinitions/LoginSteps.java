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
        try {
            driver.get("http://127.0.0.1:8000/admin/index");
            Hooks.loginTest.pass("Success directed to login page");
        } catch (Exception e) {
            Hooks.loginTest.fail("Fail directed to login page");
        }
    }

    @When("admin sign in with correct credentials")
    public void admin_sign_in_with_correct_credentials() {
        try {
            LoginPage login = new LoginPage(driver);
            login.enterUsername("admin");
            login.enterPassword("rahasia123");
            Hooks.loginTest.pass("Success enter credentials");
        } catch (Exception e) {
            Hooks.loginTest.fail("Fail enter credentials");
        }
    }
    @And("admin clicks login button")
    public void adminClicksLoginButton() {
        try {
            LoginPage login = new LoginPage(driver);
            login.clickLogin();
            Hooks.loginTest.pass("Success click login button");
        } catch (Exception e) {
            Hooks.loginTest.fail("Fail click login button");
        }
    }

    @Then("admin should redirected to the dashboard Company page")
    public void admin_should_redirected_to_the_dashboard_company_page() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/company";
            Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
            Hooks.loginTest.pass("Success directed to dashboard admin");
        } catch (Exception e) {
            Hooks.loginTest.fail("Fail directed to dashboard admin");
        }
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }


}
