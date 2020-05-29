package automation.palatable.TestCases;

import org.testng.annotations.Test;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.aspectj.asm.IProgramElement.Accessibility;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Keyboard;
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
import net.bytebuddy.asm.Advice.Return;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_Sample001 extends BaseClass
{
	
	@Test(groups= {"funcationalTest","Smoketest"})
	public void sampleTest() throws InterruptedException
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WelcomeScreen wc= new WelcomeScreen(driver);
		LoginScreen ls= new LoginScreen(driver);
		new GenericButtons(driver);
		Thread.sleep(3000);
		WelcomeScreen.have_account.click();
		LoginScreen.googlePlusLoginButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		GenericButtons.cancel_button.click();
		
		
		
		
	}


}
