package automation.palatable.TestCases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class BaseClass 

{
	AppiumDriverLocalService service;
	AppiumServiceBuilder builder;
	DesiredCapabilities cap;
	String folder_name;
    DateFormat df;
	public static Logger log;

	public static URL url;
	public static IOSDriver<IOSElement> driver;

	@BeforeSuite
	public void setUp() throws MalformedURLException
	{

		startAppiumServer();

	}

	@AfterSuite
	public void tearDown()
	{
		service.stop();
		//driver.quit();
		System.out.println("In tear down");
	}

	public void startAppiumServer()
	{
		try
		{
			getDevicelist();	
			log= Logger.getLogger("Palatable iOS");
			PropertyConfigurator.configure("log4j.properties");
			cap= new DesiredCapabilities();
			builder= new AppiumServiceBuilder();
			//builder.withIPAddress("127.0.0.1");
			//builder.usingAnyFreePort();
			//final String URL_STRING="http://localhost:4723/wd/hub";
			//url=new URL(URL_STRING);
			//Capabilites

			cap.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone 8");
			cap.setCapability(MobileCapabilityType.UDID, "bf58162011525c03a6008a910b2825b612d806c1");
			//cap.setCapability(MobileCapabilityType.UDID, "auto");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
			cap.setCapability("xcodeOrgId", "MQ7X5VPF23");
			cap.setCapability("xcodeSigningId", "iPhone Developer");
			//capabilities.setCapability(MobileCapabilityType, "13.3.1");
			//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.4.1");
			cap.setCapability(MobileCapabilityType.APP, "/Users/Admin/Downloads/Food-Live 2.ipa");
			cap.setCapability(MobileCapabilityType.NO_RESET, true);
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			cap.setCapability("updatedWDABundleId", "com.facebook123.WebDriverAgentLib");
			cap.setCapability("useNewWDA", false);
			//capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
			//capabilities.setCapability("xcodeConfigFile", "/usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/node_modules/appium-webdriveragent/Config.xcconfig");
			//driver = new IOSDriver<IOSElement>(url, cap);
			//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);



			builder.withCapabilities(cap);
			//builder.withArgument(GeneralServerFlag.SESSION_OVERRIDE);
			//builder.withArgument(GeneralServerFlag.LOG_LEVEL,"error");
			service= AppiumDriverLocalService.buildDefaultService();
			service.start();
			service.clearOutPutStreams();
			URL serviceURL=service.getUrl();
			System.out.println("URL:"+serviceURL);
			driver = new IOSDriver<IOSElement>(serviceURL,cap);
		}catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
	}

	public void getDevicelist() throws IOException
	{
		//System.out.println("udid:"+driver.getCapabilities().getCapability("udid"));

	}

	public void captureScreenShots() throws IOException 
	{
		folder_name="screenshot";
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Date format fot screenshot file name
		df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		//create dir with given folder name
		new File(folder_name).mkdir();
		//Setting file name
		String file_name=df.format(new Date())+".png";
		//coppy screenshot file into screenshot folder.
		FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
	}


}
