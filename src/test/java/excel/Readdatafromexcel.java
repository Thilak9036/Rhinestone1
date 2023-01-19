package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdatafromexcel 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step 1:Convert physical file to java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
		
		
		//Step 2:open the excel workbook
		//Import workbook from org.apache.poi.ss.usermodel
		//The below statement throws EncryptedDocumentsException and IO exception
		Workbook wb=WorkbookFactory.create(fis);
		
		
		//Step 3: Get control over particular sheet
		Sheet s=wb.getSheet("Sheet1");
		
		//Step 4: Get control over specific row
		Row r=s.getRow(0);
		
		//Step 5: Get control over cell
		Cell c=r.getCell(1);
		
		
		
		//Step 6:Fetch data from cell
		System.out.println(c.getStringCellValue());
		
		
		//Step 7: Close workbook
		wb.close();
		
		
		
		
	}

}
