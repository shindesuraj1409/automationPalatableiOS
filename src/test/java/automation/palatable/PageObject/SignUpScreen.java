package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpScreen 
{
	IOSDriver driver;
	public SignUpScreen(IOSDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(name="email") public static IOSElement email_field;
	@FindBy(name="password") public static IOSElement password_field;
	//@FindBy(xpath="") Same name i.e email for Full name and mobile number
	@FindBy(name="Verify") public static IOSElement verify_button;
	@FindBy(name="Login") public static IOSElement login_button;
	@FindBy(name="facebookButton") public static IOSElement facebookButton;
	@FindBy(name="googlePlusLoginButton") public static IOSElement googlePlusLoginButton;
	@FindBy(name="SIGNUP") public static IOSElement signUp_button;

}
