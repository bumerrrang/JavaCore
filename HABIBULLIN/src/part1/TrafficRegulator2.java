/** page 114
 * 
 */
package part1;

/**
 * @author bumerang
 *
 */

enum Lights2 {
	
	RED(0), YELLOW(1), GREEN(2), ERROR(-1);
	
	private int value;
	public int currentValue = 0;
	
	private Lights2(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public Lights2 nextLight() {
		currentValue = (currentValue + 1) % 3;
		return Lights2.values()[currentValue];
	}
}

class Timer2 {
	
	private int delay;
	private static Lights2 light = Lights2.RED;
	
	public Timer2(int sec) {
		delay = 1000 * sec;
	}
	
	Lights2 shift() {
		
		Lights2 count = light.nextLight();
		
		try {
			switch (count) {
			case RED: Thread.sleep(delay); break;
			case YELLOW: Thread.sleep(delay/3); break;
			case GREEN: Thread.sleep(delay/2); break;
			}
		} catch (Exception e) {
			return Lights2.ERROR;
		}
		return count;
	}
}

public class TrafficRegulator2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Timer t = new Timer(1);

		for(int k = 0; k < 10; k++) {
			switch (t.shift()) {
			case Lights.RED: System.out.println("Stop!"); break;
			case Lights.YELLOW: System.out.println("Wait!"); break;
			case Lights.GREEN: System.out.println("Walk!"); break;
			case Lights.ERROR: System.out.println("Time Error."); break;
			default: System.err.println("Unknown light."); return;
			}
		}
	}
}
