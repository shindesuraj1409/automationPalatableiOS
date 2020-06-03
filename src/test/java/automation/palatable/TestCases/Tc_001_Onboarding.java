package automation.palatable.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import automation.palatable.PageObject.FlavorScreen;
import automation.palatable.PageObject.GenericButtons;
import automation.palatable.PageObject.SimplySwipeScreen;
import automation.palatable.PageObject.WelcomeScreen;

public class Tc_001_Onboarding extends BaseClass
{
	public String screen_value;
	@Test(enabled=false)
	public void onBoarding_all_Screens()
	{
		new WelcomeScreen(driver);
		new FlavorScreen(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Test Case Exectution started");
		WelcomeScreen.get_Started.click();
		log.info("Get Started Clicked");
		screen_value=FlavorScreen.flavescreen_title.getAttribute("value");
		if(screen_value.equals("Flavors picked in your favor"))
		{
			log.info("On Flaveors screen");
			GenericButtons.next_button.click();
			screen_value=SimplySwipeScreen.page_title.getAttribute("value");
			if(screen_value.equals("Simply Swipe"));
			{
				
			}
		}
		else
		{
			log.info("Incorrect screen");
			Assert.assertTrue(false);
		}
		
	}

}
