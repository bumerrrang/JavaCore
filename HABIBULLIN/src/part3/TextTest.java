/**
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;

/**
 * @author bumerang
 *
 */
public class TextTest extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public TextTest(String s) {
		super(s);
		setLayout(null);
		setFont(new Font("Serif", Font.PLAIN, 14));
		
		Label l1 = new Label("Your name:", Label.LEFT);
		l1.setBounds(20, 30, 100, 25);
		add(l1);
		Label l2 = new Label("Password:", Label.LEFT);
		l2.setBounds(20, 60, 100, 25);
		add(l2);
		
		TextField tf1 = new TextField(30);
		tf1.setBounds(120, 30, 160, 25);
		add(tf1);
		TextField tf2 = new TextField(30);
		tf2.setBounds(120, 60, 160, 25);
		add(tf2);
		tf2.setEchoChar('*');
		TextField tf3 = new TextField("Enter here your order", 30);
		tf3.setBounds(10, 100, 250, 30);
		add(tf3);
		
		TextArea ta = new TextArea("Your order:", 5, 50, TextArea.SCROLLBARS_NONE);
		ta.setEditable(false);
		ta.setBounds(10, 150, 250, 140);
		add(ta);
		
		Button b1 = new Button("Apply");
		b1.setBounds(280, 180, 100, 30);
		add(b1);
		Button b2 = new Button("Cancel");
		b2.setBounds(280, 220, 100, 30);
		add(b2);
		Button b3 = new Button("Exit");
		b3.setBounds(280, 260, 100, 30);
		add(b3);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		Frame f = new TextTest("	Fields for Entering");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}
