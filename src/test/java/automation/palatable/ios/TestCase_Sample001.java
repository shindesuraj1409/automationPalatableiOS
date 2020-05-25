package automation.palatable.ios;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase_Sample001 
{
	@BeforeSuite
	public void setUp()
	{
		System.out.println("In Setup");
	}
	
	
	@AfterSuite
	public void tearDown()
	{
		System.out.println("In tearDown");
		
		
	}
	
	@Test
	public void sampleTest()
	{
		System.out.println("Nothing to Test");
	}
	

}
