package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readnumber 
{public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//Step 1:Convert physical file to java readable object
	FileInputStream fis=new FileInputStream("./src/test/resources/Testdata.xlsx");
	
	
	//Step 2:open the excel workbook
	//Import workbook from org.apache.poi.ss.usermodel
	//The below statement throws EncryptedDocumentsException and IO exception
	Workbook wb=WorkbookFactory.create(fis);
	DataFormatter df=new DataFormatter();//if i dont use this instead of 45 it wil display 45.0
	System.out.println(df.formatCellValue(wb.getSheet("Sheet1").getRow(3).getCell(0)));//to get numerical value
	wb.close();
	
	
}

}
