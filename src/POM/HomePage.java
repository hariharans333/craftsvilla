package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class HomePage extends Base_Page {		
	@FindBy(xpath="//a[@href='/customer/account/']")
	private WebElement accstg;
	@FindBy(xpath="//span[@class='hidden-xs user-name']")
	private WebElement myacct;
	@FindBy(xpath="//a[@href='/customer/address/']")
	private WebElement add;
	@FindBy(xpath="//a[@href='/customer/account/logout']")
	private WebElement logout;
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void verifyTitle(String etitle)
	{
		VerifyTitle(etitle);
	}
	public void mousehover()
	{
	Actions action=new Actions(driver);
	action.moveToElement(myacct).perform();
	}	
	public void addclick()
	{
		add.click();
	}
	public void accountclick()
	{
		accstg.click();
	}
	public void logoutclick()
	{
	logout.click();
	}}

