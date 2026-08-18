/** page 518
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
public class TwoThreads3 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	private String msg;
	
	public TwoThreads3(String s) {
		msg = s;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {}
			System.out.print(msg + " ");
		}
		System.out.println("End of thread.");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new TwoThreads3("HIP"), "Thread 1").start();
		new Thread(new TwoThreads3("hop"), "Thread 2").start();
		System.out.println();
	}
}