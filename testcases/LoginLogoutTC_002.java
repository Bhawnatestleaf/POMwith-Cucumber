package testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Pages.LoginPage;

public class LoginLogoutTC_002 extends ProjectSpecificMethod {


@Test
public void runLogout() {
	/*
	 * LoginPage lp = new LoginPage(); lp.enterUsername() .enterPassword()
	 */
	System.out.println("Logout :  " + driver);
	new LoginPage()
	.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.clickLogoutButton();
	
}

}