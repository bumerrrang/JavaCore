/** page 211
 * 
 */
package part3;

import java.awt.*;
import javax.swing.*;

/**
 * @author bumerang
 *
 */
public class GraphTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param gc
	 */
	GraphTest(String s) {
		super(s);
		setBounds(0, 0, 500, 300);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		
		Dimension d = getSize();
		int dx = d.width / 20, dy = d.height / 20;
		g.drawRect(dx, dy + 20, d.width - 2 * dx, d.height - 2 * dy -20);
		g.drawRoundRect(2 * dx, 2 * dy + 20, d.width - 4 * dx, d.height - 4 * dy - 20, dx, dy);
		g.fillArc(d.width / 2 - dx, d.height - 2 * dy + 1, 2 * dx, dy - 1, 0, 360);
		g.drawArc(d.width / 2 - 3 * dx, d.height - 3 * dy / 2 - 5, dx, dy / 2, 0, 360);
		g.drawArc(d.width / 2 + 2 * dx, d.height - 3 * dy / 2 - 5, dx, dy / 2, 0, 360);
		
		Font f1 = new Font("Serif", Font.BOLD|Font.ITALIC, 2 * dy);
		Font f2 = new Font("Serif", Font.BOLD, 5 * dy / 2);
		FontMetrics fm1 = getFontMetrics(f1);
		FontMetrics fm2 = getFontMetrics(f2);
		String s1 = "Every last mistake";
		String s2 = "is last but one mistake.";
		String s3 = "The Testing Rule";
		int firstLine = d.height / 3;
		int nextLine = fm1.getHeight();
		int secondLine = firstLine + nextLine / 2;
		g.setFont(f2);
		g.drawString(s3, (d.width - fm2.stringWidth(s3)) / 2, firstLine);
		g.drawLine(d.width / 4, secondLine - 2, 3 * d.width / 4, secondLine - 2);
		g.drawLine(d.width / 4, secondLine - 1, 3 * d.width / 4, secondLine - 1);
		g.drawLine(d.width / 4, secondLine, 3 * d.width / 4, secondLine);
		g.setFont(f1);
		g.drawString(s1, (d.width - fm1.stringWidth(s1)) / 2, firstLine + 2 * nextLine);
		g.drawString(s2, (d.width - fm1.stringWidth(s2)) / 2, firstLine + 3 * nextLine);
	}

	public static void main(String[] args) {
		
		GraphTest f = new GraphTest("Example of Painting");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}