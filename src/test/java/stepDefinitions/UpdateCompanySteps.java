package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.admin.company.CompanyPage;
import org.example.pages.admin.company.EditCompanyPage;
import org.example.pages.admin.testimonial.EditTestimonialPage;
import org.example.pages.admin.testimonial.TestimonialPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class UpdateCompanySteps {

    WebDriver driver;
    public UpdateCompanySteps() {
        this.driver = Hooks.getDriver(); // Mendapatkan instance WebDriver dari Hooks
    }
    @Given("admin in the company page")
    public void adminInTheCompanyPage() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/company";
            Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
            Hooks.createTestimonialTest.pass("Admin Success in the company page success");
        } catch (Exception e) {
            Hooks.createTestimonialTest.fail("Admin Fail to directed company page");
        }
    }

    @When("admin clicks button edit company")
    public void adminClicksButtonEditCompany() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            companyPage.clickButtonEditCompany();
            Hooks.updateCompanyTest.pass("Admin Success to click button edit company");
        } catch (Exception e) {
            Hooks.updateCompanyTest.fail("Admin Fail to click button edit company");
        }
    }

    @Then("admin must be directed to the edit company page")
    public void adminMustBeDirectedToTheEditCompanyPage() {
        try {
            EditCompanyPage editCompanyPage = new EditCompanyPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/company/1/edit";
            Assert.assertEquals(expectedUrl, editCompanyPage.getActualUrl());
            Hooks.updateCompanyTest.pass("Admin Success directed to edit testimonial page");
        } catch (Exception e) {
            Hooks.updateCompanyTest.fail("Admin Fail directed to edit testimonial page");
        }
    }

    @When("admin enters company data to update")
    public void adminEntersCompanyDataToUpdate() {
        try {
            EditCompanyPage editCompanyPage = new EditCompanyPage(driver);
            editCompanyPage.clearAllInputText();
            editCompanyPage.enterName("Baratie Corp After Update");
            editCompanyPage.enterFounder("Bu Tri");
            editCompanyPage.enterWhatsapp("08192121434");
            editCompanyPage.enterInstagram("baratieig");
            editCompanyPage.enterEmail("baratie@gmail.com");
            editCompanyPage.enterLocation("Yogyakarta");
            editCompanyPage.enterRelational("200");
            editCompanyPage.enterAbout("Saat minyak rem dikuras dan ganti baru ternyata perlu dikocok ulang atau biasa juga disebut bleeding. Bleeding pada minyak rem dilakukan agar");
//            editCompanyPage.enterImage();

            Hooks.updateCompanyTest.pass("Admin Success Enter company data");
        } catch (Exception e) {
            Hooks.updateCompanyTest.fail("Admin Fail Enter company data");
        }
    }
    @And("admin clicks update company button")
    public void adminClicksUpdateCompanyButton() {
        try {
            EditCompanyPage editCompanyPage = new EditCompanyPage(driver);
            editCompanyPage.clickUpdateButton();
            Hooks.updateCompanyTest.pass("Admin Success to click update company button");
        } catch (Exception e) {
            Hooks.updateCompanyTest.fail("Admin Fail to click update company button");
        }
    }

    @Then("admin must be directed again to the company page")
    public void adminMustBeDirectedAgainToTheCompanyPage() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            String expectedUrl = "http://127.0.0.1:8000/admin/company";
            Assert.assertEquals(expectedUrl, companyPage.getActualUrl());
            Hooks.updateCompanyTest.pass("Admin Success directed to company page");
        } catch (Exception e) {
            Hooks.updateCompanyTest.fail("Admin Fail directed to company page");
        }
    }

    @And("the data must been updated")
    public void theDataMustBeenUpdated() {
        try {
            CompanyPage companyPage = new CompanyPage(driver);
            Assert.assertTrue(companyPage.isDataUpdated());
            Hooks.updateCompanyTest.pass("Data Success to updated");
        } catch (Exception e) {
            Hooks.updateCompanyTest.fail("Data Failed to updated");
        }
    }
}
