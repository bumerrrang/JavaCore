/** page 558
 * 
 */
package part4;

import java.awt.*;
import java.awt.geom.*;
import java.awt.print.*;

/**
 * @author bumerang
 *
 */
public class Print2Test implements Printable {

	/* (non-Javadoc)
	 * @see java.awt.print.Printable#print(java.awt.Graphics, java.awt.print.PageFormat, int)
	 */
	@Override
	public int print(Graphics g, PageFormat pf, int ind)
			throws PrinterException {
		// printing not more than 5 pages
		if(ind > 4) {
			return Printable.NO_SUCH_PAGE;
		}
		Graphics2D g2 = (Graphics2D)g;
		g2.setFont(new Font("Serif", Font.ITALIC, 30));
		g2.setColor(Color.black);
		g2.drawString("Page " + (ind + 1), 100, 100);
		g2.draw(new Ellipse2D.Double(100, 100, 200, 200));
		return Printable.PAGE_EXISTS;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// creating a task subject
		PrinterJob pj = PrinterJob.getPrinterJob();
		// opening a dialogue window
		PageFormat pf = pj.pageDialog(pj.defaultPage());
		// defining the subject view
		pj.setPrintable(new Print2Test(), pf);
		// if it is possible to print many copies...
		pj.setCopies(2);
		// opening a dialogue window
		if(pj.printDialog()) {
			try {
				pj.print();
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		// ending the task
		System.exit(0);
	}
}