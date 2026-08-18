/** page 559
 * 
 */
package part4;

import java.awt.*;
import java.awt.print.*;
import java.io.*;

/**
 * @author bumerang
 *
 */
public class Print2File {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if(args.length < 1) {
			System.err.println("Usage: Print2File path");
			System.exit(0);
		}
		
		PrinterJob pj = PrinterJob.getPrinterJob();
		PageFormat pf = pj.pageDialog(pj.defaultPage());
		pj.setPrintable(new FilePagePainter(args[0]), pf);
		if(pj.printDialog()) {
			try {
				pj.print();
			} catch (PrinterException e) {}
		}
		System.exit(0);
	}

}

class FilePagePainter implements Printable {
	
	private BufferedReader br;
	private String file;
	private int page = -1;
	private boolean eof;
	private String[] line;
	private int numLines;
	
	public FilePagePainter(String file) {
		this.file = file;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			eof = true;
		}
	}
	
	public int print(Graphics g, PageFormat pf, int ind) throws PrinterException {
		g.setColor(Color.black);
		g.setFont(new Font("Serif", Font.PLAIN, 10));
		int h = (int)pf.getImageableHeight();
		int x = (int)pf.getImageableX() + 10;
		int y = (int)pf.getImageableY() + 12;
		
		try {
			// if the system asked this page first time
			if(ind != page) {
				if(eof) {
					return Printable.NO_SUCH_PAGE;
				}
				page = ind;
				line = new String[h / 12];
				numLines = 0;
				
				while(y + 48 < pf.getImageableY() + h) {
					line[numLines] = br.readLine();
					if(line[numLines] == null) {
						eof = true;
						break;
					}
					numLines++;
					y += 12;
				}
			}
			
			y = (int)pf.getImageableY() + 12;
			g.drawString("File: " + file + ", page " + (ind + 1), x, y);
			
			y += 36;
			
			for(int i = 0; i < numLines; i++) {
				g.drawString(line[i], x, y);
				y += 12;
			}
			return Printable.PAGE_EXISTS;
		} catch (IOException e) {
			return Printable.NO_SUCH_PAGE;
		}
	}
}