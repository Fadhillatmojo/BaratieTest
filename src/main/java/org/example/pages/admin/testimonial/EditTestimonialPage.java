package org.example.pages.admin.testimonial;

import org.example.object.admin.testimonial.EditTestimonialObject;
import org.example.object.admin.testimonial.TestimonialObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditTestimonialPage {
    WebDriver driver;
    EditTestimonialObject editTestimonialObject;
    BasePage basePage;

    public EditTestimonialPage (WebDriver driver) {
        this.driver = driver;
        editTestimonialObject = new EditTestimonialObject(driver);
        basePage = new BasePage(driver);
    }
    public void clearAllInputText() {
        By nameElement = editTestimonialObject.getInputName();
        By descriptionElement = editTestimonialObject.getInputDescription();
        By reviewElement = editTestimonialObject.getInputReview();
        try {
            basePage.clearText(nameElement);
            basePage.clearText(descriptionElement);
            basePage.clearText(reviewElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterName(String query) {
        By nameElement = editTestimonialObject.getInputName();
        try {
            basePage.inputText(nameElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterDescription(String query){
        By descriptionElement = editTestimonialObject.getInputDescription();
        try {
            basePage.inputText(descriptionElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterReview(String query){
        By reviewElement = editTestimonialObject.getInputReview();
        try {
            basePage.inputText(reviewElement, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickUpdateTestimonial() {
        By buttonElement = editTestimonialObject.getButtonUpdate();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
