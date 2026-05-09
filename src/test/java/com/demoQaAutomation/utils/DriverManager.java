package com.demoQaAutomation.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager
{
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            if("true".equals(System.getProperty("headless"))){
                options.addArguments("--headless");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            }

            driver=new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
