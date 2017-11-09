package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class AccountPage extends Base_Page{
	@FindBy(xpath="//div[@id='change_pswd']")
	private WebElement chgpwd;
	@FindBy(xpath="//input[@id='current_password']")
	private WebElement curpwd;
	@FindBy(xpath="//input[@class='form-control  ma-tOp10' and @id='password']")
	private WebElement newpwd;
	@FindBy(xpath="//input[@class='form-control  ma-tOp10' and @id='confirmation']")
	private WebElement confpwd;
	@FindBy(xpath="//button[text()='SAVE']")
	private WebElement savebtn;
	public AccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void chgpassclick()
	{
		chgpwd.click();
	}
public void enteroldpass(String old)
{
	curpwd.sendKeys(old);
}
public void enternewpass(String newp)
{
	newpwd.sendKeys(newp);
}
public void enterpassagain(String conf)
{
	confpwd.sendKeys(conf);
}
public void clicksave()
{
	savebtn.click();
	}
}
