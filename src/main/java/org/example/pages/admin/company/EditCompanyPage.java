package org.example.pages.admin.company;

import org.example.object.admin.company.EditCompanyObject;
import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditCompanyPage {
    WebDriver driver;
    EditCompanyObject editCompanyObject;
    BasePage basePage;

    public EditCompanyPage(WebDriver driver) {
        this.driver = driver;
        editCompanyObject = new EditCompanyObject(driver);
        basePage = new BasePage(driver);
    }
    public void enterName(String query){
        By inputName = editCompanyObject.getInputName();
        try {
            basePage.inputText(inputName, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterFounder(String query){
        By inputFounder = editCompanyObject.getInputFounder();
        try {
            basePage.inputText(inputFounder, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterWhatsapp(String query){
        By inputWhatsapp = editCompanyObject.getInputWhatsapp();
        try {
            basePage.inputText(inputWhatsapp, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterInstagram(String query){
        By inputInstagram = editCompanyObject.getInputUsernameIG();
        try {
            basePage.inputText(inputInstagram, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterEmail(String query){
        By inputEmail = editCompanyObject.getInputEmail();
        try {
            basePage.inputText(inputEmail, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterLocation(String query){
        By inputLocation = editCompanyObject.getInputLocation();
        try {
            basePage.inputText(inputLocation, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterRelational(String query){
        By inputRelation = editCompanyObject.getInputRelation();
        try {
            basePage.inputText(inputRelation, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterAbout(String query){
        By inputAbout = editCompanyObject.getInputAbout();
        try {
            basePage.inputText(inputAbout, query);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterImage(){
        By inputImage = editCompanyObject.getInputImage();
        String imagePath = "/c/Users/User/Pictures/lowpolu.jpg";
        try {
            WebElement inputElement = driver.findElement(inputImage);
            inputElement.sendKeys(imagePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void clickUpdateButton(){
        By buttonElement = editCompanyObject.getButtonUpdateCompany();
        try {
            basePage.click(buttonElement);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getActualUrl() {
        return driver.getCurrentUrl();
    }

    public void clearAllInputText() {
        By nameElement = editCompanyObject.getInputName();
        By inputFounder = editCompanyObject.getInputFounder();
        By inputUsernameIG = editCompanyObject.getInputUsernameIG();
        By inputEmail = editCompanyObject.getInputEmail();
        By inputLocation = editCompanyObject.getInputLocation();
        By inputRelation = editCompanyObject.getInputRelation();
        By inputAbout = editCompanyObject.getInputAbout();
        By inputWhatsapp = editCompanyObject.getInputWhatsapp();
        try {
            basePage.clearText(nameElement);
            basePage.clearText(inputFounder);
            basePage.clearText(inputWhatsapp);
            basePage.clearText(inputUsernameIG);
            basePage.clearText(inputEmail);
            basePage.clearText(inputLocation);
            basePage.clearText(inputRelation);
            basePage.clearText(inputAbout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
