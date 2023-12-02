package testcases;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethod;
import Pages.LoginPage;

public class LoginTC_001 extends ProjectSpecificMethod {


@Test
public void runLogin() {
	/*LoginPage lp = new LoginPage();
	lp.enterUsername();
	lp.enterPassword();
	lp.clickLoginButton();
	WelcomePage wp = new WelcomePage();
	wp.clickCrmsfaLink(); */
	System.out.println("Login : " + driver);
	LoginPage lp = new LoginPage();
	String name = new String("Testleaf");
	lp.enterUsername()
	.enterPassword()
	.clickLoginButton()
	.verifyLoginPage()
	.clickCrmsfaLink();
	
}

}