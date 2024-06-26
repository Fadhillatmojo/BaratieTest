package org.example.object.admin.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditCompanyObject {
    WebDriver driver;

    public EditCompanyObject(WebDriver driver) {
        this.driver = driver;
    }
    public By getInputName(){
        return By.name("name");
    }
    public By getInputFounder(){
        return By.name("founder");
    }
    public By getInputWhatsapp(){
        return By.name("whatsapp");
    }
    public By getInputUsernameIG(){
        return By.name("instagram");
    }
    public By getInputEmail(){
        return By.name("email");
    }
    public By getInputLocation(){
        return By.name("location");
    }
    public By getInputRelation(){
        return By.name("relational_amount");
    }
    public By getInputAbout(){
        return By.name("about");
    }
    public By getInputImage(){
        return By.id("image");
    }

    public By getButtonUpdateCompany() {
        return By.id("btn-update");
    }
}
