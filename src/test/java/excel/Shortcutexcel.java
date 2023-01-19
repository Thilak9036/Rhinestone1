package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Shortcutexcel 

{public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//Step 1:Convert physical file to java readable object
			FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
			
			
			//Step 2:open the excel workbook
			//Import workbook from org.apache.poi.ss.usermodel
			//The below statement throws EncryptedDocumentsException and IO exception
			Workbook wb=WorkbookFactory.create(fis);
			
			
			
			String data= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();//to get string from excel
			System.out.println(data);
			wb.close();
			
}

}
