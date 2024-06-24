package org.example.pages.admin;

import org.example.object.admin.CompanyObject;
import org.example.object.admin.TestimonialObject;
import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class TestimonialPage {
    WebDriver driver;
    TestimonialObject testimonialObject;
    BasePage basePage;

    public TestimonialPage (WebDriver driver) {
        this.driver = driver;
        testimonialObject = new TestimonialObject(driver);
        basePage = new BasePage(driver);
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }
}
