/** page 253
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;

/**
 * @author bumerang
 *
 */

class LoginWin extends Dialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param owner
	 * @param title
	 */
	LoginWin(Frame f, String s) {
		super(f, s, true);
		setLayout(null);
		setFont(new Font("Serif", Font.PLAIN, 14));
		
		Label l1 = new Label("Your name:", Label.RIGHT);
		l1.setBounds(20, 30, 90, 25);
		add(l1);
		
		Label l2 = new Label("Password:", Label.RIGHT);
		l2.setBounds(20, 60, 90, 25);
		add(l2);
		
		TextField tf1 = new TextField(30);
		tf1.setBounds(120, 30, 160, 25);
		add(tf1);
		
		TextField tf2 = new TextField(30);
		tf2.setBounds(120, 60, 160, 25);
		add(tf2);
		tf2.setEchoChar('*');
		
		Button b1 = new Button("Apply");
		b1.setBounds(50, 100, 100, 30);
		add(b1);
		
		Button b2 = new Button("Cancel");
		b2.setBounds(160, 100, 100, 30);
		add(b2);
		
		setBounds(50, 50, 320, 150);
	}
}

public class DialogTest extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public DialogTest(String s) {
		super(s);
		setLayout(null);
		setSize(200, 100);
		setVisible(true);
		Dialog d = new LoginWin(this, "	Login Window");
		d.setVisible(true);
	}
	
	public static void main(String[] args) {
	
		Frame f = new DialogTest("	Window-Owner");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}
