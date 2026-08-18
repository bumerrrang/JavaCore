/** page 362
 * 
 */
package part3;

import java.awt.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class SpringWin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	JComponent[] comp = {
			new JButton("Long String"),
			new JButton("<html>String with<p> two strings"),
			new JButton("OK")
	};
	
	public SpringWin() {
		super("		Layout manager SpringLayout");
		Container c = getContentPane();
		SpringLayout sl = new SpringLayout();
		c.setLayout(sl);
		
		Spring xPad = Spring.constant(6);
		Spring yPad = Spring.constant(10);
		
		Spring currX = yPad;
		
		Spring maxHeight = Spring.constant(0);
		
		for(int i = 0; i < comp.length; i++) {
			c.add(comp[i]);
			SpringLayout.Constraints cons = sl.getConstraints(comp[i]);
			
			cons.setX(currX);
			cons.setY(yPad);
			
			currX = Spring.sum(xPad, cons.getConstraint("East"));
			
			maxHeight = Spring.max(maxHeight, cons.getConstraint("South"));
		}
		SpringLayout.Constraints pCons = sl.getConstraints(c);
		
		pCons.setConstraint(SpringLayout.EAST, Spring.sum(currX, yPad));
		pCons.setConstraint(SpringLayout.SOUTH, Spring.sum(maxHeight, yPad));
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SpringWin();
	}
}