package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DietsScreen 
{
	IOSDriver driver;
	public DietsScreen(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="Diets") public static IOSElement Diets_title;
	@FindBy(name="Halal Meat") public static IOSElement Halal_Meat;
	@FindBy(name="Ketogenic") public static IOSElement Ketogenic;
	@FindBy(name="Kosher") public static IOSElement Kosher;
	@FindBy(name="Lacto Vegetarian") public static IOSElement Lacto_Vegetarian;
	@FindBy(name="Ovo Lacto Vegetarian") public static IOSElement Ovo_Lacto_Vegetarian;
	@FindBy(name="Ovo Vegetarian") public static IOSElement Ovo_Vegetarian;
	@FindBy(name="Pescetarian") public static IOSElement Pescetarian;
	@FindBy(name="Vegan") public static IOSElement Vegan;
	@FindBy(name="Vegetarian") public static IOSElement Vegetarian;
	@FindBy(name="Vegetarian Customize") public static IOSElement Vegetarian_Customize;
	@FindBy(name="Paleo") public static IOSElement Paleo;
	@FindBy(name="Weight Watchers") public static IOSElement Weight_Watchers;
	

}
