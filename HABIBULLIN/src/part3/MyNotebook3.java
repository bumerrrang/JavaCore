/** page 388
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class MyNotebook3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	private JTextField tf;
	private JTextArea ta;
	
	public MyNotebook3(String title) {
		super(title);
		
		Container c = getContentPane();
		
		tf = new JTextField("Enter text", 50);
		c.add(tf, BorderLayout.NORTH);
		
		ta = new JTextArea();
		ta.setEditable(false);
		c.add(ta);
		
		JPanel p = new JPanel();
		c.add(p, BorderLayout.SOUTH);
		JButton b = new JButton("Move");
		p.add(b);
		
		tf.addActionListener(new TextMove());
		b.addActionListener(new TextMove());
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		JFrame f = new MyNotebook3("	Processing ActionEvent");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class TextMove implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			// TODO Auto-generated method stub
			ta.append(tf.getText() + "\n");
		}
	}
}