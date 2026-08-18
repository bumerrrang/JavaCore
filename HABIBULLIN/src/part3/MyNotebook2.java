/** page 387
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
public class MyNotebook2 extends JFrame implements ActionListener {

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tf;
	private JTextArea ta;
	
	public MyNotebook2(String title) {
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
		
		tf.addActionListener(this);
		b.addActionListener(this);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		ta.append(tf.getText() + "\n");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame f = new MyNotebook2("	Processing ActionEvent");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}