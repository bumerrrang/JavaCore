/** page 325
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class SimpTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public SimpTable() {
		super("		My Table");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String[][] data = {{"-27", "32"}, {"-45", "55"}};
		String[] colNames ={"Yesterday", "Today"};
		
		JTable t1 = new JTable(data, colNames);
		c.add(new JScrollPane(t1));
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new SimpTable();
	}

}
