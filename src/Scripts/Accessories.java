package Scripts;

import org.testng.annotations.Test;

import POM.CraftsvillePage2;
import POM.HomePage;
import generic.Base_Test;
import generic.Excel;

public class Accessories extends Base_Test {
	@Test
	public void testAccessories()
	{

	String un=Excel.getCellvalue(PATH,"loginlogout",1,0);
    String pwd=Excel.getCellvalue(PATH,"loginlogout",1,1);
    String cf_title=Excel.getCellvalue(PATH,"loginlogout",1,2);
    String hp_title=Excel.getCellvalue(PATH,"loginlogout",1,3);
   
    CraftsvillePage2 cp=new CraftsvillePage2(driver);
    
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
	}
	HomePage hp=new HomePage(driver);
	public void verifytitle(String etitle)
	{
	VerifyTitle(etitle);
}
	
	
}


