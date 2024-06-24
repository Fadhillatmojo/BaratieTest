package org.example.object.admin.testimonial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateTestimonialObject {
    WebDriver driver;

    public CreateTestimonialObject(WebDriver driver) {
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
    public By getButtonAdd(){
        return By.id("btn-add-testimonial");
    }
}
