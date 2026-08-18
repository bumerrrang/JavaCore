/** page 555
 * 
 */
package part4;

import java.awt.*;
import java.awt.event.*;

/**
 * @author bumerang
 *
 */
public class PrintTest extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	
	PrintTest(String s) {
		super(s);
		setSize(400, 400);
		setVisible(true);
	}
	
	public void simplePrint() {
		PrintJob pj = getToolkit().getPrintJob(this, "Job Title", null);
		
		if(pj != null) {
			Graphics pg = pj.getGraphics();
			if(pg != null) {
				print(pg);
				pg.dispose();
			}
			else {
				System.err.println("Graphic's null");
			}
			pj.end();
		}
		else {
			System.err.println("Job's null");
		}
	}
	
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.ITALIC, 30));
		g.setColor(Color.black);
		g.drawArc(100, 100, 200, 200, 0, 360);
		g.drawString("Page 1", 100, 100);
	}
	
	public static void main(String[] args) {
	
		PrintTest pt = new PrintTest("	Simple Testing Example");
		pt.simplePrint();
		pt.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ev) {
				System.exit(0);
			}
		});
	}
}