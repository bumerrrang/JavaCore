/** page 78
 * 
 */
package part1;

/**
 * @author bumerang
 *
 */
public class Bisection2 {

	/**
	 * @param args
	 */
	
	private final static double  EPS = 1e-8;
	private double a = 0.0, b = 1.5, root;
	
	public double getRoot() {
		return root;
	}
	
	private double f(double x) {
		return x * x * x - 3 * x * x + 3;
	}
	
	private void bisect() {
		double y = 0.0;
		
		do {
			root = 0.5 * (a+b);
			y = f(root);
			
			// the root was found
			if(Math.abs(y) < EPS) {
				break;
			}
			
			// on the ends [a; root] the function has different signs
			if(f(a) * y < 0.0) {
				b = root;
			}
			
			// in other case
			else {
				a = root;
			}
		// continuing while [a; b] is not small enough
		} while(Math.abs(b - a) >= EPS);
	}
	
	public static void main(String[] args) {
		Bisection2 b2 = new Bisection2();
		b2.bisect();
		System.out.println("x = " + b2.getRoot() + ", f() = " + b2.f(b2.getRoot()));

	}
}
