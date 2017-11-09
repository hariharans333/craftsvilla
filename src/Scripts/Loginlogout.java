package Scripts;

import org.testng.annotations.Test;

import POM.CraftsvillePage;
import POM.HomePage;
import generic.Base_Test;
import generic.Excel;

public class Loginlogout extends Base_Test{
@Test
public void testloginlougout()
{
	String un=Excel.getCellvalue(PATH,"loginlogout",1,0);
    String pwd=Excel.getCellvalue(PATH,"loginlogout",1,1);
    String cf_title=Excel.getCellvalue(PATH,"loginlogout",1,2);
    String hp_title=Excel.getCellvalue(PATH,"loginlogout",1,3);
    
    CraftsvillePage cp=new CraftsvillePage(driver);
    cp.maximizewindow();
    try{
        
    cp.clicksignin();
    Thread.sleep(2000);
    }
    catch(Exception e)
    {
    	
    }
    try{
       
    cp.enteremail(un);
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
    try{
    cp.enterpass(pwd);
    Thread.sleep(2000);
    }
    catch(Exception e)
    {
    	
    }
    cp.clicklogin();
    
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
	hp.logoutclick();
	Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}

hp.verifyTitle(cf_title);
     
     
}
}
