package seleniumdemo3;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDemo {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis= new FileInputStream("C:\\Users\\Kunal\\Desktop\\Selenium.xlsx");//put double "\\" in path to avoid error
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("Sheet1");//throw ss
		Row firstRow = sh.getRow(0);
		int rowCount = sh.getPhysicalNumberOfRows();
		for(int i =0; i< rowCount; i++){
			for(int j=0;j< firstRow.getLastCellNum(); j++){
				Cell cl = sh.getRow(i).getCell(j);//Cell is interface 
				System.out.print(cl +"  ");//output at bottom 
				

			}
			System.out.println();
		}
		
	}
}
//Username Password
//admin manager
//alia ranbir
//ankit a@123
