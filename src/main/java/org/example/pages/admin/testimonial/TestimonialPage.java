package org.example.pages.admin.testimonial;

import org.example.object.admin.testimonial.TestimonialObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
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

    public void clickButtonCreate(){
        By buttonElement = testimonialObject.getButtonCreate();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
