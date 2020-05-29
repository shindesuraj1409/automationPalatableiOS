package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PushNotificationScreen 
{
	IOSDriver driver;
	public PushNotificationScreen(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="Push Notification ") public static IOSElement push_notification_title;
	@FindBy(name="ENABLE NOTIFICATION") public static IOSElement enable_pushnotification;
	@FindBy(name="NOT NOW") public static IOSElement not_now;
	

}
