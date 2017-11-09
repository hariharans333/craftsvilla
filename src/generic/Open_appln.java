package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_appln {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers.geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.craftsvilla.com/");
	}

}
