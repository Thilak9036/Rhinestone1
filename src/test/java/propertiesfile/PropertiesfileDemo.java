package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesfileDemo
{

	public static void main(String[] args) throws IOException
	{
		
	//Step 1: Convert phycical file into java readable object	
		FileInputStream fis=new FileInputStream("./src/test/resources/commonData.Properties");
		
		
		//Step 2: Create an instance for properties class
		//Properties class is available in java.util package
		Properties p=new Properties();	
		
		
		//Step 3: Load all the key-value pairs to properties object
		p.load(fis);//IO exception
		//Java concept involved- Map interface-HashTable
		
		//Step 4: Read Data
		String url = p.getProperty("url1");
		long time = Long.parseLong(p.getProperty("timeouts"));
		System.out.println(url+"\t"+time);
		
		
		
	}
	
	
}
