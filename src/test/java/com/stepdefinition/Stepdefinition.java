package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.By;

import com.untilities.FuntionalityMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends FuntionalityMethods {
	
	
	@Given("user should open Grooton web url in chrome Browser")
	public void userShouldOpenGrootonWebUrlInChromeBrowser() {
		getdriver();
		maxwin();
		geturl("https://www.grootan.com/");
	}

	@When("user should no home page take screenshot")
	public void userShouldNoHomePageTakeScreenshot() throws IOException, InterruptedException {
	   GetScreenShoot("\\C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Screenshots\\home.png");
	   staticwait();
	}

	@Then("user should click on Services button and take screenshot")
	public void userShouldClickOnServicesButtonAndTakeScreenshot() throws IOException, InterruptedException {
	    
		clickButton(driver.findElement(By.xpath("//a[text()='Services']")));
		 GetScreenShoot("\\C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Screenshots\\services.png");
		 staticwait();
	}

	@Then("user should click on Opensource button and take screenshot")
	public void userShouldClickOnOpensourceButtonAndTakeScreenshot() throws IOException, InterruptedException {
		clickButton(driver.findElement(By.xpath("//a[text()='Open Source']")));
		 GetScreenShoot("\\C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Screenshots\\Open Source.png");
		 staticwait();
	}

	@Then("user should click on Blog button and take screenshot")
	public void userShouldClickOnBlogButtonAndTakeScreenshot() throws IOException, InterruptedException {
		clickButton(driver.findElement(By.xpath("//a[text()='Blog']")));
		 GetScreenShoot("\\C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Screenshots\\Blog.png");
		 staticwait();
	}

	@Then("user should click on Team button and take screenshot")
	public void userShouldClickOnTeamButtonAndTakeScreenshot() throws IOException, InterruptedException {
		clickButton(driver.findElement(By.xpath("//a[text()='Team']")));
		 GetScreenShoot("\\C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Screenshots\\Team.png");
		 staticwait();
	}

	@Then("user should click on careers and take scrrenshot")
	public void userShouldClickOnCareersAndTakeScrrenshot() throws IOException, InterruptedException {
		clickButton(driver.findElement(By.xpath("//a[text()='Careers']")));
		 GetScreenShoot("\\C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Screenshots\\Careers.png");
		 staticwait();
	}
	@Then("user should click on Contant and take screenshot")
	public void userShouldClickOnContantAndTakeScreenshot() throws IOException, InterruptedException {
		clickButton(driver.findElement(By.xpath("//a[text()='Contact Us']")));
		 GetScreenShoot("\\C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Screenshots\\Contact Us.png");
		 staticwait();
	}

}
