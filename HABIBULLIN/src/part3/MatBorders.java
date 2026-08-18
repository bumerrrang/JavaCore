/** page 412
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * @author bumerang
 *
 */
public class MatBorders extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public MatBorders() {
		super(" Borders with image and diffirent width");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("	MatterBorder(Icon)	");
		l1.setBorder(new MatteBorder(new ImageIcon("about16.gif")));
		
		JLabel l2 = new JLabel("	MatterBorder(3, 6, 3, 6, Color.red)	");
		l2.setBorder(BorderFactory.createMatteBorder(3, 6, 3, 6, Color.red));
		
		c.add(l1);
		c.add(l2);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new MatBorders();
	}
}