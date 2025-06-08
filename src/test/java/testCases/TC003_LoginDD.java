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
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.RegisterAccountPage;
import utilities.DataProviders;

public class TC003_LoginDD extends BaseTest {

	@Test(dataProvider =  "LoginData", dataProviderClass = DataProviders.class, groups = "dataDriven")
	public void test_AccountRegistration(String uname, String passworrd) throws InterruptedException {
			HomePage hp = new HomePage(driver);
			hp.clickmyAccount();
			hp.clicklogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(uname);
			lp.setPsswd(passworrd);
			lp.llogin();

			MyAccountPage map = new MyAccountPage(driver);
			boolean value = map.displayMessage();
			
			if (value == true) {
				map.clicklogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}

	}
}
