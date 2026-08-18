/** page 338
 * 
 */
package part3;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;

/**
 * @author bumerang
 *
 */
public class RowEd extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	public RowEd() {
		super("		String Editor");
		
		DefaultTableModel dm = new DefaultTableModel();
		dm.setDataVector(
				new Object[][] {
						{"Name", "Ivan"},
						{"Surname", "Petrov"},
						{"Sex", "Male"}
				},
				new Object[] {"Coworker", "Data"}
				);
		
		JTable table = new JTable(dm);
		
		JComboBox cb = new JComboBox();
		cb.addItem("Male");
		cb.addItem("Female");
		
		RowEditor rowEd = new RowEditor(table);
		rowEd.setEditorAt(2, new DefaultCellEditor(cb));
		table.getColumn("Data").setCellEditor(rowEd);
		
		getContentPane().add(new JScrollPane(table));
		setSize(400, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new RowEd();
	}
}

class RowEditor implements TableCellEditor {
	
	protected Hashtable<Integer, TableCellEditor> editors;
	protected TableCellEditor editor, defeditor;
	JTable table;
	
	public RowEditor(JTable table) {
		this.table = table;
		editors = new Hashtable<Integer, TableCellEditor>();
		defeditor = new DefaultCellEditor(new JTextField());
	}
	
	public void setEditorAt(int row, TableCellEditor editor) {
		editors.put(new Integer(row), editor);
	}
	
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {
		return editor.getTableCellEditorComponent(table, value, isSelected, row, column);
	}
	
	public Object getCellEditorValue() {
		return editor.getCellEditorValue();
	}
	
	public boolean stopCellEditing() {
		return editor.stopCellEditing();
	}
	
	public void cancelCellEditing() {
		editor.cancelCellEditing();
	}
	
	public boolean isCellEditable(EventObject anEvent) {
		selectEditor((MouseEvent) anEvent);
		return editor.isCellEditable(anEvent);
	}
	
	public void addCellEditorListener(CellEditorListener l) {
		editor.addCellEditorListener(l);
	}
	
	public void removeCellEditorListener(CellEditorListener l) {
		editor.removeCellEditorListener(l);
	}
	
	public boolean shouldSelectCell(EventObject anEvent) {
		selectEditor((MouseEvent) anEvent);
		return editor.shouldSelectCell(anEvent);
	}
	
	protected void selectEditor(MouseEvent e) {
		int row = (e == null) ? table.getSelectionModel().getAnchorSelectionIndex() :
			table.rowAtPoint(e.getPoint());
		
		editor = (TableCellEditor) editors.get(new Integer(row));
		if(editor == null) {
			editor = defeditor;
		}
	}
}