/** page 344
 * 
 */
package part3;

import java.awt.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class BorderTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public BorderTest(String s) {
		super(s);
		Container c = getContentPane();
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("Center"));
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JFrame f = new BorderTest("		Manager BorderLayout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}