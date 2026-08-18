/** page 373
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class IntFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public IntFrame() {
		super("		Window with inner windows");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JInternalFrame ifr1 = new JInternalFrame(" First Window", true, true, true, true);
		ifr1.getContentPane().add(new JLabel(" This is first inner window"));
		ifr1.setPreferredSize(new Dimension(200, 200));
		ifr1.setVisible(true);
		
		c.add(ifr1);
		
		JInternalFrame ifr2 = new JInternalFrame(" Second Window");
		ifr2.getContentPane().add(new JButton(" This is second inner window"));
		ifr2.setPreferredSize(new Dimension(200, 200));
		ifr2.setVisible(true);
		
		c.add(ifr2);		
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new IntFrame();
	}
}