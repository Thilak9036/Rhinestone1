package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writedatapropertiesfile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/commonData.Properties");
	Properties P=new Properties();
	P.load(fis);
	
	
	//Write data into properties file
	P.put("username", "Thilak");
	
	
	//Save data in properties file
	FileOutputStream fos=new FileOutputStream("./src/test/resources/commonData.Properties");
	P.store(fos,"Username Modified");

	}

}
