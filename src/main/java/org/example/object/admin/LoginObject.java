package org.example.object.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginObject {
    WebDriver driver;

    public LoginObject(WebDriver driver) {
        this.driver = driver;
    }

    public By getInputUsername(){
        return By.name("emailOrUsn");
    }
    public By getInputPassword(){
        return By.name("password");
    }
    public By getButtonSubmit(){
        return By.id("submit-btn");
    }

}