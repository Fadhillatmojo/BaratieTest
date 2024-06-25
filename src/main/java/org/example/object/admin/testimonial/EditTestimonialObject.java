package org.example.object.admin.testimonial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditTestimonialObject {
    WebDriver driver;

    public EditTestimonialObject(WebDriver driver) {
        this.driver = driver;
    }
    public By getInputName(){
        return By.name("name");
    }
    public By getInputDescription(){
        return By.id("description");
    }
    public By getInputReview(){
        return By.id("review");
    }
    public By getButtonUpdate(){
        return By.id("update-testimonial");
    }
}

