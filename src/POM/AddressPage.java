package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.Base_Page;

public class AddressPage extends Base_Page {

	@FindBy(xpath="//input[@title='First Name']")
	private WebElement fstnm;
	@FindBy(xpath="//input[@title='Last Name']")
	private WebElement lstnm;
	@FindBy(xpath="//input[@id='company']")
	private WebElement com;
	@FindBy(xpath="//input[@class='form-control' and @id='telephone']")
	private WebElement tele;
	@FindBy(xpath="//input[@id='fax']")
	private WebElement fax;
	@FindBy(xpath="//input[@id='street_1']")
	private WebElement add1;
	@FindBy(xpath="//input[@id='street_2']")
	private WebElement add2;
	@FindBy(xpath="//input[@id='city']")
	private WebElement city;
    @FindBy(xpath="//button[text()='Save Address']")
    private WebElement addbtn;
    @FindBy(xpath="//select[@class='form-control']")
    private WebElement lstbox;
    @FindBy(xpath="//input[@id='zip']")
    private WebElement zip; 
public AddressPage(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
}
public void verifyaddpage(String etitle)
{
	VerifyTitle(etitle);
}
public void enterfirstname(String fst)
{
	fstnm.sendKeys(fst);
}
public void enterlastname(String lst)
{
	lstnm.sendKeys(lst);
	}
public void entercompany(String comp)
{
	com.sendKeys(comp);
}
public void enterfax(String fx)
{
	fax.sendKeys(fx);
}
public void entertelephone(String tel)
{
		tele.sendKeys(tel);		
}
public void enteradd1(String ad1)
{
	add1.sendKeys(ad1);
}
public void enteradd2(String ad2)
{
	add2.sendKeys(ad2);
}
public void entercity(String cty)
{
	city.sendKeys(cty);
}

public void enterzip(String zp)
{
	zip.sendKeys(zp);

}
public void listbox()
{
	Select select1=new Select(lstbox);
	select1.selectByIndex(0);
	
}

public void clicksave()
{
	addbtn.click();
}
}