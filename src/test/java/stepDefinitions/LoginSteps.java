package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.admin.LoginPage;
import org.example.pages.admin.SertifikatPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;
    public LoginSteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
    }
    @Given("i am on the login page")
    public void i_am_on_the_login_page() {
        // setup
        driver.get("http://127.0.0.1:8000/admin/index");
    }

    @When("i sign in with correct credentials")
    public void i_sign_in_with_correct_credentials() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("admin");
        login.enterPassword("rahasia123");
        login.clickLogin();
    }

    @Then("i should redirected to the admin sertifikat page")
    public void i_should_redirected_to_the_admin_sertifikat_page() {
        SertifikatPage sertifikatPage = new SertifikatPage(driver);
        String expectedUrl = "http://127.0.0.1:8000/admin/sertificate";
        Assert.assertEquals(sertifikatPage.getActualUrl(), expectedUrl);
    }

    @After()
    public void closeBrowser() {
        driver.quit();
    }
}
