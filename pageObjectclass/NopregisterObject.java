package pageObjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NopregisterObject {

	public WebElement Register(WebDriver driver) {
		return driver.findElement(By.linkText("Register"));
	}

	public WebElement Gender(WebDriver driver) {
		return driver.findElement(By.xpath("(//input)[3]"));
	}

	public WebElement FirstName(WebDriver driver) {
		return driver.findElement(By.xpath("(//div[@class='inputs']/child::input)[1]"));
	}

	public WebElement LastName(WebDriver driver) {
		return driver.findElement(By.id("LastName"));
	}

	public WebElement Mailid(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@name=\"LastName\"]/following::input"));
	}

	public WebElement Day(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/child::select[1]"));
	}

	public WebElement Mon(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/child::select[2]"));
	}

	public WebElement Year(WebDriver driver) {
		return driver.findElement(By.xpath("//div[@class='date-picker-wrapper']/child::select[3]"));
	}

	public WebElement Companyname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='Company']"));
	}

	public WebElement Pass(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password'][@id='Password']"));
	}

	public WebElement Cnfmpass(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='password']/following::input"));
	}

	public WebElement Regclick(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@id='register-button']"));
	}

}
