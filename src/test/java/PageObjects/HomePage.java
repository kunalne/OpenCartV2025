package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myAccount;

	@FindBy(xpath = "//ul[@class= 'dropdown-menu dropdown-menu-right']//li[1]") 
	WebElement register;
	
	@FindBy(xpath = "//a[normalize-space()='Login']") WebElement login;

	public void clickmyAccount() throws InterruptedException {
		myAccount.click();
		Thread.sleep(2000);
	}

	public void clickregister() throws InterruptedException {
		register.click();
		Thread.sleep(2000);
	}
	
	public void clicklogin() throws InterruptedException {
		login.click();
		Thread.sleep(2000);
	}

}
