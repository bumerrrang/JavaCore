/** page 365
 * 
 */
package part3;

import java.awt.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class MyTool extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	public MyTool() {
		super("		Instrumental Panel");
		Container c = getContentPane();
		
		JToolBar tb1 = new JToolBar(" Panel 1"),
				 tb2 = new JToolBar(" Panel 2");
		
		tb1.setRollover(true);
		
		tb1.add(new JButton(new ImageIcon("Add24.gif")));
		tb1.add(new JButton(new ImageIcon("AlignTop24.gif")));
		tb1.add(new JButton(new ImageIcon("About24.gif")));
		
		tb2.add(new JButton("First"));
		tb2.add(new JButton("Second"));
		tb2.add(new JButton("Third"));
		
		c.add(tb1, BorderLayout.NORTH);
		c.add(tb2, BorderLayout.WEST);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new MyTool();
	}
}