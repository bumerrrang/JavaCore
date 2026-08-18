/** page 327
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;

/**
 * @author bumerang
 *
 */
public class SimpTable2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	SimpTable2() {
		super("		Table with indifferent first column");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTable t1 = new JTable(new FirstColumnTableModel());
		
		c.add(new JScrollPane(t1));
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new SimpTable2();
	}
}

class FirstColumnTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Object[][] data = { 
								{"Text", Color.black, new Boolean(true)},
								{"Background", new Color(130, 56, 187), new Boolean(true)},
								{"Border", new Color(200, 45, 125), new Boolean(false)},
								};
	
	protected String[] colNames = {"Element", "Color", "Choose"};
	
	public FirstColumnTableModel() {
		super();
	}
	
	public int getRowCount() {
		return data.length;
	}
	
	public int getColumnCount() {
		return data[0].length;
	}
	
	public Object getValueAt(int row, int col) {
		return data[row][col];
	}
	
	public void setValueAt(Object value, int row, int col) {
		if(col != 0) {
			data[row][col] = value;
		}
	}
	
	public boolean isCellEditable(int row, int col) {
		return col != 0;
	}
	
	// visualisation
	public Class<? extends Object> getColumnClass(int col) {
		return data[0][col].getClass();
	}
	
	public String getColumnName(int col) {
		return colNames[col];
	}
}