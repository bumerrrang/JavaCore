/** page 394
 * 
 */
package part3;

import java.awt.event.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class WheelEv extends JFrame 
                     implements MouseWheelListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see java.awt.event.MouseWheelListener#mouseWheelMoved(java.awt.event.MouseWheelEvent)
	 */
	
	JTextArea ta = new JTextArea(5, 30);
	
	public WheelEv() {
		// TODO Auto-generated constructor stub
		super("		Mouse Wheel");
		getContentPane().add(ta);
		
		ta.addMouseWheelListener(this);
		
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub
		if(e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
			ta.append("		Units = " + e.getUnitsToScroll() + 
					" Amount = " + e.getScrollAmount() + 
					" Rotation = " + e.getWheelRotation() + "\n");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WheelEv();
	}

}
