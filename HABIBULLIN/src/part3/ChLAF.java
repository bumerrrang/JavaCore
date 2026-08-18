/** page 429
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class ChLAF extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public ChLAF() {
		super("		Change L&F");
		final Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JMenuBar mb = new JMenuBar();
		setJMenuBar(mb);
		
		JMenu serv = new JMenu("Service");
		mb.add(serv);
		
		JMenu laf = new JMenu("View");
		serv.add(laf);
		
		ButtonGroup bg = new ButtonGroup();
		
		UIManager.LookAndFeelInfo[] info = UIManager.getInstalledLookAndFeels();
		
		for (int i = 0; i < info.length; i++) {
			JRadioButtonMenuItem item = new JRadioButtonMenuItem(info[i].getName());
			
			item.addItemListener(new LAFChange(info[i].getClassName()));
			
			bg.add(item);
			laf.add(item);
		}
		
		JButton b = new JButton("Button");
		
		c.add(b);
		
		UIManager.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				// TODO Auto-generated method stub
				SwingUtilities.updateComponentTreeUI(c);
			}
		});
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChLAF();
	}
	
	class LAFChange implements ItemListener {

		private String className;
		
		public LAFChange(String className) {
			this.className = className;
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getStateChange() == ItemEvent.SELECTED) {
				try {
					UIManager.setLookAndFeel(className);
				} catch (Exception ex) {
					// TODO: handle exception
				}
			}
		}		
	}
}