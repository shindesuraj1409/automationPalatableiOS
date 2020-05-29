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
		WelcomeScreen ws= new WelcomeScreen(driver);
		GenericButtons gb= new GenericButtons(driver);
		System.out.println("Nothing to Test");
		Thread.sleep(3000);
		ws.get_started_clicked();
		//gb.click_back_button();
		//ws.get_started_clicked();
		//gb.click_skip_button();
		gb.click_next_button();
		gb.click_next_button();
		gb.click_next_button();
		gb.click_next_button();
		gb.click_next_button();
		
		/*driver.findElement(By.xpath("//*[@text='backGreen' and @class='UIAButton']")).click();
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='backGreen']")));
		driver.findElement(By.xpath("//*[@text='backGreen']")).click();
		driver.findElement(By.xpath("//*[@text='GET STARTED' and @class='UIAButton']")).click();
		driver.findElement(By.xpath("//*[@text='Skip' and @class='UIAButton']")).click();
		driver.findElement(By.xpath("//*[@text='backGreen']")).click();
		driver.findElement(By.xpath("//*[@text='backGreen']")).click();
		driver.findElement(By.xpath("//*[@text='I HAVE AN ACCOUNT' and @class='UIAButton']")).click();
		driver.findElement(By.xpath("//*[@text='backGreen']")).click();*/
	}


}
