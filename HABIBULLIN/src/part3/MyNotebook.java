/** page 386
 * 
 */
package part3;


import java.awt.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class MyNotebook extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public MyNotebook(String title) {
		super(title);
		
		Container c = getContentPane();
		
		JTextField tf = new JTextField("Enter text", 50);
		c.add(tf, BorderLayout.NORTH);
		
		JTextArea ta = new JTextArea();
		ta.setEditable(false);
		c.add(ta);
		
		JPanel p = new JPanel();
		c.add(p, BorderLayout.SOUTH);
		
		JButton b = new JButton("Move");
		p.add(b);
		
		tf.addActionListener(new TextMove(tf, ta));
		b.addActionListener(new TextMove(tf, ta));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame f = new MyNotebook("		Processing ActionEvent");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}