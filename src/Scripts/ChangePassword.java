package Scripts;

import org.testng.annotations.Test;

import POM.AccountPage;
import POM.CraftsvillePage;
import POM.HomePage;
import generic.Base_Test;
import generic.Excel;

public class ChangePassword extends Base_Test{
	@Test
	public void testChangePasswor()
	{
		String email=Excel.getCellvalue(PATH,"ChangePassword",1,0);
		String pass=Excel.getCellvalue(PATH,"ChangePassword",1,1);
		String hp_title=Excel.getCellvalue(PATH,"ChangePassword",1,3);
		String acp_title=Excel.getCellvalue(PATH,"ChangePassword",1,4);
		String old_pass=Excel.getCellvalue(PATH,"ChangePassword",1,5);
		String new_passe=Excel.getCellvalue(PATH,"ChangePassword",1,6);
		String con_pass=Excel.getCellvalue(PATH,"ChangePassword",1,7);
	
		 CraftsvillePage cp=new CraftsvillePage(driver);
		    try{
		        
		    cp.clicksignin();
		    Thread.sleep(2000);
		    }
		    catch(Exception e)
		    {
		    	
		    }
		    try{
		       
		    cp.enteremail(email);
		    Thread.sleep(2000);
		    }
		    catch(Exception e)
		    {
		    	
		    }
		    try{
		    	
		    cp.clickctn();
			Thread.sleep(2000);
		    }
		    catch(Exception e)
		    {
		    	
		    }
		    cp.enterpass(pass);
		    try{
		    cp.clicklogin();
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
			hp.accountclick();
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			AccountPage ap=new AccountPage(driver);
			try{
			ap.chgpassclick();
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			try{
			ap.enteroldpass(old_pass);
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			try{
			ap.enternewpass(new_passe);
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			try{
			ap.enterpassagain(con_pass);
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
			ap.VerifyTitle(acp_title);
	}
}

