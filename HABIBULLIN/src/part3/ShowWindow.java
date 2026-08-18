/** page 442
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;
//import java.applet.*;

/**
 * @author bumerang
 *
 */
//public class ShowWindow extends Applet {
public class ShowWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SomeWindow sw = new SomeWindow();
	private TextField tf = new TextField(30);
	private Button b = new Button("Hide");
	
	public void init() {
//		add(tf);
//		add(b);
		sw.pack();
		b.addActionListener(new ActShow());
		sw.tf.addActionListener(new ActShow());
	}
	
	public void start() {
		sw.setVisible(true);
	}
	
	public void stop() {
		sw.setVisible(false);
	}
	
	public void destroy() {
		sw.dispose();
		sw = null;
		tf = null;
		b = null;
	}
	
	public class ActShow implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent ae) {
			// TODO Auto-generated method stub
			if(ae.getSource() == sw.tf) {
				tf.setText(sw.tf.getText());
			}
			else if(b.getActionCommand() == "Show") {
				sw.setVisible(true);
				b.setLabel("Hide");
			}
			else{
				sw.setVisible(false);
				b.setLabel("Show");
			}
		}
	}
	
	class SomeWindow extends Frame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		public TextField tf = new TextField(50);
		
		public SomeWindow() {
			super(" Entrance Window");
			add(new Label("Enter your name, please"), "North");
			add(tf, "Center");
		}
	}
}