package org.example.pages.admin;


import org.example.object.admin.SertifikatObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SertifikatPage {
    WebDriver driver;
    SertifikatObject sertifikatObject;
    BasePage basePage;

    public SertifikatPage (WebDriver driver) {
        this.driver = driver;
        sertifikatObject = new SertifikatObject(driver);
        basePage = new BasePage(driver);
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }


}