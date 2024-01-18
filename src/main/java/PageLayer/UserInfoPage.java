package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class UserInfoPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="confirmPassword")
	private WebElement cpass;
	
	public UserInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void userInfoFunctionality(String Username,String Password,String ConfirmPassword)
	{
		Wait.SendKeys(uname, Username);
		Wait.SendKeys(pass, Password);
		Wait.SendKeys(cpass, ConfirmPassword);
	}

}
