package automation.palatable.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.palatable.utilites.Navigator;
import automation.palatable.utilites.ScreenType;

public class TestCase_Sample001 extends BaseClass {

	@BeforeClass
	public void beforeTest() throws InterruptedException {
		new Navigator(driver).navigate(ScreenType.SIGN_UP_SCREEN );
	}
	
	@Test
	public void verifyButtonExistance() throws InterruptedException, IOException {	
		boolean exists = driver.getPageSource().contains("Verify");
		Assert.assertTrue(exists, "Verify button does not exists");
	}
	
	@Test
	public void forgotPasswordButtonExistance() throws InterruptedException, IOException {
		boolean exists = driver.getPageSource().contains("Login");
		Assert.assertTrue(exists, "Login button does not exists");
	}
	
	@Test
	public void sendButtonExistance() throws InterruptedException, IOException {
		boolean exists = driver.getPageSource().contains("Send");
		Assert.assertTrue(exists, "Send button does not exists");
	}
}
