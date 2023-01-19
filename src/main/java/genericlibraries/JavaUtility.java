package genericlibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.bouncycastle.asn1.dvcs.Data;

/**
 * This class contains reusable methods of java
 * @author thilak
 */

public class JavaUtility 
{
	public int generateRandomNumber(int limit) {
	
		Random random=new Random();
		return random.nextInt(limit);
	}
	
	/**
	 * This method is used to fetch current data and time
	 * @return
	 */
	public String getCurrentTime() {
	Date date=new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_sss");
	return sdf.format(date);
	
	}
}
