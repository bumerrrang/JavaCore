/** page 391
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class ScribbleTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	public ScribbleTest(String s) {
		super(s);
		
		Container c = getContentPane();
		
		Scribble scr = new Scribble(this, 500, 500);
		JScrollPane pane = new JScrollPane(scr);
		pane.setSize(300, 300);
		c.add(pane, BorderLayout.CENTER);
		
		JPanel p = new JPanel();
		c.add(p, BorderLayout.SOUTH);
		
		JButton b1 = new JButton("Red");
		p.add(b1);
		b1.addActionListener(scr);
		
		JButton b2 = new JButton("Green");
		p.add(b2);
		b2.addActionListener(scr);
		
		JButton b3 = new JButton("Blue");
		p.add(b3);
		b3.addActionListener(scr);
		
		JButton b4 = new JButton("Black");
		p.add(b4);
		b4.addActionListener(scr);
		
		JButton b5 = new JButton("Clear");
		p.add(b5);
		b5.addActionListener(scr);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ScribbleTest("	\"Painter\"");
	}

class Scribble extends JPanel implements ActionListener, 
                                         MouseListener, 
                                         MouseMotionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected int lastX, lastY, w, h;
	protected Color currColor = Color.black;
	protected JFrame f;
	
	
	public Scribble(JFrame frame, int width, int height) {
		f = frame;
		w = width;
		h = height;
		
		enableEvents(AWTEvent.MOUSE_EVENT_MASK | 
				     AWTEvent.MOUSE_MOTION_EVENT_MASK);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(w, h);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if((e.getModifiers() & MouseEvent.BUTTON1_MASK) == 0) {
			return;
		}
		
		Graphics g = getGraphics();
		g.setColor(currColor);
		g.drawLine(lastX, lastY, e.getX(), e.getY());
		lastX = e.getX();
		lastY = e.getY();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if((e.getModifiers() & MouseEvent.BUTTON1_MASK) == 0) {
			return;
		}
		
		lastX = e.getX();
		lastY = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String s = event.getActionCommand();
		if(s.equals("Clear")) {
			repaint();
		}
		else if(s.equals("Red")) {
			currColor = Color.red;
		}
		else if(s.equals("Green")) {
			currColor = Color.green;
		}
		else if(s.equals("Blue")) {
			currColor = Color.blue;
		}
		else if(s.equals("Black")) {
			currColor = Color.black;
		}
	}
}
}
