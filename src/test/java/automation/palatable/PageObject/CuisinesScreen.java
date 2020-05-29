package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CuisinesScreen 
{
	IOSDriver driver;
	public CuisinesScreen(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(name="American") public static IOSElement American;
	@FindBy(name="Asian") public static IOSElement Asian;
	@FindBy(name="Chinese") public static IOSElement Chinese;
	@FindBy(name="Colombian") public static IOSElement Colombian;
	@FindBy(name="Costa Rican") public static IOSElement Costa_Rican;
	@FindBy(name="French") public static IOSElement French;
	@FindBy(name="Indian") public static IOSElement Indian;
	@FindBy(name="Indian Fusion") public static IOSElement Indian_Fusion;
	@FindBy(name="Irish") public static IOSElement Irish;
	@FindBy(name="Malaysian") public static IOSElement Malaysian;
	@FindBy(name="Mediterranean") public static IOSElement Mediterranean;
	@FindBy(name="Mexican") public static IOSElement Mexican;
	@FindBy(name="Pakistani") public static IOSElement Pakistani;
	@FindBy(name="Spanish") public static IOSElement Spanish;
	@FindBy(name="Thai") public static IOSElement Thai;
	@FindBy(name="Venezuelan") public static IOSElement Venezuelan;
	@FindBy(name="Italian") public static IOSElement Italian;
	@FindBy(name="Japanese") public static IOSElement Japanese;
	@FindBy(name="Greek") public static IOSElement Greek;
	@FindBy(name="Cuisines") public static IOSElement Cuisines_title;
	@FindBy(name="Select All") public static IOSElement Select_All;
	@FindBy(name="Continue") public static IOSElement Continue;
	
	
	
	

}
