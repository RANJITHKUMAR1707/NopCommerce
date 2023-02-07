package demo.nopcommerce;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjectclass.NoploginObject;

public class Noplogin extends BaseClass {

	public static boolean cart;
	public static boolean terms;
	public static NoploginObject l;

	// Browserlaunch
	@Test
	public void TC1() throws IOException {
		l = new NoploginObject();
		Launchbrowser(Excelpass("TC1", 0, 0), Excelpass("TC1", 1, 0));
		Towaits(50);
	}

	// Login Details
	@Test

	public void TC2() throws IOException {

		driver.navigate().refresh();
		l.Loginclick(driver).click();
		l.Email(driver).sendKeys(Excelpass("TC2", 0, 0));
		l.Pass(driver).sendKeys(Excelpass("TC2", 1, 0));
		l.Loginbtn(driver).click();
	}

	// Product search
	@Test
	public void TC3() throws AWTException {
		WebElement search = l.Search(driver);
		search.sendKeys("apple");
		String a = search.getAttribute("value");
		assertEquals(a, "apple");
		Torobot(KeyEvent.VK_ENTER);
		l.Advsearch(driver).click();
		WebElement srcdrop = l.Category(driver);
		Toselectbyvalue(srcdrop, "3");
		WebElement srcdrop1 = l.Manufacturer(driver);
		Toselectbytext(srcdrop1, "Apple");
		l.Searchbtn(driver).click();
		l.Macbook(driver).click();
	}

	// Adding to cart
	@Test
	public void TC4() {
		l.Addtocart(driver).click();
		cart = l.Addtocartpopup(driver).isDisplayed();
		if (cart == true) {
			l.Addtocartpopup(driver).click();
		}
	}

	// CheckOut Product
	@Test
	public void TC5() throws InterruptedException {

		l.Checkout(driver).click();
		terms = l.Termspopup(driver).isDisplayed();
		if (terms == true) {
			l.Close(driver).click();
			l.Termscheckbox(driver).click();
			l.Checkout(driver).click();
		}
		
		l.checkoutguest(driver).click();
	}

	// Billing Address
	@Test
	public void TC6() throws IOException, InterruptedException {
		l.FirstName(driver).sendKeys(Excelpass("TC3", 0, 0));
		l.LastName(driver).sendKeys(Excelpass("TC3", 1, 0));
		l.Emailbill(driver).sendKeys(Excelpass("TC3", 2, 0));
		l.Company(driver).sendKeys(Excelpass("TC3", 3, 0));
		WebElement country = l.Country(driver);
		Toselectbyvalue(country, Excelpass("TC3", 4, 0));
		l.City(driver).sendKeys(Excelpass("TC3", 5, 0));
		l.Add1(driver).sendKeys(Excelpass("TC3", 6, 0));
		l.Add2(driver).sendKeys(Excelpass("TC3", 7, 0));
		l.Pincode(driver).sendKeys(Excelpass("TC3", 8, 0));
		l.PhnNo(driver).sendKeys(Excelpass("TC3", 9, 0));
		l.Con1(driver).click();
	}

	// PaymentDetails
	@Test
	public void TC7() {
		l.Con3(driver).click();
		l.Con4(driver).click();
		l.Con5(driver).click();
		l.Confirm(driver).click();
		l.OrderDetails(driver).click();
	}

	// Print bill
	@Test
	public void TC8() throws AWTException, InterruptedException {
		l.Print(driver).click();
		Thread.sleep(3000);
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> ls = new ArrayList<String>(handles);
		String parentwindowid = ls.get(1);
		driver.switchTo().window(parentwindowid);
		Torobot(KeyEvent.VK_TAB);
		Torobot(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	// BillScreenshot
	@Test
	public void TC9() throws IOException {
		Screenshot("C:\\Users\\ranjithkumar.sivakum\\maven\\screenshots\\OrderDetailsPage1.png");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrolldown = l.ScrollDown(driver);
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
		Screenshot("C:\\Users\\ranjithkumar.sivakum\\maven\\screenshots\\OrderDetailsPage2.png");
	}
	
	

}
