/** page 177
 * 
 */
package part2;

/**
 * @author bumerang
 *
 */

import part1.Complex;
import java.util.*;

public class ComplexCompare implements Comparator<Object> {

	public int compare(Object obj1, Object obj2) {
		Complex z1 = (Complex)obj1, z2 = (Complex)obj2;
		double re1 = z1.getRe(), im1 = z1.getIm();
		double re2 = z2.getRe(), im2 = z2.getIm();
		
		if(re1 != re2) {
			return(int)(re1-re2);
		}
		else if(im1 != im2) {
				return(int)(im1-im2);
		}
		else {
			return 0;
		}
	}
	
	public boolean equals(Object z) {
		return compare(this, z) == 0;
	}
}