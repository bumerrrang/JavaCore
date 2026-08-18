/** page 427
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class DiffLAF extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	public DiffLAF() {
		super("		Window with different L&F");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JInternalFrame ifr1 = new JInternalFrame(" Window Metal", true, true, true, true);
		ifr1.getContentPane().add(new JLabel(" This is a Window with Java L&F"));
		ifr1.setPreferredSize(new Dimension(200, 100));
		ifr1.setVisible(true);
		c.add(ifr1);
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			JInternalFrame ifr2 = new JInternalFrame("A Windows window", true, true, true, true);
			ifr2.getContentPane().add(new JLabel("<html>This is a Windows window L&F<p>Theme Classic"));
			ifr2.setPreferredSize(new Dimension(200, 100));
			ifr2.setVisible(true);
			c.add(ifr2);
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		JInternalFrame ifr3 = new JInternalFrame(" A CDE/Motif window", true, true, true, true);
		ifr3.getContentPane().add(new JLabel("This is a Solaris CDE L&F"));
		ifr3.setPreferredSize(new Dimension(200, 100));
		ifr3.setVisible(true);
		c.add(ifr3);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DiffLAF();
	}
}