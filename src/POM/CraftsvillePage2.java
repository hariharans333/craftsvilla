package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class CraftsvillePage2 extends Base_Page {
	
	@FindBy(xpath="//span[@class='hidden-xs user-name']")
	private WebElement sgnin;
	@FindBy(xpath="//input[@id='emailId']")
	private WebElement emailid;
	@FindBy(xpath="//div[@id='continueBtn']")
	private WebElement ctnbtn;
	@FindBy(xpath="//input[@id='userPassword']")
	private WebElement pwd;
	@FindBy(xpath="//div[text()='Login']")
	private WebElement lgnbtn;
	@FindBy(xpath="//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement accessries;
	@FindBy(xpath="//a[@href='/accessories/watches/?MID=megamenu_accessories_accessories_watches']")
	private WebElement watch;
	@FindBy(xpath="/span[text()='Below 500']")
	private WebElement price;
	@FindBy(xpath="//a[@href='/watches/men-watches/']")
	private WebElement men;
	public CraftsvillePage2(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void maximizewindow(){
		
		driver.manage().window().maximize();
	}
	public void clicksignin()
	{
		sgnin.click();
	}
	public void enteremail(String em1)
	{
		emailid.sendKeys(em1);
	}
	public void clickctn()
	{
		ctnbtn.click();
	}
	public void enterpass(String pd)
	{
		pwd.sendKeys(pd);
	}
	public void clicklogin()
	{
		lgnbtn.click();
	}
	public void mousehover()
	{
	Actions action=new Actions(driver);
	action.moveToElement(accessries).perform();
	}	
	public void click()
	{
		watch.click();
	}
	public void click1()
	{
		price.click();
	}
	public void click2()
	{
		men.click();
	}
	}
