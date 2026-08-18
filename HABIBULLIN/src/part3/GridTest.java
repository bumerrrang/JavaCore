/** page 347
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

import java.util.*;

/**
 * @author bumerang
 *
 */
public class GridTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public GridTest(String s) {
		super(s);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4, 5, 5));
		
		StringTokenizer st = new StringTokenizer("7 8 9 / 4 5 6 * 1 2 3 - 0 . = +");
		while (st.hasMoreTokens()) {
			add(new JButton(st.nextToken()));
		}
		
		setSize(200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		JFrame f = new GridTest("	Manager GridLayout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}