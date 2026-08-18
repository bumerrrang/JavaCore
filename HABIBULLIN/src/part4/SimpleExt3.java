/** page 506
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
public class SimpleExt3 {

	/**
	 * @param args
	 */
	
	private static void f(int n) { // throws ArithmeticException
		try {
			System.out.println(" 10 / n = " + (10 / n));
			System.out.println("From f() after results output");
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("From f() catch: " + ae);
			// throw ae
		} finally {
				System.out.println("From f() finally");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println("After parseInt()");
			f(n);
			System.out.println("After results output");
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("From Arithm.Exc. catch: " + ae);
		} catch (ArrayIndexOutOfBoundsException arre) {
			// TODO: handle exception
			System.out.println("From Array.Exc. catch: " + arre);
		} finally {
			System.out.println("From finally");
		}
		System.out.println("After all actions");
	}
}