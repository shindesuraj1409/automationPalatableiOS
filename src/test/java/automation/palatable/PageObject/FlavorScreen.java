package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class FlavorScreen extends PomObject 
{

	public FlavorScreen(IOSDriver<IOSElement> driver) {
		super(driver);
	}

	//	IOSDriver<> driver;
	//	public FlavorScreen(IOSDriver driver)
	//	{
	//		super(driver);
	//		this.driver=driver;
	//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//	}

	@FindBy(name="Flavors picked in your favor") public static IOSElement flavescreen_title;


}
