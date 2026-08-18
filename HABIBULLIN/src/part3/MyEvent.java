/** page 405
 * 
 */
package part3;

import java.util.Vector;

/**
 * @author bumerang
 *
 */

// own event class
public class MyEvent extends java.util.EventObject {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int id;
	public static final int START = 0, STOP = 1;
	
	public MyEvent(Object source, int id) {
		super(source);
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	// Listener
	public interface MyListener extends java.util.EventListener {
		public void start(MyEvent e);
		public void stop(MyEvent e);
	}
	
	// START/STOP
	@SuppressWarnings("rawtypes")
	protected Vector listeners = new Vector();

	public void fireEvent(MyEvent e) {
		@SuppressWarnings("rawtypes")
		Vector list = (Vector) listeners.clone();
		
		for(int i = 0; i < list.size(); i++) {
			MyListener listener = (MyListener) list.elementAt(i);
			switch (e.getID()) {
				case MyEvent.START:	listener.start(e); break;
				case MyEvent.STOP:	listener.stop(e); break;
			}
		}
	}
}
