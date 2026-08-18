/** page 196
 * 
 */
package part3;

/**
 * @author bumerang
 *
 */

import java.awt.*;
import java.awt.event.*;

public class SimpleFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public SimpleFrame(String s) {
		super(s);
		setSize(400, 150);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		
		new SimpleFrame("	My Programm AWT");
	}

}
