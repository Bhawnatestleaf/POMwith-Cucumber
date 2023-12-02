package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {


@Given ("Enter the username")
public LoginPage enterUsername() {
	System.out.println("LoginPage : " + driver);
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//	LoginPage lp  = new LoginPage();
//	return lp ;
	return this;
}

@Given ("Enter the password")
public LoginPage enterPassword() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
//	LoginPage lp  = new LoginPage();
//	return lp ;
//	return new LoginPage();
	return this;
}

@When ("Click on the Login button")
public WelcomePage clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
//	WelcomePage wp = new WelcomePage();
//	return wp;
	return new WelcomePage();
}

public LoginPage enterUsername1() {
	// TODO Auto-generated method stub
	return null;
}

}
