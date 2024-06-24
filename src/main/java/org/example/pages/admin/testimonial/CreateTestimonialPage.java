package org.example.pages.admin.testimonial;

import org.example.object.admin.testimonial.CreateTestimonialObject;
import org.example.object.admin.testimonial.TestimonialObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTestimonialPage {
    WebDriver driver;
    CreateTestimonialObject createTestimonialObject;
    BasePage basePage;

    public CreateTestimonialPage (WebDriver driver) {
        this.driver = driver;
        createTestimonialObject = new CreateTestimonialObject(driver);
        basePage = new BasePage(driver);
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }

    public void enterName(String query) {
        By nameElement = createTestimonialObject.getInputName();
        try {
            basePage.inputText(nameElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterDescription(String query){
        By descriptionElement = createTestimonialObject.getInputDescription();
        try {
            basePage.inputText(descriptionElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterReview(String query){
        By reviewElement = createTestimonialObject.getInputReview();
        try {
            basePage.inputText(reviewElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickButtonCreate(){
        By buttonElement = createTestimonialObject.getButtonAdd();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
