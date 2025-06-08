package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseTest {

	@Test(groups = {"sanity", "master"})
	public void test_verifyLogin() throws InterruptedException{
		try {
			HomePage hp = new HomePage(driver);
			hp.clickmyAccount();
			hp.clicklogin();

			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPsswd(p.getProperty("psswd"));
			lp.llogin();
			
			
			MyAccountPage map = new MyAccountPage(driver);
			boolean value = map.displayMessage();
			
			Assert.assertEquals(value, true, "Login Failed...");

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail();
		}
	}

}
