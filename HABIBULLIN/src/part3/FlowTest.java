/** page 343
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class FlowTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public FlowTest(String s) {
		super(s);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		c.add(new JButton("Button"));
		c.add(new JLabel("Label"));
		c.add(new JCheckBox("Checkbox"));
		c.add(new JComboBox());
		c.add(new JTextField("Enter", 10));
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JFrame f = new FlowTest("	Manager FlowLayout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}