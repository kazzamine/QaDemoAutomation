package com.demoQaAutomation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue="com.demoQaAutomation",plugin = {"pretty","html:target/cucumber-reports/cucumber-html-report","json:target/cucumber-reports/cucumber.json"})
public class TestRunner {
}
