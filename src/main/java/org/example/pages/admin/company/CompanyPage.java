package org.example.pages.admin.company;

import org.example.object.admin.company.CompanyObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    public void clickSureLogout(){
        By buttonElement = companyObject.getButtonSureLogout();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickMenuTestimonial() {
        By buttonElement = companyObject.getButtonMenuTestimonial();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickButtonEditCompany() {
        By buttonElement = companyObject.getButtonEdit();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public boolean isDataUpdated() {
        try {
            By updatedData = companyObject.getDataUpdated();
            WebElement data = driver.findElement(updatedData);
            return data.isDisplayed();
        } catch (Exception e) {
            // Log or handle the exception if needed
            return false; // Return false if element is not found
        }
    }


    public String getActualUrl() {
        return driver.getCurrentUrl();
    }
}
