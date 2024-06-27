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

public class LogoutSteps {
    WebDriver driver;
    public LogoutSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
    }

    @Given("admin is on the login page")
    public void admin_is_on_the_login_page() {
        try {
            driver.get("http://127.0.0.1:8000/admin/index");
            Hooks.logoutTest.pass("Success directed to login page");
        } catch (Exception e) {
            Hooks.logoutTest.fail("Fail directed to login page");
        }
    }

    @When("admin log in with correct credentials")
    public void admin_log_in_with_correct_credentials()
    {
        try {
            LoginPage login = new LoginPage(driver);
            login.enterUsername("admin");
            login.enterPassword("rahasia123");
            login.clickLogin();
            Hooks.logoutTest.pass("Success to enter credentials");
        } catch (Exception e) {
            Hooks.logoutTest.fail("Success to enter credentials");
        }
    }

    @Then("admin must be directed to the company dashboard")
    public void admin_must_be_directed_to_the_company_dashboard() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/company";
            Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
            Hooks.logoutTest.pass("Success directed to the company dashboard");
        } catch (Exception e) {
            Hooks.logoutTest.fail("Fail directed to the company dashboard");
        }
    }


    @Given("admin logged in as admin")
    public void admin_logged_in_as_admin(){
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/company";
            Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
            Hooks.logoutTest.pass("Success logged in as admin");
        } catch (Exception e) {
            Hooks.logoutTest.fail("Fail logged in as admin");
        }
    }

    @When("admin clicks the logout button")
    public void admin_click_the_logout_button(){
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            companyPage.clickLogout();
            Hooks.logoutTest.pass("Success click logout button");
        } catch (Exception e) {
            Hooks.logoutTest.fail("Fail click logout button");
        }
    }
    @And("admin clicks sure logout")
    public void adminClicksSureLogout() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            companyPage.clickSureLogout();
            Hooks.logoutTest.pass("Success click sure logout button");
        } catch (Exception e) {
            Hooks.logoutTest.fail("Fail click sure logout button");
        }
    }
    @Then("admin must be directed to the login page")
    public void admin_must_be_directed_to_the_login_page(){
        try {
            LoginPage loginPage = new LoginPage(driver);
            System.out.println(loginPage.getActualUrl());
            String expectedUrl = "http://127.0.0.1:8000/admin/index";
            Assert.assertEquals(expectedUrl, loginPage.getActualUrl());
            Hooks.logoutTest.pass("Success logout and Success directed to the login page");
        } catch (Exception e) {
            Hooks.logoutTest.fail("Fail logout and Fail directed to the login page");
        }
    }


    @After()
    public void closeBrowser() {
        driver.quit();
    }


}
