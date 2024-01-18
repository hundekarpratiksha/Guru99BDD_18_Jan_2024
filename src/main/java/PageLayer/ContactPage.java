package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class ContactPage  extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement fName;
	

	@FindBy(name="lastName")
	private WebElement lName;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(name="userName")
	private WebElement email;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void contactPageFunctionality(String FirstName, String LastName, String Phone, String Email)
	{
		Wait.SendKeys(fName, FirstName);
		Wait.SendKeys(lName, LastName);
		Wait.SendKeys(phone, Phone);
		Wait.SendKeys(email, Email);
		
		
	}
	
	
}
