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
public class CompBorders extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	public CompBorders() {
		super("		Topelt borders");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("	CompoundBorder(TitledBorder, TitledBorder)	");
		l1.setBorder(new CompoundBorder(
				BorderFactory.createTitledBorder(
						BorderFactory.createEtchedBorder(), "Title",
						TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
						new Font("Times New Roman", Font.ITALIC|Font.BOLD, 20)),
				BorderFactory.createTitledBorder(
						BorderFactory.createEtchedBorder(), "Mark",
						TitledBorder.RIGHT, TitledBorder.BOTTOM,
						new Font("Times New Roman", Font.ITALIC, 12),
						Color.red)						
		));
		
		JLabel l2 = new JLabel("	CompoundBorder(BevelBorder.RAISED, BevelBorder.RAISED)	");
		l2.setBorder(new CompoundBorder(
				BorderFactory.createBevelBorder(BevelBorder.RAISED),
				BorderFactory.createBevelBorder(BevelBorder.RAISED)
				));
		
		JLabel l3 = new JLabel("	CompoundBorder(BevelBorder.RAISED, BevelBorder.LOWERED)	");
		l3.setBorder(new CompoundBorder(
				BorderFactory.createBevelBorder(BevelBorder.RAISED),
				BorderFactory.createBevelBorder(BevelBorder.LOWERED)
				));
		
		c.add(l1);
		c.add(l2);
		c.add(l3);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CompBorders();
	}
}