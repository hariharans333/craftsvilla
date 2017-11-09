package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class CartPage extends Base_Page{

	@FindBy(xpath="//span[text()='Cart ']")
	private WebElement cartlk;
	@FindBy(xpath="//button[text()='CONTINUE SHOPPING']")
	private WebElement cntshp;
	public CartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

public void click1()
{
	cartlk.click();
}
public void cntshpclick()
{
	cntshp.click();
}
public void verifycartpage(String etitle)
{
	VerifyTitle(etitle);
}










}
