package com.demoQaAutomation.hooks;

import com.demoQaAutomation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        DriverManager.getDriver();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            TakesScreenshot screenshot=(TakesScreenshot) DriverManager.getDriver();
            byte[] bytes=screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(bytes,"image/png",scenario.getName());
        }
        DriverManager.closeDriver();
    }
}
