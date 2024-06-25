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
    public By getDataTestimonial(){
        return By.xpath("//*[contains(text(),'Firja')]");
    }

    public By getButtonDelete(){
        return By.xpath("/html/body/div/div[1]/main/div/div[2]/div/div[7]/div[3]/div/div[2]/form/button");
    }

    public By getButtonSureDelete() {
        return By.id("del-btn-5");
    }
}
