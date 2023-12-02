package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyLeadsPage extends ProjectSpecificMethod {

@When ("Click on the Create Lead")
public CreateLeadPage clickCreateLead() {
	
	
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage();		
}
}
