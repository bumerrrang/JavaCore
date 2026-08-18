/** page 335
 * 
 */
package part3;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

/**
 * @author bumerang
 *
 */
public class MultiLineTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	public MultiLineTable(int lineCount) {
		super("		Table with multiline cells");
		DefaultTableModel tm = new DefaultTableModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Class<? extends Object> getColumnClass(int col) {
				return getValueAt(0, col).getClass();
			}
		};
		
		// putting data into the data model
		tm.setDataVector(new Object[][] {
				{"Name\nSurname", "Ivan\nPetrov", "Pjotr\nIvanov"},
				{"Department\nPosition", "Market\nDriver", "Market\nExpeditor"}
		}, 
		new Object[] {"Data", "1", "2"}
		);
		
		// creating table with new data model
		JTable t = new JTable(tm);
		
		// changing the row height on the screen to put there all data
		t.setRowHeight(t.getRowHeight() * lineCount);
		
		// creating new painter
		t.setDefaultRenderer(String.class, new MultiLineCellRenderer());
		
		getContentPane().add(new JScrollPane(t));
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MultiLineTable(2);
	}
}

class MultiLineCellRenderer extends JTextArea implements TableCellRenderer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MultiLineCellRenderer() {
		setLineWrap(true);
		setWrapStyleWord(true);
		setOpaque(true);
	}
	
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int col) {
		if(isSelected) {
			setForeground(table.getSelectionForeground());
			setBackground(table.getSelectionBackground());
		}
		else {
			setForeground(table.getForeground());
			setBackground(table.getBackground());
		}
		
		if(hasFocus) {
			setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
			if(table.isCellEditable(row, col)) {
				setForeground(UIManager.getColor("Table.focusCellForeground"));
				setBackground(UIManager.getColor("Table.focusCellBackround"));
			}
		}
		else {
			setBorder(new EmptyBorder(1, 2, 1, 2));
		}
		
		setFont(table.getFont());
		setText((value == null) ? "" : value.toString());
		return this;
	}
}
