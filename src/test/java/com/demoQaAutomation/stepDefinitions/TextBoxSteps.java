package com.demoQaAutomation.stepDefinitions;

import com.demoQaAutomation.pages.TextBoxPage;
import com.demoQaAutomation.utils.DriverManager;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TextBoxSteps {
    private WebDriver driver;
    private TextBoxPage textBoxPage;

    @Given("the User is on the Text box page")
    public void userIsOnTextBoxPage(){
      driver= DriverManager.getDriver();
        driver.get("https://demoqa.com/text-box");
        textBoxPage=new TextBoxPage(driver);
    }

    @When("The user fills in Full Name textbox with {string}")
    public void userFillsInFullNameTextBox(String username){
        textBoxPage.enterFullName(username);
    }
    @And("The user fills in Email textbox with {string}")
    public void userFillsInEmailTextBox(String email){
        textBoxPage.enterEmail(email);
    }
    @And("The user fills in Current Address textarea with {string}")
    public void userFillsInCurrentAddressTextBox(String currentAddress){
        textBoxPage.enterCurrentAddress(currentAddress);
    }
    @And("The user fills in Permanent Address textarea with {string}")
    public void userFillsInPermanentAddressTextBox(String permanentAddress){
        textBoxPage.enterPermanentAddress(permanentAddress);
    }
    @And("The user clicks on submit")
    public void userClicksOnSubmitButton(){
        textBoxPage.clickSubmitButton();
    }

    @Then("The output should show the Full Name as {string}")
    public void outputShouldShowFullName(String expectedFullName){
        String fullName=textBoxPage.getNameOutput();
        Assert.assertTrue(fullName.contains(expectedFullName));
    }
    @And("The Email output should show {string}")
    public void outputShouldShowEmail(String expectedEmail){
        String email=textBoxPage.getEmailOutput();
        Assert.assertTrue(email.contains(expectedEmail));
    }
    @And("The Current Address output should show {string}")
    public void outputShouldShowCurrentAddress(String expectedCurrentAddress){
        String currentAddress=textBoxPage.getCurrentAddressOutput();
        Assert.assertTrue(currentAddress.contains(expectedCurrentAddress));
    }
    @And("The Permanent Address output should show {string}")
    public void outputShouldShowPermanentAddress(String expectedPermanentAddress){
        String permanentAddress=textBoxPage.getPermanentAddressOutput();
        Assert.assertTrue(permanentAddress.contains(expectedPermanentAddress));
    }


    @Then("Email textbox should be outlined with red")
    public void emailFieldShouldBeRed(){
        Assert.assertTrue(textBoxPage.isEmailFieldRed());
    }
}
