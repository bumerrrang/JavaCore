/** page 519
 * 
 */
package part4;

/**
 * @author bumerang
 *
 */
public class TwoThreads5 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	private String msg;
	private Thread go;
	
	public TwoThreads5(String s) {
		msg = s;
		go = new Thread(this);
		go.start();
	}
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		while (go == th) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ie) {}
			System.out.print(msg + " ");
		}
		System.out.println("End of thread.");
	}
	
	public void stop() {
		go = null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TwoThreads5 th1 = new TwoThreads5("HIP");
		TwoThreads5 th2 = new TwoThreads5("hop");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {}
		th1.stop();
		th2.stop();
		System.out.println();
	}
}