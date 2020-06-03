package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LikeDisLike 
{
	IOSDriver driver;
	public LikeDisLike(IOSDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="mySwipeSubtab") public static IOSElement swipes;
	@FindBy(name="ordersSubtab") public static IOSElement orders;
	@FindBy(name="dietProfileSubtab") public static IOSElement preferences;
	@FindBy(name="favouriteSubtab") public static IOSElement favourites;
	

}
