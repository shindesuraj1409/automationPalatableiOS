package automation.palatable.utilites;

import automation.palatable.PageObject.LoginScreen;
import automation.palatable.PageObject.SignUpScreen;
import automation.palatable.PageObject.WelcomeScreen;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Navigator {
	IOSDriver<IOSElement> driver;
	public Navigator(IOSDriver<IOSElement> driver) 
	{
		this.driver=driver;
	}
	public void navigate(ScreenType type) throws InterruptedException {
		switch (type) {
		case WELCOME_SCREEN:
			toWelcomeScreen(driver);
			break;

		case LOGIN_SCREEN:
			toLoginScreen(driver);
			break;
			
		case SIGN_UP_SCREEN:
			toSignUpScreen(driver);
			break;
		
		default:
			break;
		}
	}
	
	private void toWelcomeScreen(IOSDriver<IOSElement> driver) {
		new WelcomeScreen(driver);
	}
	
	private void toLoginScreen(IOSDriver<IOSElement> driver) {
		new WelcomeScreen(driver);
		new LoginScreen(driver);
	}
	
	private void toSignUpScreen(IOSDriver<IOSElement> driver) throws InterruptedException {
		new WelcomeScreen(driver);
		new LoginScreen(driver);
		new SignUpScreen(driver);
		
		Thread.sleep(3000);
		WelcomeScreen.have_account.click();
//		log.info("I have a account clicked");
		LoginScreen.SignUpButton.click();
	}
}
