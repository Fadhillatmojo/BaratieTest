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
        driver.get("http://127.0.0.1:8000/admin/index");
    }

    @When("admin log in with correct credentials")
    public void admin_log_in_with_correct_credentials()
    {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("rahasia123");
        login.clickLogin();
    }

    @Then("admin must be directed to the company dashboard")
    public void admin_must_be_directed_to_the_company_dashboard() {
        CompanyPage companyPage = new CompanyPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/company";
        Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
    }


    @Given("admin logged in as admin")
    public void admin_logged_in_as_admin(){
        CompanyPage companyPage = new CompanyPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/company";
        Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
    }

    @When("admin clicks the logout button")
    public void admin_click_the_logout_button(){
        CompanyPage companyPage = new CompanyPage(driver);
        companyPage.clickLogout();
    }
    @And("admin clicks sure logout")
    public void adminClicksSureLogout() {
        CompanyPage companyPage = new CompanyPage(driver);
        companyPage.clickSureLogout();
    }
    @Then("admin must be directed to the login page")
    public void admin_must_be_directed_to_the_login_page(){
        LoginPage loginPage = new LoginPage(driver);
        System.out.println(loginPage.getActualUrl());
        String expectedUrl = "http://127.0.0.1:8000/admin/index";
        Assert.assertEquals(expectedUrl, loginPage.getActualUrl());
    }


    @After()
    public void closeBrowser() {
        driver.quit();
    }


}
