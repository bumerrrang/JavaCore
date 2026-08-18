/** page 408
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
public class SimpBorders extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	public SimpBorders() {
		super("		Simple Borders");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton l1 = new JButton("	EmptyBorder");
		l1.setBackground(Color.white);
		l1.setBorder(BorderFactory.createEmptyBorder());
		
		JLabel l2 = new JLabel("	LineBorder(Color.blue, 3)	");
		l2.setBorder(BorderFactory.createLineBorder(Color.blue, 3));
		
		JLabel l3 = new JLabel("	BevelBorder(BevelBorder.RAISED)	");
		l3.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		
		JLabel l4 = new JLabel("	BevelBorder(BevelBorder.LOWERED)	");
		l4.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		
		JLabel l5 = new JLabel("	Capacity two-colored border	");
		l5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,
				Color.black, Color.white, Color.black, Color.white));
		
		JLabel l6 = new JLabel("	EtchedBorder()	");
		l6.setBorder(BorderFactory.createEtchedBorder());
		
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);			
	}
	
	public static void main(String[] args) {
		
		new SimpBorders();
	}

}
