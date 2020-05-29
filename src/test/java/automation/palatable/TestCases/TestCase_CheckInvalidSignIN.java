package automation.palatable.TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import automation.palatable.PageObject.LoginScreen;
import automation.palatable.PageObject.WelcomeScreen;

public class TestCase_CheckInvalidSignIN extends BaseClass
{
	@Test(groups = {"funcationalTest"})
	public void LogInTest() throws InterruptedException
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		Thread.sleep(3000);
		System.out.println("Testing Started");
		WelcomeScreen wc= new WelcomeScreen(driver);
		LoginScreen ls= new LoginScreen(driver);
		WelcomeScreen.click_have_account();
		LoginScreen.enterEmail("xyz@gmail.com");
		LoginScreen.enterPassword("Password@1");
		LoginScreen.loginScreenTitle.click();
		//driver.getKeyboard().pressKey(Keys.RETURN);;
		LoginScreen.click_SignIn();
		wait.until(ExpectedConditions.alertIsPresent());
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		System.out.println("Testing Ended");

	}
}