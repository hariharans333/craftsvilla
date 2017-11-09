package generic;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excel implements Auto_constant {
	public static String getCellvalue(String PATH,String sheet,int row,int cell){
	String V="";
try{
	FileInputStream fis=new FileInputStream(PATH);
	Workbook wb=WorkbookFactory.create(fis);
	V=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
}
catch(Exception e)
{
	Reporter.log("path is invalid",true);
}
return V;
}
}
