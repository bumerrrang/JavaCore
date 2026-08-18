/** page 89
 * 
 */
package part1;

/**
 * @author bumerang
 *
 */
public class Complex {

	/**
	 * @param args
	 */
	
	private static final double EPS = 1e-12;
	private double re, im;
	
	// four constructors
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public Complex(double re) {
		this(re, 0.0);
	}
	
	public Complex() {
		this(0.0, 0.0);
	}
	
	public Complex(Complex z) {
		this.re = z.re;
		this.im = z.im;
	}
	
	// getters and setters
	public double getRe() {
		return this.re;
	}
	
	public double getIm() {
		return this.im;
	}
	
	public Complex getZ() {
		return new Complex(this.re, this.im);
	}
	
	public void setRe(double re) {
		this.re = re;
	}
	
	public void setIm(double im) {
		this.im = im;
	}
	
	public void setZ(Complex z) {
		this.im = z.re;
		this.im = z.im;
	}
	
	// module and argument of complex number
	public double mod() {
		return Math.sqrt(re * re + im * im);
	}
	
	public double arg() {
		return Math.atan2(re, im);
	}
	
	// checking: is a real number?
	public boolean isReal() {
		return Math.abs(im) < EPS;
	}
	
	// printing on the screen
	public void pr() {
		System.out.println(re + (im < 0.0? "" : "+") + im + "i");
	}
	
	// overriding class Object methods
	public boolean equals(Complex z) {
		return Math.abs(re - z.re) < EPS && Math.abs(im - z.im) < EPS; 
	}
	
	public String toString() {
		return "Complex: " + re + " " + im;
	}
	
	// methods '+=', '-=', '*=', '/='
	public void add(Complex z) {
		this.re += z.re;
		this.im += z.im;
	}
	
	public void sub(Complex z) {
		this.re -= z.re;
		this.im -= z.im;
	}
	
	public void mul(Complex z) {
		double t = this.re * z.re - this.im * z.im;
		this.im = this.re * z.im + this.im * z.im;
		this.re = t;
	}
	
	public void div(Complex z) {
		double m = z.mod();
		double t = this.re * z.re - this.im * z.im;
		re = t / m;
	}
	
	public Complex plus(Complex z) {
		return new Complex(this.re + z.re, this.im + z.im);
	}
	
	public Complex minus(Complex z) {
		return new Complex(this.re - z.re, this.im - z.im);
	}
	
	public Complex asteriks(Complex z) {
		return new Complex((this.re * z.re - this.im * z.im), (this.re * z.im + this.im * z.re));
	}

	public Complex slash(Complex z) {
		double m = z.mod();
		return new Complex((this.re * z.re - this.im * z.im) / m, (this.im * z.re - this.re * z.im) / m);
	}
}

// a test class
class ComplexTest {
	public static void main(String[] args) {
		Complex z1 = new Complex(),
				z2 = new Complex(1.5),
				z3 = new Complex(3.6, -2.2),
				z4 = new Complex(z3);
		
		System.out.println();
		System.out.print("z1 = ");
		z1.pr();
		System.out.print("z2 = ");
		z2.pr();
		System.out.print("z3 = ");
		z3.pr();
		System.out.print("z4 = ");
		z4.pr();
		
		z2.add(z3);
		System.out.print("z2 + z3 = ");
		z2.pr();
		
		z2.div(z3);
		System.out.print("z2 / z3 = ");
		z2.pr();
		z2 = z2.plus(z2);
		System.out.print("z2 + z2 = ");
		z2.pr();
		z3 = z2.slash(z1);
		System.out.print("z2 / z1 = ");
		z3.pr();
	}
}
