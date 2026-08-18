/** page 505
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
public class SimpleExt2 {

	/**
	 * @param args
	 */
	
	public static void f(int n) {
		System.out.println(" 10 / n = " + (10 / n));
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