/** page 332
 * 
 */
package part3;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.*;

/**
 * @author bumerang
 *
 */
public class HeadTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public HeadTable() {
		super("		Coworkers");
		Container c = getContentPane();
		
		Vector<Object> data = new Vector<Object>();
		Vector<Object> row = new Vector<Object>();
		row.addElement("Ivanov");
		row.addElement(new Integer(1970));
		row.addElement(new Boolean(false));
		data.addElement(row);
		
		row = new Vector<Object>();
		row.addElement("Petrov");
		row.addElement(new Integer(1980));
		row.addElement(new Boolean(true));
		data.addElement(row);
		
		Vector<Object> col = new Vector<Object>();
		col.addElement("Surname");
		col.addElement("Date of Birth");
		col.addElement("Family");

//		JTable t2 = new JTable(data, col);
		JTable t2 = new JTable((TableModel) data, (TableColumnModel) col);
		
		JTableHeader th = t2.getTableHeader();
		
		c.add(th, BorderLayout.NORTH);
		c.add(t2, BorderLayout.CENTER);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new HeadTable();
	}
}
