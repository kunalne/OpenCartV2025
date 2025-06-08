package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.RegisterAccountPage;

public class TC001_AccountRegistrationTest extends BaseTest {
	

	@Test(groups = {"regression", "master"})
	public void test_AccountRegistration() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickmyAccount();
		hp.clickregister();

		RegisterAccountPage rap = new RegisterAccountPage(driver);
		rap.setfname(randomString());
		rap.setlname(randomString());
		rap.setemail(randomString() + "@gmail.com");
		rap.settelephone(randomNumber());

		String randomPsswd = randomAlphaNumber();

		rap.setpsswd(randomPsswd);
		rap.setconfirmpsswd(randomPsswd);

		rap.checkPolicy();
		rap.checkContinue();
		String message = rap.getmsgconfirmation();
		Assert.assertEquals(message, "Your Account Has Been Created!");

	}

}
