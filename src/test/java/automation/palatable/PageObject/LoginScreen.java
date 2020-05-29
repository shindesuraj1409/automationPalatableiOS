package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen 
{
	IOSDriver driver;
	public LoginScreen(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="Login") public static IOSElement loginScreenTitle;
	@FindBy(name="emailID") public static IOSElement emailID_field;
	@FindBy(name="password") public static IOSElement password_field;
	@FindBy(name="Forgot Password?") public static IOSElement forgotPassowrd;
	@FindBy(name="facebookButton") public static IOSElement facebookButton;
	@FindBy(name="googlePlusLoginButton") public static IOSElement googlePlusLoginButton;
	@FindBy(name="Sign Up") public static IOSElement SignUpButton;
	@FindBy(name="SIGN IN") public static IOSElement SignInButton;
	
	
	//Action methods;
	public static void enterEmail(String email)
	{
		emailID_field.clear();
		emailID_field.sendKeys(email);
	}
	
	public static void enterPassword(String password)
	{
		password_field.clear();
		password_field.sendKeys(password);
	}
	
	public static void click_SignIn()
	{
		SignInButton.click();
	}
}
