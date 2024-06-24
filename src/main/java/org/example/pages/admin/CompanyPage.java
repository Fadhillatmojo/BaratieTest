package org.example.pages.admin;

import org.example.object.admin.CompanyObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyPage {
    WebDriver driver;
    CompanyObject companyObject;
    BasePage basePage;

    public CompanyPage (WebDriver driver) {
        this.driver = driver;
        companyObject = new CompanyObject(driver);
        basePage = new BasePage(driver);
    }

    public void clickLogout(){
        By buttonElement = companyObject.getButtonLogout();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }
}
