package org.example.pages.admin.testimonial;

import org.example.object.admin.testimonial.TestimonialObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;

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

    public void clickDeleteButton() {
        By buttonElement = testimonialObject.getButtonDelete();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickSureDelete() {
        By buttonElement = testimonialObject.getButtonSureDelete();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isDataDisplayed() {
        try {
            By dataTestimonial = testimonialObject.getDataTestimonial();
            WebElement data = driver.findElement(dataTestimonial);
            return data.isDisplayed();
        } catch (Exception e) {
            // Log or handle the exception if needed
            return false; // Return false if element is not found
        }
    }

}
