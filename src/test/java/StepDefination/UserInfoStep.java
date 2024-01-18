package StepDefination;

import java.util.List;
import java.util.Map;

import BaseLayer.BaseClass;
import PageLayer.UserInfoPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class UserInfoStep extends BaseClass{
	

@When("user enter valid Username, Password, ConfirmPassword")
public void user_enter_valid_username_password_confirm_password(DataTable dataTable) {
	List<Map<String,String>> ls = dataTable.asMaps();
	String un = ls.get(0).get("Username");
	String Pass = ls.get(0).get("Password");
	String cPass = ls.get(0).get("ConfirmPassword");
	
	UserInfoPage userInfoPage = new UserInfoPage();
	userInfoPage.userInfoFunctionality(un, Pass, cPass);
}


}
