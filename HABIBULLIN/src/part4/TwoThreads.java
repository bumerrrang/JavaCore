/** page 516
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
class OutThread extends Thread {

	/**
	 * @param args
	 */
	
	private String msg;
	
	public OutThread(String s, String name) {
		super(name);
		msg = s;
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {}
				System.out.print(msg + " ");
		}
		System.out.println("End of " + getName());
	}
}

/**
 * @author bumerang
 *
 */

public class TwoThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OutThread("HIP", "Thread1").start();
		new OutThread("hop", "Thread2").start();
		System.out.println();
	}
}
