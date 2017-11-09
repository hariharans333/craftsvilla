package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class BigBasketPage extends Base_Page{
	@FindBy(xpath="//a[text()='Login' and @href='/auth/login/?nc=nb']")
	private WebElement login;
	@FindBy(xpath="//input[@name='username']")
	private WebElement e_mail;
	@FindBy(xpath="//input[@name='password' and @id='password']")
	private WebElement pass;
	@FindBy(xpath="//button[@value='LOG IN' and@type='submit']")
	private WebElement loginbtn;
	@FindBy(xpath="//span[text()='hari']")
	private WebElement profile;
}
