package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.Base_Page;

public class CraftsvillePage extends Base_Page {	
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
@FindBy(xpath="//div[@class='error-msg']")
private WebElement errmsg;
public CraftsvillePage(WebDriver driver) {
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
public void errmsg()
{
	String s=errmsg.getText();
	Reporter.log("error msg is"+s,true);
}
}
