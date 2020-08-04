package Org.qsp.testngdemo;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadData {

	@DataProvider //2D array
	public String[][] getData() throws Exception{
		String st[][];
		FileInputStream fis = new FileInputStream("C:\\Users\\Kunal\\Desktop\\Neha.xlsx"); //for excel file FIS
		Workbook w = WorkbookFactory.create(fis); //to load WBF 
		Sheet sh = w.getSheet("Sheet1");
		st = new String[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for(int i=1; i<sh.getPhysicalNumberOfRows(); i++){
			for(int j=0; j< sh.getRow(i).getLastCellNum() ;j++){
				st[i-1][j] = sh.getRow(i).getCell(j).toString();
				
			}
		}
		return st;
		
	}
	 @Test(dataProvider = "getData")
	public void m1(String un, String pwd){
		Reporter.log(un + " " + pwd, true);
	}
	
   
}
