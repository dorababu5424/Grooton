package com.untilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuntionalityMethods {
	
	public static WebDriver driver;
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\MyTestNg23\\drivers\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 return driver;
	}
	
	public static void geturl(String data) {
		// TODO Auto-generated method stub
		driver.get(data);
	}
	
	public static void maxwin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	public static void sendkeyData(WebElement e,String data) {
		// TODO Auto-generated method stub
		e.sendKeys(data);
	}
	public static void clickButton(WebElement e) {
		// TODO Auto-generated method stub
		e.click();
	}
	
	public static void GetScreenShoot(String path) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File(path);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File sc = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc, f);
	}
	public static void staticwait() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
	}

}
