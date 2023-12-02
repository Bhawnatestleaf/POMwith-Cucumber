package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import Base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethod {


@When ("Click on the Leads tab")
public MyLeadsPage clickLeadsTab() {
	driver.findElement(By.linkText("Leads")).click();
	return new MyLeadsPage();
}

}
