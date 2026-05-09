package com.demoQaAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {
    private WebDriver driver;

    private By fullNameTextBox=By.id("userName");
    private By emailTextBox=By.id("userEmail");
    private By currentAddressTextArea=By.id("currentAddress");
    private By permanentAddressTextArea=By.id("permanentAddress");
    private By submitButton=By.id("submit");
    private By nameOutput=By.cssSelector("#output #name");
    private By emailOutput=By.cssSelector("#output #email");
    private By currentAddressOutput=By.cssSelector("#output #currentAddress");
    private By permanentAddressOutput=By.cssSelector("#output #permanentAddress");


    public TextBoxPage(WebDriver driver) {
        this.driver=driver;
    }
    public void enterFullName(String fullName){
        driver.findElement(fullNameTextBox).sendKeys(fullName);
    }
    public void enterEmail(String email){
        driver.findElement(emailTextBox).sendKeys(email);
    }
    public void enterCurrentAddress(String currentAdress){
        driver.findElement(currentAddressTextArea).sendKeys(currentAdress);
    }
    public void enterPermanentAddress(String permanentAdress){
        driver.findElement(permanentAddressTextArea).sendKeys(permanentAdress);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }


    public String getNameOutput(){
       return driver.findElement(nameOutput).getText();
    }
    public String getEmailOutput(){
        return  driver.findElement(emailOutput).getText();
    }
    public String getCurrentAddressOutput(){
        return  driver.findElement(currentAddressOutput).getText();
    }
    public String getPermanentAddressOutput(){
        return  driver.findElement(permanentAddressOutput).getText();
    }

}
