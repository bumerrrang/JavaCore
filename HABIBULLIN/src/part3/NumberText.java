/** page 318
 * 
 */
package part3;

import java.awt.*;

import javax.swing.*;
import javax.swing.text.*;

/**
 * @author bumerang
 *
 */
public class NumberText extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	
	JTextField tf = new JTextField(5);
	JLabel l = new JLabel("Enter the numbers:");
	
	public NumberText() {
		super("text");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// filters
		((PlainDocument)tf.getDocument()).setDocumentFilter(new NumberFilter());
		
		// printing text red
		tf.setSelectedTextColor(Color.red);
		// if selecting text, it becomes white
		tf.setSelectionColor(Color.white);
		// caret would be red
		tf.setCaretColor(Color.red);
		l.setLabelFor(tf);
		
		c.add(l);
		c.add(tf);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new NumberText();
	}
}

// filter class
class NumberFilter extends DocumentFilter {
	
	// rewriting only one method
	public void insertString(FilterBypass fb, int pos, String text, AttributeSet attr) throws BadLocationException {
		
		try {
			Integer.parseInt(text);  // was entered a number?
		} catch (Exception e) {
			// if not a number, do not printing a character
			super.insertString(fb, 0, "", attr);
			return;
		}
		// if a number, printing it
		super.insertString(fb, pos, text, attr);
	}
}
