package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-password']") WebElement setPassword;
	
	@FindBy(xpath = "//input[@value='Login']") WebElement login;

	public void setEmail(String email) throws InterruptedException {
		txtEmail.sendKeys(email);;
		Thread.sleep(2000);
	}

	
	public void setPsswd(String psswd) throws InterruptedException {
		setPassword.sendKeys(psswd);
		Thread.sleep(2000);
	}
	
	public void llogin() throws InterruptedException {
		login.click();
		Thread.sleep(2000);
	}
	
	

}
