/** page 385
 * 
 */
package part3;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class TextMove implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	
	private JTextField tf;
	private JTextArea ta;
	
	public TextMove(JTextField tf, JTextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ta.append(tf.getText() + "\n");
	}
}
