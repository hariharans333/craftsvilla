package Scripts;

import org.testng.annotations.Test;

import POM.CraftsvillePage;
import generic.Base_Test;
import generic.Excel;

public class InvalidLogin extends Base_Test{ 
	@Test
	public void testInvalidLogin()
	{
		
		String un=Excel.getCellvalue(PATH,"invalidlogin",1,0);
	    CraftsvillePage cp=new CraftsvillePage(driver);
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
	      cp.errmsg();
	    Thread.sleep(2000);
	    }catch(Exception e)
	    	    {
	    	    	
	    	    }
	}
	}

