/** page 269
 * 
 */
package part3;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class SwingApplicationTemplate extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	public SwingApplicationTemplate(String title) {
		
		// creating a new window
		super(title);
		
		// getting a highest-level container
		//Container c = getContentPane();
		
		// putting a component into container
		//c.add("XXX");
		
		// other configurations
		setSize(WIDTH, HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// window to the screen
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingApplicationTemplate("A new window title");
	}

}
