/** page 279
 * 
 */
package part3;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class DummyToggleButton extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	private JToggleButton tb;
	
	public DummyToggleButton() {
		tb = new JToggleButton("<html><u>Y</u>es?<p>No?");
		tb.setMnemonic(KeyEvent.VK_L);
		tb.setToolTipText("Choose");
		add(tb);
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new DummyToggleButton();
	}
}
