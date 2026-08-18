/** page 117
 * 
 */
package part1;

/**
 * @author bumerang
 *
 */

final class Singleton {
	
	private static Singleton s = new Singleton(0);
	private int k;
	
	private Singleton(int i) {
		k = i;
	}
	
	public static Singleton getReference() {
		return s;
	}
	
	public int getValue() {
		return k;
	}
	
	public void setValue(int i) {
		k = i;
	}
}

public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton ref = Singleton.getReference();
		System.out.println(ref.getValue());
		ref.setValue(ref.getValue() + 5);
		System.out.println(ref.getValue());

	}

}
