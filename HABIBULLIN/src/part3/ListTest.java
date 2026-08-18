/** page 240
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;

/**
 * @author bumerang
 *
 */
public class ListTest extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public ListTest(String s) {
		super(s);
		setTitle(s);
		setLayout(null);
		
		setFont(new Font("Serif", Font.BOLD, 15));
		Label l1 = new Label("Choose goods:", Label.CENTER);
		l1.setBounds(10, 50, 120, 30);
		add(l1);
		Label l2 = new Label("Choose payment:");
		l2.setBounds(170, 50, 200, 30);
		add(l2);
		
		List l = new List(2, true);
		l.add("Books");
		l.add("Disks");
		l.add("Toys");
		l.setBounds(20, 90, 100, 40);
		add(l);
		
		Choice ch = new Choice();
		ch.add("Post Transfer");
		ch.add("Credit Card");
		ch.setBounds(170, 90, 200, 30);
		add(ch);
		
		Button b1 = new Button("Continue");
		b1.setBounds(30, 150, 100, 30);
		add(b1);
		Button b2 = new Button("Cancel");
		b2.setBounds(140, 150, 100, 30);
		add(b2);
		Button b3 = new Button("Exit");
		b3.setBounds(250, 150, 100, 30);
		add(b3);
		
		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		Frame f = new ListTest("	Simple Components");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}
