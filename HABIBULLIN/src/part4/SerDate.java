/** page 552
 * 
 */
package part4;

import java.io.*;
import java.util.*;

/**
 * @author bumerang
 *
 */
public class SerDate {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		GregorianCalendar d = new GregorianCalendar();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("date.ser"));
		oos.writeObject(d);
		oos.flush();
		oos.close();
		
		Thread.sleep(3000);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("date.ser"));
		GregorianCalendar oldDate = (GregorianCalendar)ois.readObject();
		ois.close();
		
		GregorianCalendar newDate = new GregorianCalendar();
		
		System.out.println("Old time = " + oldDate.get(Calendar.HOUR) + 
						   ":" + oldDate.get(Calendar.MINUTE) +
						   ":" + oldDate.get(Calendar.SECOND) +
						   "\nNew time = " +
						   newDate.get(Calendar.HOUR) +
						   ":" + newDate.get(Calendar.MINUTE) +
						   ":" + newDate.get(Calendar.SECOND));
	}
}