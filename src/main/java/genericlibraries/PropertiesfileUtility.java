package genericlibraries;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * This class contains reusable method related to actions performed on Properties file
 * @author QPS-Thilak
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class PropertiesfileUtility {
	private static final FileOutputStream nul = null;
	private Properties property;
	/**
	 * This method is used to initialize Property file
	 * @param path
	 */
	public void propertyFileInitialization(String path) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		property=new Properties();
		try {
			property.load(fis);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
/**
 * This method is used to fetch the datafrom properties file
 * @param key 
 * @param key
 * @return
 */
	public String fetchProperty(String key) {
		return property.getProperty(key);
		
	}
	/**
	 * This method is used to modify properties file
	 * @param key 
	 * @param key
	 * @param value 
	 * @param value
	 * @param path 
	 * @param path
	 * @param message 
	 * @param message
	 */
	public void modifyPropertiesFile(String key, String value, String path, String message) {
		property.put(key, value);
		FileOutputStream fos=nul;
		try {
			fos=new FileOutputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			property.store(fos, message);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
