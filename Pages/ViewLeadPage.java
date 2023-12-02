package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethod {

	@Given ("Get the lead id")
	public void retriveLeadId() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
	}
	
	@Then ("Verify Create Lead is successfull")
	public void verifyCreateLead() {
		System.out.println(driver.getTitle());
	}
	
}

