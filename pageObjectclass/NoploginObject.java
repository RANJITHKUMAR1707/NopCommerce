package pageObjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NoploginObject {

	public WebElement Loginclick(WebDriver driver) {
		return driver.findElement(By.partialLinkText("Log "));
	}

	public WebElement Email(WebDriver driver) {
		return driver.findElement(By.id("Email"));
	}

	public WebElement Pass(WebDriver driver) {
		return driver.findElement(By.id("Password"));
	}

	public WebElement Loginbtn(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Log in']"));
	}

	public WebElement Search(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@placeholder='Search store']"));
	}

	public WebElement Advsearch(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='advs']"));
	}

	public WebElement Category(WebDriver driver) {
		return driver.findElement(By.xpath("//select[@name='cid']"));
	}

	public WebElement Manufacturer(WebDriver driver) {
		return driver.findElement(By.xpath("//select[@name='mid']"));
	}

	public WebElement Searchbtn(WebDriver driver) {
		return driver.findElement(By.xpath("(//button[text()='Search'])[2]"));
	}

	public WebElement Macbook(WebDriver driver) {
		return driver.findElement(By.xpath("//*[text()='Apple MacBook Pro 13-inch']"));
	}

	public WebElement Addtocart(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Add to cart']"));
	}

	public WebElement Addtocartpopup(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='shopping cart']"));
	}

	public WebElement Checkout(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()=' Checkout ']"));
	}

	public WebElement Termspopup(WebDriver driver) {
		return driver.findElement(By.xpath("//p[text()='Please accept the terms of service before the next step.']"));
	}

	public WebElement Close(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@title='Close']"));
	}

	public WebElement Termscheckbox(WebDriver driver) {
		return driver.findElement(
				By.xpath("//Label[text()='I agree with the terms of service and I adhere to them unconditionally']"));
	}

	public WebElement checkoutguest(WebDriver driver) {
		return driver.findElement(By.xpath("//button[text()='Checkout as Guest']"));
	}

	public WebElement FirstName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']"));
	}

	public WebElement LastName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']"));
	}

	public WebElement Emailbill(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']"));
	}

	public WebElement Company(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']"));
	}

	public WebElement Country(WebDriver driver) {
		return driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
	}

	public WebElement City(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']"));
	}

	public WebElement PhnNo(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"));
	}

	public WebElement Add1(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']"));
	}

	public WebElement Add2(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']"));
	}

	public WebElement Pincode(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"));
	}

	public WebElement Con1(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class=\"button-1 new-address-next-step-button\"]"));
	}

	public WebElement Con3(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
	}

	public WebElement Con4(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
	}

	public WebElement Con5(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]"));
	}

	public WebElement Confirm(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]"));
	}

	public WebElement OrderDetails(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Click here for order details.']"));
	}

	public WebElement Print(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Print']"));
	}

	public WebElement ScrollDown(WebDriver driver) {
		return driver.findElement(By.xpath("//label[text()='Order Total:']"));
	}

}
