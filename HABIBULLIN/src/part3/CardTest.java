/** page 348
 * 
 */
package part3;

import java.awt.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class CardTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public CardTest(String s) {
		super(s);
		
		Container c = getContentPane();
		JPanel p = new JPanel();
		CardLayout cl = new CardLayout();
		
		p.setLayout(cl);
		p.add(new JButton("Russian page"), "page1");
		p.add(new JButton("English page"), "page2");
		p.add(new JButton("German page"), "page3");
		c.add(p);
		cl.next(p);
		cl.show(p, "page1");
		
		JPanel p2 = new JPanel();
		p2.add(new JLabel("Choose the language:"));
		JComboBox ch = new JComboBox();
		ch.addItem("Russian");
		ch.addItem("English");
		ch.addItem("German");
		
		p2.add(ch);
		c.add(p2, BorderLayout.NORTH);
		
		setSize(400, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		JFrame f = new CardTest("	Manager CardLayout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}