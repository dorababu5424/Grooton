package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.JvmReport.GenerateJvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"com.stepdefinition"},monochrome=true,snippets=SnippetType.CAMELCASE,strict=true,plugin= {"pretty","json:src\\test\\resources\\Report\\cucumber.json"},dryRun=false)
public class TestRunner {
	
	
	@AfterClass
	public static void afterclass() {
		// TODO Auto-generated method stub
		
		GenerateJvmReport.generatereport("C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Report\\cucumber.json");
		
	}

}
