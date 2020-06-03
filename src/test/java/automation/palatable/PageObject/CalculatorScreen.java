package automation.palatable.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculatorScreen 
{
	AndroidDriver driver;
	public CalculatorScreen(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_0;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_1;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_2;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_3;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_4;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_5;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_6;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_7;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_8;
	@FindBy(id="com.oneplus.calculator:id/digit_7") public static AndroidElement digit_9;
	@FindBy(id="com.oneplus.calculator:id/op_div") public static AndroidElement divide;
	@FindBy(id="com.oneplus.calculator:id/op_mul") public static AndroidElement multiply;
	@FindBy(id="com.oneplus.calculator:id/op_add") public static AndroidElement add;
	@FindBy(id="com.oneplus.calculator:id/op_sub") public static AndroidElement subtract;
	@FindBy(id="com.oneplus.calculator:id/eq") public static AndroidElement equal;
	@FindBy(id="com.oneplus.calculator:id/del") public static AndroidElement del;
	@FindBy(id="com.oneplus.calculator:id/dec_point") public static AndroidElement point;
	
	
	
	


}
