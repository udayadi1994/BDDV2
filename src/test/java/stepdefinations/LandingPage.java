package stepdefinations;

import org.openqa.selenium.WebDriver;

import cucumberAutomation.Base;
import cucumberPageObjects.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPage {

	public WebDriver driver;
	Login l;
	Base base=new Base();


	@Given("user is in landing page")
	public void user_is_in_landing_page() throws Exception {

		System.out.println("user landing on home page");
		//base=new Base();
		base.getDriver();
		Thread.sleep(2000);
	}

	@When("user enters valid username")
	public void user_enters_valid_username() {
		l=new Login(driver);
		l.setUserName();
		System.out.println("enter the username");


	}

	@When("user enters vaid  password")
	public void user_enters_vaid_password() {
	    System.out.println("enter the password");
		l=new Login(driver);
		l.setpassword();
	}

	@When("clicks on Sign-in button")
	public void clicks_on_sign_in_button() {

		System.out.println("click on login button");
		l=new Login(driver);
		l.clicksubmit();

	}




}
