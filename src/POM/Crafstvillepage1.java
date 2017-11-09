package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Crafstvillepage1 extends Base_Page{
	@FindBy(xpath="//a[@href='/cvfeeds/craftsvilla-brands']")
	private WebElement cftbrd;
	@FindBy(xpath="//a[@href='/womens-clothing/kurtis-tunics/?MID=megamenu_casualwear_seeall']")
	private WebElement kurmo;
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement saree;
	@FindBy(xpath="//a[@href='/womens-clothing/salwar-suits/?MID=megamenu_salwarsuit_seeall']")
	private WebElement salsuit;
	@FindBy(xpath="//a[@href='/womens-clothing/lehangas/?MID=megamenu_lehengas_seeall']")
	private WebElement lehanga;
	@FindBy(xpath="//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement accessries;
	@FindBy(xpath="//a[@href='/mens-fashion/?MID=megamenu_menswear_seeall']")
	private WebElement mensfash;
	@FindBy(xpath="//a[@href='/home-decor/?MID=megamenu_homedecor_seeall']")
	private WebElement homdecor;
	@FindBy(xpath="//a[@href='/cvfeeds/foods']")
	private WebElement food;

	public Crafstvillepage1(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void mousehover1()
	{
	Actions action=new Actions(driver);
	action.moveToElement(cftbrd).perform();
	}	
	public void mousehover2()
	{
	Actions action=new Actions(driver);
	action.moveToElement(kurmo).perform();
	}	
	
	public void mousehover3()
	{
	Actions action=new Actions(driver);
	action.moveToElement(saree).perform();
	}	

	public void mousehover4()
	{
	Actions action=new Actions(driver);
	action.moveToElement(salsuit).perform();
	}	


	public void mousehover5()
	{
	Actions action=new Actions(driver);
	action.moveToElement(lehanga).perform();
	}	

	public void mousehover6()
	{
	Actions action=new Actions(driver);
	action.moveToElement(accessries).perform();
	}	

	public void mousehover7()
	{
	Actions action=new Actions(driver);
	action.moveToElement(mensfash).perform();
	}	
	public void mousehover8()
	{
	Actions action=new Actions(driver);
	action.moveToElement(homdecor).perform();
	}	

	public void mousehover9()
	{
	Actions action=new Actions(driver);
	action.moveToElement(food).perform();
	}	
}
