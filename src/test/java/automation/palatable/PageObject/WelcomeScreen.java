package automation.palatable.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomeScreen 
{
	IOSDriver driver;
	public WelcomeScreen(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//************variables**************//
	@FindBy(name="GET STARTED") public static IOSElement get_Started;
	
	@FindBy(name="I HAVE AN ACCOUNT")  public static IOSElement have_account;
	
	
	//***************Action Methods************//
	
	public static void get_started_clicked()
	{
		
		get_Started.click();
	}
	
	public static void click_have_account()
	{
		
		have_account.click();
	}
	

}
