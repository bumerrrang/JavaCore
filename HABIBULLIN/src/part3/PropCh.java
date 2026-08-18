/** page 431
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;
import javax.swing.plaf.*;

/**
 * @author bumerang
 *
 */
public class PropCh extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public PropCh() {
		super("		Changing Font Size");
		final Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu serv = new JMenu("Service");
		mb.add(serv);
		
		JMenu laf = new JMenu("Font size");
		serv.add(laf);
		
		ButtonGroup bg = new ButtonGroup();
		
		FontChange fch = new FontChange();
		
		for (int i = 10; i < 22; i += 2) {
			JRadioButtonMenuItem item = new JRadioButtonMenuItem("" + i);
			item.addItemListener(fch);
			bg.add(item);
			laf.add(item);
		}
		
		JTextArea ta = new JTextArea(5, 20);
		JTextField tf = new JTextField(20);
		JPasswordField pf = new JPasswordField(20);
		
		c.add(ta);
		c.add(tf);
		c.add(pf);
		
		PropertyChangeListener pcl = new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				SwingUtilities.updateComponentTreeUI(c);
			}
		};
		
		UIManager.addPropertyChangeListener(pcl);
		UIManager.getDefaults().addPropertyChangeListener(pcl);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PropCh();
	}

	class FontChange implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getStateChange() == ItemEvent.SELECTED) {
				JMenuItem mi = (JMenuItem)e.getSource();
				int n = Integer.parseInt(mi.getText());
				Font f = UIManager.getFont("TextArea.font");
				String name = f.getName();
				int style = f.getStyle();
				
				FontUIResource fr = new FontUIResource(name, style, n);
				
				UIManager.put("TextArea.font", fr);
				//UIManager.put("TextField.font", fr);
				//UIManager.put("PasswordField.font", fr);
				UIManager.put("EditorPane.font", fr);
				UIManager.put("TextPane.font", fr);
				UIManager.put("FormattedTextField.font", fr);
			}
		}		
	}
}