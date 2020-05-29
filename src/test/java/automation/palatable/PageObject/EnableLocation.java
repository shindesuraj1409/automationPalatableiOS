package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class EnableLocation 
{
	IOSDriver driver;
	public EnableLocation(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="Enable Location") public static IOSElement Enable_Location_title;
	@FindBy(name="ALLOW LOCATION") public static IOSElement allow_location;
	@FindBy(name="NOT NOW") public static IOSElement not_now;
	
	//Allow pending
	@FindBy(name="Use Current Location") public static IOSElement use_current_location;
	@FindBy(name="Home") public static IOSElement Home;
	@FindBy(name="Work") public static IOSElement Work;
	@FindBy(name="Other") public static IOSElement Other;
	@FindBy(name="SAVE AND PROCEED") public static IOSElement SAVE_AND_PROCEED;
	
	

}
