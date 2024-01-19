package StepDefination;

import java.util.List;

import BaseLayer.BaseClass;
import PageLayer.MailingInfo1;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;


public class MailingInfo extends BaseClass {

	public static MailingInfo1 mailinfo;
	
	@When("user enter address,city,state,pcode and country")
	public void user_enter_address_city_state_pcode_and_country(DataTable dataTable) {
		
		
		 mailinfo = new MailingInfo1();
		 
		List<List<String>> ls =  dataTable.cells();
		String add= ls.get(0).get(0);
		String city= ls.get(0).get(1);
		String state= ls.get(0).get(2);
		String pc= ls.get(0).get(3);
		String country= ls.get(0).get(4);
		
		 mailinfo.mailingInfoFunctionality(add, city, state, pc, country);
		
	

	}

}
