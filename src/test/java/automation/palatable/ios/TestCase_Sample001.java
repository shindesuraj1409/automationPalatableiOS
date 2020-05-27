package automation.palatable.ios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
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
		System.out.println("Nothing to Test");
		Thread.sleep(3000);
		driver.findElement(By.name("GET STARTED")).click();
	}
	

}
