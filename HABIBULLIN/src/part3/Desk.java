/** page 374
 * 
 */
package part3;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class Desk extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public Desk() {
		super(" Inner desktop");
		
		JDesktopPane dp = new JDesktopPane();
		
		setContentPane(dp);
		
		JInternalFrame ifr1 = new JInternalFrame(" First window", true, true, true, true);
		ifr1.getContentPane().add(new JLabel(" This is the first inner window"));
		ifr1.setBounds(10, 10, 200, 200);
		ifr1.setVisible(true);
		
		dp.add(ifr1);
		
		JInternalFrame ifr2 = new JInternalFrame(" Second window");
		ifr2.getContentPane().add(new JButton(" This is the second inner window"));
		ifr2.setBounds(150, 200, 200, 100);
		ifr2.setVisible(true);
		
		dp.add(ifr2);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new Desk();
	}
}