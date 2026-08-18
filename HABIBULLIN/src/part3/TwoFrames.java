/** page 251
 * 
 */
package part3;


import java.awt.*;
import java.awt.event.*;

/**
 * @author bumerang
 *
 */
public class TwoFrames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		new Fr1("	Main Window");
		new Fr2("	Second Window");
	}
}

class Fr1 extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Fr1(String s) {
		super(s);
		setLayout(null);
		Font f = new Font("Serif", Font.BOLD, 15);
		setFont(f);
		Label l = new Label("This is the main window", Label.CENTER);
		l.setBounds(10, 30, 250, 30);
		add(l);
		setSize(300, 100);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}

class Fr2 extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Fr2(String s) {
		super(s);
		setLayout(null);
		Font f = new Font("Serif", Font.BOLD, 15);
		setFont(f);
		Label l = new Label("This is the second window", Label.CENTER);
		l.setBounds(10, 30, 250, 30);
		add(l);
		setBounds(50, 50, 300, 100);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				dispose();
			}
		});
	}
}
