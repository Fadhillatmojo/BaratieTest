package org.example.object.admin.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyObject {
    WebDriver driver;

    public CompanyObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getButtonLogout(){
        return By.id("logoutbtn");
    }

    public By getButtonMenuTestimonial() {
        return By.id("sidebar-testimonial");
    }

    public By getButtonSureLogout() {
        return By.id("sure-logout");
    }
}
