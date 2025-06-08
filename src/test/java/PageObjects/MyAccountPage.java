package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='content']//h2[1]")
	WebElement mssg;
	
	@FindBy(xpath = "//a[@class='list-group-item' and normalize-space()='Logout']")
	WebElement logout;
	

	public boolean displayMessage() {

		boolean isDisplayed = true;
		String actual = mssg.getText();
		if (actual.equals("My Account")) {
			Assert.assertTrue(true);
			return isDisplayed;
		} else {
			isDisplayed = false;
			return isDisplayed;
		}

	}
	
	public void clicklogout() throws InterruptedException {
		logout.click();
		Thread.sleep(2000);
	}

}
