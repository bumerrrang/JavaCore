/** page 543
 * 
 */
package part4;

import java.io.*;

/**
 * @author bumerang
 *
 */
public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"), true);
		
		File f = new File("FileTest.java");
		
		pw.println();
		pw.println("File \"" + f.getName() + "\" " + (f.exists()?"":"not ") + "exist");
		pw.println("You " + (f.canRead()?"can ":"can not ") + "read file");
		pw.println("You " + (f.canWrite()?"can ":"can not ") + "write into file");
		pw.println("File's length is " + f.length() + " bytes");
		pw.println();
		
		File d = new File("MyProgs");
		pw.println("The contents of the folder:");
		if(d.exists() && d.isDirectory()) {
			String[] s = d.list();
			for(int i = 0; i < s.length; i++) {
				pw.println(s[i]);
			}
		}
	}
}