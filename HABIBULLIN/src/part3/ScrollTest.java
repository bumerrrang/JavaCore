/**
 * 
 */
package part3;

import java.awt.*;
import java.awt.event.*;

/**
 * @author bumerang
 *
 */
public class ScrollTest extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Scrollbar sbRed = new Scrollbar(Scrollbar.VERTICAL, 127, 10, 0, 255);
	Scrollbar sbGreen = new Scrollbar(Scrollbar.VERTICAL, 127, 10, 0, 255);
	Scrollbar sbBlue = new Scrollbar(Scrollbar.VERTICAL, 127, 10, 0, 255);
	Color mixedColor = new Color(127, 127, 127);
	Label lm = new Label();
	Button b1 = new Button("Apply");
	Button b2 = new Button("Cancel");
	
	ScrollTest(String s) {
		super(s);
		setLayout(null);
		setFont(new Font("Serif", Font.BOLD, 15));
		Panel p = new Panel();
		p.setLayout(null);
		p.setBounds(10, 50, 180, 260);
		add(p);
		
		Label lc = new Label("Choose the color:");
		lc.setBounds(20, 0, 180, 30);
		p.add(lc);
		
		Label lmin = new Label("0", Label.RIGHT);
		lmin.setBounds(0, 30, 30, 30);
		p.add(lmin);
		
		Label lmiddle = new Label("127", Label.RIGHT);
		lmiddle.setBounds(0, 120, 30, 30);
		p.add(lmiddle);
		
		Label lmax = new Label("255", Label.RIGHT);
		lmax.setBounds(0, 200, 30, 30);
		p.add(lmax);
		
		sbRed.setBackground(Color.red);
		sbRed.setBounds(40, 30, 20, 200);
		p.add(sbRed);
		
		sbGreen.setBackground(Color.green);
		sbGreen.setBounds(70, 30, 20, 200);
		p.add(sbGreen);
		
		sbBlue.setBackground(Color.blue);
		sbBlue.setBounds(100, 30, 20, 200);
		p.add(sbBlue);
		
		Label lp = new Label("Example:");
		lp.setBounds(250, 50, 120, 30);
		add(lp);
		
		lm.setBackground(new Color(127, 127, 127));
		lm.setBounds(220, 80, 120, 80);
		add(lm);
		b1.setBounds(240, 200, 100, 30);
		add(b1);
		b2.setBounds(240, 240, 100, 30);
		add(b2);
				
		setSize(400, 300);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Frame f = new ScrollTest("	Choosing Color");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}
