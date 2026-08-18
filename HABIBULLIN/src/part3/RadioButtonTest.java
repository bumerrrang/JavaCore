/** page 280
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class RadioButtonTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public RadioButtonTest() {
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new FlowLayout());
		
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
		p.setBorder(BorderFactory.createEtchedBorder());
		
		JRadioButton rb1 = new JRadioButton("<html><u>R</u>ed<p>background");
		rb1.setMnemonic(KeyEvent.VK_R);
		rb1.setToolTipText("<html>You're choosing red background");
		rb1.addActionListener((ActionListener) this);
		rb1.setActionCommand("red");
		
		JRadioButton rb2 = new JRadioButton("<html><u>G</u>reen<p>background");
		rb2.setMnemonic(KeyEvent.VK_P);
		rb2.setToolTipText("<html>You're choosing green background");
		rb2.addActionListener((ActionListener) this);
		rb2.setActionCommand("green");
		
		JRadioButton rb3 = new JRadioButton("<html><u>B</u>lue<p>background");
		rb3.setMnemonic(KeyEvent.VK_C);
		rb3.setToolTipText("<html>You're choosing blue background");
		rb3.addActionListener((ActionListener) this);
		rb3.setActionCommand("blue");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		c.add(p);
		
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new RadioButtonTest();
	}

}
