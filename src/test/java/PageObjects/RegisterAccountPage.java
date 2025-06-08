package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterAccountPage extends BasePage {

	public RegisterAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement fname;
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lname;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement telephone;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement psswd;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement confirmpsswd;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement prPolicy;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement ccontinue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;

	public void setfname(String name) throws InterruptedException {
		fname.sendKeys(name);
		Thread.sleep(2000);
	}

	public void setlname(String llname) throws InterruptedException {
		lname.sendKeys(llname);
		Thread.sleep(2000);
	}

	public void setemail(String email) throws InterruptedException {
		this.email.sendKeys(email);
		Thread.sleep(2000);
	}

	public void settelephone(String telephone) throws InterruptedException {
		this.telephone.sendKeys(telephone);
		Thread.sleep(2000);
	}

	public void setpsswd(String psswd) throws InterruptedException {
		this.psswd.sendKeys(psswd);
		Thread.sleep(2000);
	}

	public void setconfirmpsswd(String confirmpsswd) throws InterruptedException {
		this.confirmpsswd.sendKeys(confirmpsswd);
		Thread.sleep(2000);
	}

	public void checkPolicy() throws InterruptedException {
		prPolicy.click();
		;
		Thread.sleep(2000);

	}

	public void checkContinue() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Declaration of Explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(ccontinue)).click(); // Implementation

	}

	public String getmsgconfirmation() {
		try {
			return msgconfirmation.getText();
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
