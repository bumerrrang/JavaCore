/** page 199
 * 
 */
package part3;

import java.awt.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class SimpleFrame2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	SimpleFrame2(String s) {
		super(s);
		setBackground(Color.WHITE);
		setSize(400, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new SimpleFrame2("	My Programm Swing");
	}
}
