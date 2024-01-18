package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ContactInfoSteps extends BaseClass {

	public static ContactPage contact;
@Given("User is on contact information page")
public void user_is_on_contact_information_page() {
    BaseClass.initialization();
    contact = new ContactPage();
}

@When("User enter {string}, {string},{string},{string}")
public void user_enter(String FirstName, String LastName, String Phone, String Email) {
    contact.contactPageFunctionality(FirstName, LastName, Phone, Email);
}
}
