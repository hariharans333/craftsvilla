package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_constant {
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.get("http://www.craftsvilla.com/");
	}
	@AfterMethod
	public void cloasappln()
	{
		driver.quit();
	}

}
