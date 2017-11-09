package Scripts;

import org.testng.annotations.Test;

import POM.AddressPage;
import POM.CraftsvillePage;
import POM.HomePage;
import generic.Base_Test;
import generic.Excel;

public class VerifyAddress extends Base_Test{
	@Test
	public void testverifyaddress() throws InterruptedException
	{
		String email=Excel.getCellvalue(PATH,"verifyaddress",1,0);
		String pass=Excel.getCellvalue(PATH,"verifyaddress",1,1);
		String hp_title=Excel.getCellvalue(PATH,"verifyaddress",1,3);
		String ad_title=Excel.getCellvalue(PATH,"verifyaddress",1,4);
		String first=Excel.getCellvalue(PATH,"verifyaddress",1,5);
		String last=Excel.getCellvalue(PATH,"verifyaddress",1,6);
		String comp=Excel.getCellvalue(PATH,"verifyaddress",1,7);
		String tele=Excel.getCellvalue(PATH,"verifyaddress",1,8);
		String fax=Excel.getCellvalue(PATH,"verifyaddress",1,9);
		String add1=Excel.getCellvalue(PATH,"verifyaddress",1,10);
		String add2=Excel.getCellvalue(PATH,"verifyaddress",1,11);
		String city=Excel.getCellvalue(PATH,"verifyaddress",1,12);
		String zip=Excel.getCellvalue(PATH,"verifyaddress",1,13);

	CraftsvillePage cf=new CraftsvillePage(driver);
	cf.maximizewindow();
	try{
	cf.clicksignin();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	cf.enteremail(email);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	cf.clickctn();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	cf.enterpass(pass);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	cf.clicklogin();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	HomePage hp=new HomePage(driver);
	
	hp.verifyTitle(hp_title);
	try{
	hp.mousehover();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	hp.addclick();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	AddressPage ap=new AddressPage(driver);
	try{
	ap.verifyaddpage(ad_title);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	ap.enterfirstname(first);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	try{
	ap.enterlastname(last);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	try{
	ap.entercompany(comp);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	try{
	ap.entertelephone(tele);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	try{
	ap.enterfax(fax);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	try{
	ap.enteradd1(add1);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	try{
	ap.enteradd2(add2);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	ap.entercity(city);
	Thread.sleep(2000);	
	}
	catch(Exception e)
	{
		
	}
	try{
	ap.enterzip(zip);
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	try{
	ap.listbox();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
	
	try{
	ap.clicksave();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
			
	}	
	}


