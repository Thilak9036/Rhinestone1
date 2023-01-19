package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoCompletelyNewRow 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		//Step 1:Convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		
		//create new row by deleting older value
		Row r=sh.createRow(4);
		
		//create new cell by deleting older data in the cell
		Cell c=r.createCell(1);
		
		//Write data into excel
		c.setCellValue("Hi");
		
		//Saves data into excel
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Testdata.xlsx");
		wb.close();
	
}
}
