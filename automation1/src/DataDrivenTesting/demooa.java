package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demooa {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream fis= new FileInputStream("./data/Book.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	String data = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	}
}
