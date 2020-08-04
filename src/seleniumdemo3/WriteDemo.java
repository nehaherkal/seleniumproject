package seleniumdemo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDemo {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		try{
		FileInputStream fis= new FileInputStream("C:\\Users\\Kunal\\Desktop\\Selenium.xlsx");//put double "\\" in path to avoid error
		Workbook w = WorkbookFactory.create(fis);
		Sheet sh = w.getSheet("Sheet1");//throw ss
		Row row = sh.createRow(3);
		Cell cell= row.createCell(5);
		cell.setCellValue("Neha");
		FileOutputStream fio= new FileOutputStream("C:\\Users\\Kunal\\Desktop\\Selenium.xlsx");
		w.write(fio);
		System.out.println("Run");
		fio.close();
		fis.close();
		
		} catch (Exception e){
			System.out.println("File not found");
			e.printStackTrace();
			System.out.println(e);
		
	}
}
}
