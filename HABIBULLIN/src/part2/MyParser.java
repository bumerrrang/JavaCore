/** page 160
 * 
 */
package part2;

/**
 * @author bumerang
 *
 */

import java.util.*;

public class MyParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		String s = "The String, which we would like to parse";
		StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");
		while (st.hasMoreTokens()) {
			// getting a word and putting it into the vector
			v.add(st.nextToken());
			System.out.println(v.firstElement());
			System.out.println(v.lastElement());
			//v.setSize(4);
			//v.add("collect");
			//v.set(3, "again");
			
			for (Iterator<String> iterator = v.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.print(string + " ");
			}
			System.out.println();
		}
	}

}
