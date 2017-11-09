package Scripts;

import org.testng.annotations.Test;

import POM.CartPage;
import POM.CraftsvillePage;
import POM.HomePage;
import generic.Base_Test;
import generic.Excel;

public class CheckCart extends Base_Test {
	@Test
	public void testCheckCart()
	{
		String un=Excel.getCellvalue(PATH,"checkcart",1,0);
	    String pwd=Excel.getCellvalue(PATH,"checkcart",1,1);
	    String cf_title=Excel.getCellvalue(PATH,"checkcart",1,2);
	    String hp_title=Excel.getCellvalue(PATH,"checkcart",1,3);
	    String cp_title=Excel.getCellvalue(PATH,"checkcart",1,4);

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
	    	
	CartPage cpa=new CartPage(driver);
	
	cpa.click1();
	
	cpa.cntshpclick();
	
     
	     
	}

	
	
	
	
	
	}
