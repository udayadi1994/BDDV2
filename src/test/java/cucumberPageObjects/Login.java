package cucumberPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@name='username']")
	WebElement username;

	@FindBy(xpath="//input[@name='password']")
	WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	WebElement login;

	public void setUserName()
	{
		username.sendKeys("Admin");

	}

	public void setpassword()
	{
		password.sendKeys("admin123");

	}

	public void clicksubmit()
	{
		login.click();
	}


}
