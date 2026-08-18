/** page 441
 * 
 */
package part3;

//import java.applet.*;

/**
 * @author bumerang
 *
 */

//public class RunningString extends Applet {
public class RunningString {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean go;
	
	public void start() {
		go = true;
		sendMessage("This string is being typed by the applet");
	}
	
	public void sendMessage(String s) {
		String s1 = s + "  ";
		while (go) {
//			showStatus(s);
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
			s = s1.substring(1) + s.charAt(0);
			s1 = s;
		}
	}
}