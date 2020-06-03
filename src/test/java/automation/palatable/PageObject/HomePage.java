package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage 
{
	IOSDriver driver;
	public HomePage(IOSDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="filter") public static IOSElement filter;
	@FindBy(name="Restaurants") public static IOSElement restaurants_button;
	@FindBy(name="Dish") public static IOSElement dish_tab;
	@FindBy(name="Deals") public static IOSElement deals_tab;
	@FindBy(name="Trays") public static IOSElement trays_tab;
	
	

}
