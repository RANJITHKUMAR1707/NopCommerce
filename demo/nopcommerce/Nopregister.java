package demo.nopcommerce;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectclass.NopregisterObject;

public class Nopregister extends BaseClass {

	public static NopregisterObject l;

	// BrowserLaunch
	@Test
	public void TC1() throws IOException {
		Launchbrowser("Firefox", "https://demo.nopcommerce.com/");
		Towaits(10);
	}

	// PersonalDetails
	@Test
	public void TC2() {
		l = new NopregisterObject();
		l.Register(driver).click();
		l.Gender(driver).click();
		l.FirstName(driver).sendKeys("Ranjith");
		l.LastName(driver).sendKeys("Kumar");
		l.Mailid(driver).sendKeys("ranjith7000001@gmail.com");
		WebElement day = l.Day(driver);
		Toselectbyindex(day, 9);
		WebElement mon = l.Mon(driver);
		Toselectbyvalue(mon, "12");
		WebElement year = l.Year(driver);
		Toselectbytext(year, "2001");
	}

	// Company Details
	@Test
	public void TC3() {
		l.Companyname(driver).sendKeys("IMPIGER");
	}

	// Password
	@Test
	public void TC4() {
		WebElement pass = l.Pass(driver);
		pass.sendKeys("welcome");
		String attribute = pass.getAttribute("value");
		l.Cnfmpass(driver).sendKeys(attribute);
		l.Regclick(driver).click();
	}

}
