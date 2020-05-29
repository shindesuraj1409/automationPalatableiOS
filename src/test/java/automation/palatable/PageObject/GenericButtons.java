package automation.palatable.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GenericButtons 
{
	IOSDriver driver;
	public GenericButtons(IOSDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//******Elements*********
	@FindBy(name="backGreen") IOSElement back_button;
	@FindBy(name="Skip") IOSElement skip_button;
	@FindBy(name="Next") IOSElement next_button;
	
	
	//*****ActionMethods*********
	
	public void click_back_button() 
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		back_button.click();
		
	}
	
	public void click_skip_button() 
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		skip_button.click();
	}
	
	public void click_next_button()
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		next_button.click();
	}
	

}
