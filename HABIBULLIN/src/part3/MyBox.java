/** page 359
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class MyBox extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	JButton b1 = new JButton("First");
	JButton b2 = new JButton("Second");
	JTextArea ta = new JTextArea(5, 30);
	
	public MyBox() {
		super("		Linear panel");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Box out = Box.createVerticalBox();
		Box in1 = Box.createHorizontalBox();
		Box in2 = Box.createHorizontalBox();
		
		out.add(in1);
		out.add(in2);
		
		in1.add(ta);
		
		in2.add(Box.createHorizontalGlue());
		in2.add(b1);
		in2.add(b2);
		
		c.add(out);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new MyBox();
	}
}