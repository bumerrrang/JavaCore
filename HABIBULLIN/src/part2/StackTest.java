/** page 161
 * 
 */
package part2;

/**
 * @author bumerang
 *
 */

import java.util.*;

// checking the parity of scopes
public class StackTest {

	/**
	 * @param args
	 */
	
	static boolean checkParity(String expression, String open, String close) {
		Stack<String> stack = new Stack<String>();
		StringTokenizer st = new StringTokenizer(expression, " \t\n\r+/-(){}", true);
		
		while (st.hasMoreTokens()) {
			String tmp = st.nextToken();
			if(tmp.equals(open)) {
				stack.push(open);
			}
			if(tmp.equals(close)) {
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println(checkParity("a -(b - (c - a) / (b + c) - 2)", "(", ")"));
	}
}