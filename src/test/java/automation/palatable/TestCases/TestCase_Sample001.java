package automation.palatable.TestCases;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.aspectj.asm.IProgramElement.Accessibility;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import automation.palatable.PageObject.GenericButtons;
import automation.palatable.PageObject.LoginScreen;
import automation.palatable.PageObject.WelcomeScreen;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_Sample001 extends BaseClass
{
	
	@Test
	public void sampleTest() throws InterruptedException
	{
		Thread.sleep(3000);
		WelcomeScreen wc= new WelcomeScreen(driver);
		LoginScreen ls= new LoginScreen(driver);
		WelcomeScreen.click_have_account();
		LoginScreen.enterEmail("xyz@gmail.com");
		LoginScreen.enterPassword("Password@1");
		LoginScreen.click_SignIn();
	}


}
