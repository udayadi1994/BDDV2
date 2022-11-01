package cucumberAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	

	

	public  WebDriver getDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\kiru2\\eclipse-workspace\\uday1\\BDDV2\\src\\test\\java\\cucumberAutomation\\global.properties");

	prop.load(fis);

	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chrome1\\chromedriver.exe");


   	driver=new ChromeDriver();

  	driver.get(prop.getProperty("url"));
   	 return driver;

	}



}
