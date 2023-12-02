package testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Pages.LoginPage;

public class CreateLeadTC_003 extends ProjectSpecificMethod{


@Test
public void runCreateLead () {
	
	new LoginPage()
	.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickCrmsfaLink()
	.clickLeadsTab()
	.clickCreateLead()
	.enterCompanyName()
	.enterFirstName()
	.enterLastName()
	.enterPhno()
	.clickSubmitButton();
}

}