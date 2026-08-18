/** page 357
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class Tabbed extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	public Tabbed() {
		super("		Panel with tabs");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		JTabbedPane sp = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
		
		sp.setPreferredSize(new Dimension(300, 100));
		
		for(int i = 0; i < 7; i++) {
			sp.add(day[i], new JLabel("Label " + i));
			sp.setBackgroundAt(i, new Color(16 * i, 0, 16 * (7 - i)));
		}
		
		c.add(sp);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new Tabbed();
	}

}
