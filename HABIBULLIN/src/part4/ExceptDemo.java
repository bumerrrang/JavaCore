/** page 511
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
class CipherException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	CipherException() {
		// TODO Auto-generated constructor stub
		msg = null;
	}
	
	CipherException(String s) {
		msg = s;
	}
	
	public String toString() {
		return "CipherException(" + msg + ")";
	}
}

public class ExceptDemo {

	/**
	 * @param args
	 */
	
	static public void handle(int cipher) throws CipherException {
		System.out.println("handle()'s beginning");
		if(cipher < 0 || cipher >9) {
			throw new CipherException("" + cipher);
		}
		System.out.println("handle's ending");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			handle(1);
			handle(10);
		} catch (CipherException ce) {
			// TODO: handle exception
			System.out.println("caught " + ce);
			ce.printStackTrace();
		}
	}
}