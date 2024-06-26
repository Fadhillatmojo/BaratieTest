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
    public By getButtonEdit() {
        return By.id("btn-edit-company");
    }

    public By getButtonSureLogout() {
        return By.id("sure-logout");
    }

    public By getDataUpdated() {
        return By.xpath("//*[contains(text(),'Baratie Corp After Update')]");
    }
}
