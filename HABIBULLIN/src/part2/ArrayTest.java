/** page 183
 * 
 */
package part2;

import java.util.Arrays;

/**
 * @author bumerang
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = {34, -45, 12, 67, -24, 45, 36, -56};
		
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		Arrays.fill(a, Arrays.binarySearch(a, 12), a.length, 0);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
