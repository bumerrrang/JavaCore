/** page 521
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
public class TwoThreads4 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
//		synchronized public void run() {
			System.out.print("Hello, ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {}
			System.out.println("World!");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoThreads4 th = new TwoThreads4();
		new Thread(th).start();
		new Thread(th).start();
	}
}