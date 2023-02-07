package demo.nopcommerce;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	static Select s;
	static Robot r;
	static Alert a;
	static Actions act;
	
	
	public static void Launchbrowser(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void Togettext(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}

	public static void Toclick(WebElement element) {
		element.click();

	}

	public static void Tosendkeys(WebElement element, String sendstring) {
		element.sendKeys(sendstring);

	}

	public static void Toselectbyindex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);

	}

	public static void Toselectbyvalue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);

	}

	public static void Toselectbytext(WebElement element, String txt) {
		s = new Select(element);
		s.selectByVisibleText(txt);
		
	}
	
	public static void  Towaits(int sec) {
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void Torobot(int key) throws AWTException {
		r=new Robot();
		r.keyPress(key);
		r.keyRelease(key);
	}
	
	public static void Toalertaccept() {
		a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void Toalertdismiss() {
		a = driver.switchTo().alert();
		a.dismiss();
	}
	
	public static void Toalertsendkeys(String txt) {
		a = driver.switchTo().alert();
		a.sendKeys(txt);
	}
	
	public static void Tomousehover(WebElement target) {
		act = new Actions(driver);
		act.moveToElement(target);
	}
	
	public static String Excelpass(String SheetName,int row,int cell) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ranjithkumar.sivakum\\maven\\ExcelData\\TC1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet(SheetName);
		
		Row r = sheet.getRow(row);
		
		String pass = r.getCell(cell).getStringCellValue();
		
		return pass;
		
	}
	
	public static void Screenshot(String Filepath) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(Filepath);
		FileUtils.copyFile(SrcFile, DestFile);

	}
	
	
	
	
	
	

}