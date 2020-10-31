package org.grooton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import freemarker.template.utility.DateUtil;

public class FuntionalityMethods {
	
public static WebDriver driver;
	
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DORABABU\\eclipse-workspace\\Myselenium231\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		}
	public static void geturl(String data) {
		// TODO Auto-generated method stub
		driver.get(data);
	}
	
	public static void maxizmiewin() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	public static void txtsendkey(WebElement e1 , String data) {
		// TODO Auto-generated method stub
		e1.sendKeys(data);
	}
	public static void click(WebElement e1) {
		// TODO Auto-generated method stub
		e1.click();
	}
	public static  void selectbyvisibletext(WebElement e1, String data) {
		// TODO Auto-generated method stub
		Select s = new Select(e1);
		s.selectByVisibleText(data);

	}
	public static void selectbyvisiblevalue(WebElement e1, String data) {
		// TODO Auto-generated method stub
		Select s = new Select(e1);
		s.selectByValue(data);
	}
	public static void selectbyin(WebElement e1, int r) {
		// TODO Auto-generated method stub
		Select s = new Select(e1);
		s.selectByIndex(r);
	}
	public static void impilicitwait() {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public static void scroldown() throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor je = (JavascriptExecutor) driver;
		for (int i = 0; i < 10; i++) {
			je.executeScript("window.scrollBy(0,50)");
			Thread.sleep(2000);
		}
		
	}
	public static void takescreenshot() throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot tk  = (TakesScreenshot) driver;
		File f = new File("C:\\Users\\DORABABU\\Pictures\\Screenshots\\out3s.png");
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, f);
	}
	
	public static String getcurrenturl() { 
		// TODO Auto-generated method stub
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static void currentwinid() {
		// TODO Auto-generated method stub
		String currentwin = driver.getWindowHandle();
		System.out.println(currentwin);
	}
	
	public static void swtichtowin(int w) {
		// TODO Auto-generated method stub
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new LinkedList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(w));
	}
	
	public static void swtichtochildwin() {
		// TODO Auto-generated method stub
		driver.switchTo().defaultContent();
		}
	public static void swtichFrame(String id) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(id);
	}
	public static WebElement MultipleWebElemwnts(String path,int i) {
		// TODO Auto-generated method stub
		List<WebElement> listWebelements = driver.findElements(By.xpath(path));
			WebElement webElement = listWebelements.get(i);
			return webElement;
	}
	public static void SelectingMultipleCheckBoxs(String path,String data1, String data2 ) {
		// TODO Auto-generated method stub
		List<WebElement> checkbox = driver.findElements(By.xpath(path));
		
		for (WebElement webElement : checkbox) {
			if (webElement.getText().equals(data1)|webElement.getText().equals(data2)) {
			webElement.click();	
			}	
		}	
	}
	
	public static void excelupdate(int r1, int c1,String value) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Grootontestng\\src\\test\\resources\\Files\\data2.xlsx");
		 FileInputStream fin = new FileInputStream(f);
		 
		 Workbook w = new XSSFWorkbook(fin);
		 Sheet createSheet = w.getSheet("Junior Engineer");
		 Row r = createSheet.getRow(r1);
		 Cell c = r.createCell(c1);
		 c.setCellValue(value);
		
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	}
	
	public static String excelread(int r, int c) throws IOException {
		// TODO Auto-generated method stub
		File f  = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Grootontestng\\src\\test\\resources\\Files\\data2.xlsx");
		FileInputStream fil  = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(fil);
		
		Sheet s = w.getSheet("Junior Engineer");
		Row row = s.getRow(r);
		Cell cell = row.getCell(c);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType==1) {
			value = cell.getStringCellValue();
		}else if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(cell)) {
			
			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			value = sim.format(d);
		}else {
			double d = cell.getNumericCellValue();
			
			long l = (long)d;
			value = String.valueOf(l);
			return value;
		}
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

	}
