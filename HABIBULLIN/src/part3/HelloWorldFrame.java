/** page 197
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;

/**
 * @author bumerang
 *
 */
public class HelloWorldFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public HelloWorldFrame(String s) {
		super(s);
	}
	
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.ITALIC|Font.BOLD, 30));
		g.drawString("Hello, XXI century World!", 20, 100);
	}
	
	public static void main(String[] args) {
	
		Frame f = new HelloWorldFrame("Hello!");
		f.setSize(400, 150);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}
