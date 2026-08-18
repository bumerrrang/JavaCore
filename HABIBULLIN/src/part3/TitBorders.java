/** page 414
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
public class TitBorders extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	public TitBorders() {
		super("		Borders with titles");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("	TitledBorder(String)	");
		l1.setBorder(new TitledBorder("Mark"));
		
		JLabel l2 = new JLabel("	TitledBorder(new EtchedBorder(), \"Mark\")	");
		l2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "\"Mark\""));
		
		JLabel l3 = new JLabel("<html>	Layout CENTER," +
							   " ABOVE_TOP<p>Font ITALIC, 18	");
		l3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), 
				"Mark", TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
				new Font("Times New Roman", Font.ITALIC, 18)));
		
		JLabel l4 = new JLabel("	Layout RIGHT, BELOW_TOP	");
		l4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), 
				"Mark", TitledBorder.RIGHT, TitledBorder.BELOW_TOP,
				new Font("Times New Roman", Font.ITALIC, 18), 
				Color.red));
		
		JLabel l5 = new JLabel("	Layout CENTER, BOTTOM	");
		l5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), 
				"Mark", TitledBorder.CENTER, TitledBorder.BOTTOM,
				new Font("Times New Roman", Font.ITALIC, 18), 
				Color.red));		
		
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TitBorders();
	}
}