/** page 353
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class ScrollComps extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public ScrollComps() {
		super("		Scroll Panel Components");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JScrollPane sp = new JScrollPane(new JTextArea(5, 30));
		
		sp.setPreferredSize(new Dimension(200, 200));
		
		sp.setCorner(JScrollPane.LOWER_LEFT_CORNER, new JLabel(" LL"));
		sp.setCorner(JScrollPane.LOWER_RIGHT_CORNER, new JLabel(" LR"));
		sp.setCorner(JScrollPane.UPPER_LEFT_CORNER, new JLabel(" UL"));
		sp.setCorner(JScrollPane.UPPER_RIGHT_CORNER, new JLabel(" LR"));
		
		JLabel lh = new JLabel(" Header");
		lh.setBorder(BorderFactory.createEtchedBorder());
		sp.setColumnHeaderView(lh);
		
		JLabel lr = new JLabel("Row");
		lr.setBorder(BorderFactory.createEtchedBorder());
		sp.setRowHeaderView(lr);
		
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		sp.setViewportBorder(BorderFactory.createEtchedBorder());
		
		c.add(sp);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new ScrollComps();
	}
}