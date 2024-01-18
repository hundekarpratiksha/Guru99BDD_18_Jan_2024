package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class MailingInfo1 extends BaseClass {

	@FindBy(name = "address1")
	private WebElement Addrss;

	@FindBy(name = "city")
	private WebElement City;

	@FindBy(name = "state")
	private WebElement State;

	@FindBy(name = "postalCode")
	private WebElement PostalCde;

	@FindBy(name = "country")
	private WebElement Country;

	public MailingInfo1() {
		PageFactory.initElements(driver, this);

	}

	public void mailingInfoFunctionality(String address1, String city1, String State1, String pcode, String country) {

		
		Wait.SendKeys(Addrss, address1);
		
		Wait.SendKeys(City, city1);
		Wait.SendKeys(State, State1);
		Wait.SendKeys(PostalCde, pcode);
		Wait.SendKeys(Country, country);
		
		
	}

}
