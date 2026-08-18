/** page 329
 * 
 */
package part3;

import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.util.*;

/**
 * @author bumerang
 *
 */
public class FileTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public FileTable(File dir) {
		super("		Table of Files");
		
		JTable table = new JTable(new FileTableModel(dir));
		
		getContentPane().add(new JScrollPane(table));
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		File dir = args.length > 0? new File(args[0]) : new File(System.getProperty("user.home"));
		
		new FileTable(dir);
	}

}

class FileTableModel extends DefaultTableModel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected File dir;
	protected String[] fName;
	
	protected String[] colName = new String[] {
		"Name", "Size", "Date and time", "Folder", "Read only", "Write only"
	};
	
	@SuppressWarnings("rawtypes")
	protected Class[] colClass = new Class[] {
			String.class, Long.class, Date.class, Boolean.class, Boolean.class, Boolean.class
	};

	public FileTableModel(File dir) {
		super(dir.list().length, 6);
		this.dir = dir;
		fName = dir.list();
	}
	
	public String getColumnName(int col) {
		return colName[col];
	}
	
	public Class<?> getColumnClass(int col) {
		return colClass[col];
	}
	
	public Object getValueAt(int row, int col) {
		File f = new File(dir, fName[row]);
		switch (col) {
			case 0:	return fName[row];
			case 1:	return new Long(f.length());
			case 2:	return new Date(f.lastModified());
			case 3:	return f.isDirectory()? Boolean.TRUE: Boolean.FALSE;
			case 4:	return f.canRead()? Boolean.TRUE: Boolean.FALSE;
			case 5:	return f.canWrite()? Boolean.TRUE: Boolean.FALSE;

			default:	return null;
		}
	}
}