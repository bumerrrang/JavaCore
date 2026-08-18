/** page 380
 * 
 */
package part3;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class Progress extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public Progress() {
		super("		Progress...");
		
		final ProgressMonitor mon = new ProgressMonitor(this, "Processing.", "else", 0, 100);
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 1; i < 100; i++) {
					try {
						mon.setNote("else " + (100-i) + "%");
						mon.setProgress(i);
						
						if(mon.isCanceled()) {
							mon.setProgress(100);
							break;
						}
						
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
				
				mon.close();
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new Progress();
	}
}