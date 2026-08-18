/** page 508
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
public class SimpleExt4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println("After parseInt()");
			System.out.println("10 / n = " + (10 / n));
			System.out.println("After results output");
		} catch (RuntimeException ae) {
			// TODO: handle exception
			System.out.println("From Run.Exc. catch: " + ae);
		} finally {
			System.out.println("From finally");
		}
		System.out.println("After all actions");
	}
}
