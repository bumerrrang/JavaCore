/** page 345
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class BorderPanelTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public BorderPanelTest(String s) {
		super(s);
		Container c = getContentPane();
		
		JPanel p2 = new JPanel();
		p2.add(new JButton("Execute"));
		p2.add(new JButton("Cancel"));
		p2.add(new JButton("Exit"));
		
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		
		p1.add(p2, BorderLayout.SOUTH);
		p1.add(new TextField("Entrance field", 20), BorderLayout.NORTH);
		
		JScrollPane sp = new JScrollPane(new JTextArea("Entrance area", 5, 20));
		p1.add(sp, BorderLayout.CENTER);
		
		c.add(p1, BorderLayout.CENTER);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		JFrame f = new BorderPanelTest("	Difficult layout");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
