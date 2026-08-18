/** page 562
 * 
 */
package part4;

import java.awt.*;
import java.awt.print.*;
/**
 * @author bumerang
 *
 */
public class Print2Book {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PrinterJob pj = PrinterJob.getPrinterJob();
		PageFormat pf1 = pj.defaultPage();
		pf1.setOrientation(PageFormat.LANDSCAPE);
		PageFormat pf2 = pj.pageDialog(new PageFormat());
		
		Book bk = new Book();
		
		bk.append(new Cover(), pf1);
		
		bk.append(new Content(), pf2, 2);
		
		pj.setPageable(bk);
		
		if(pj.printDialog()) {
			try {
				pj.print();
			} catch (Exception e) {}
		}
		System.exit(0);
	}

}

class Cover implements Printable {
	
	public int print(Graphics g, PageFormat pf, int ind) throws PrinterException {
		g.setFont(new Font("Helvetica-Bold", Font.PLAIN, 40));
		g.setColor(Color.black);
		int y = (int)(pf.getImageableY() + pf.getImageableHeight() / 2);
		g.drawString("A Title.", 72, y);
		g.drawString("It is printing along long", 72, y + 60);
		g.drawString("page side.", 72, y + 120);
		return Printable.PAGE_EXISTS;
	}
}

class Content implements Printable {
	
	public int print(Graphics g, PageFormat pf, int ind) throws PrinterException {
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setFont(new Font("Serif", Font.PLAIN, 12));
		g2.setColor(Color.black);
		
		int x = (int)pf.getImageableX() + 30;
		int y = (int)pf.getImageableY();
		
		g2.drawString("This is strings of a plain text", x, y += 16);
		g2.drawString("They are printed with parameters", x, y += 16);
		g2.drawString("chosen in a dialogue window.", x, y += 16);
		
		return Printable.PAGE_EXISTS;
	}
}