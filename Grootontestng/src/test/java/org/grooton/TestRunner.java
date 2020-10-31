package org.grooton;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunner extends FuntionalityMethods {

	
	@BeforeSuite
	private void Lunchbrowser() {
		// TODO Auto-generated method stub
		getdriver();
	}
	@BeforeClass
	private void maxwin() {
		// TODO Auto-generated method stub
		maxizmiewin();
	}
	@AfterSuite
	private void aftersuite() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	@BeforeTest
	private void url() {
		// TODO Auto-generated method stub
		geturl("https://www.grootan.com/");
	}
	
	@Test
	private void tc1() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[text()='Team']")).click();
	}
	
	@Test
	private void tc2() throws IOException {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<Integer, String>();
		List<WebElement> je = driver.findElements(By.xpath("//h5[@class='member-role']"));
		for (WebElement webElement : je) {
			String text = webElement.getText();
			for (int i = 1; i < je.size(); i++) {
				for (int j = 1; j < je.size(); j++) {
					excelupdate(i, j, text);
				}
			}
			
		
		}
		
		
	}
	
	@Test(enabled=false)
	private void tc3() {
		// TODO Auto-generated method stub
		List<WebElement> je = driver.findElements(By.xpath("//h3[@class='member-name']"));
		for (WebElement webElement : je) {
			String text = webElement.getText();
			System.out.println(text);
			
		}

	}
	
}
























