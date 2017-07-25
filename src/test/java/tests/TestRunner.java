package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.*;

@CucumberOptions(features = {"src/test/java/features"},glue={"stepDefinition"})

public class TestRunner extends AbstractTestNGCucumberTests{

}