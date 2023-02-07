package com.feature.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberDec\\src\\test\\java\\com\\feature\\files\\FailedTestCases.feature", 
				 glue="com.stepdefinition.files", 
				 plugin= "rerun:target/failedtestcase.txt")
public class FailedTestRunner {

}
