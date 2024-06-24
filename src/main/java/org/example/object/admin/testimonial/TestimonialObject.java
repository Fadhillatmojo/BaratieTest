package org.example.object.admin.testimonial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestimonialObject {
    WebDriver driver;

    public TestimonialObject(WebDriver driver) {
        this.driver = driver;
    }
    public By getButtonCreate(){
        return By.id("btn-create-testimonial");
    }
}
