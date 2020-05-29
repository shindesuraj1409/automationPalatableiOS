package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AllergiesScreen 
{
	IOSDriver driver;
	public AllergiesScreen(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="Allergies") public static IOSElement Allergies_title;
	@FindBy(name="Dairy") public static IOSElement Dairy;
	@FindBy(name="Egg") public static IOSElement Egg;
	@FindBy(name="Gluten") public static IOSElement Gluten;
	@FindBy(name="Lactose") public static IOSElement Lactose;
	@FindBy(name="Peanut") public static IOSElement Peanut;
	@FindBy(name="Poultry") public static IOSElement Poultry;
	@FindBy(name="Seafood") public static IOSElement Seafood;
	@FindBy(name="Sesame") public static IOSElement Sesame;
	@FindBy(name="Soy") public static IOSElement Soy;
	@FindBy(name="Tree Nut") public static IOSElement Tree_Nut;
	@FindBy(name="Sulfite") public static IOSElement Sulfite;

}
