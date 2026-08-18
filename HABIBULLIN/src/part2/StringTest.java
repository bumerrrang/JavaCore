/** page 141
 * 
 */
package part2;

/**
 * @author bumerang
 *
 */
public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String winLikeWin = null, winLikeDOS = null, winLikeUnix = null;
		String dosLikeWin = null, dosLikeDOS = null, dosLikeUNIX = null;
		String unixLikeWin = null, unixLikeDOS = null, unixLikeUNIX = null;
		String msg = null;
		byte[] byteCp1251 = {(byte)0xD0, (byte)0xEE, (byte)0xF1, 
				             (byte)0xF1, (byte)0xE8, (byte)0xFF};
		byte[] byteCp866 = {(byte)0x90, (byte)0xAE, (byte)0xE1, 
				            (byte)0xE1, (byte)0xA8, (byte)0xD1};
		byte[] byteKOI8R = {(byte)0xF2, (byte)0xCF, (byte)0xD3, 
	                        (byte)0xD3, (byte)0xC9, (byte)0xD1};
		char[] c = {'Р', 'о', 'с', 'с', 'и', 'я'};
		String s1 = new String(c);
		String s2 = new String(byteCp866);
		String s3 = "Россия";
		System.out.println();
		
		try {
			msg = new String("\"Россия\" в ".getBytes("Cp866"), "Cp1251");
			
			winLikeWin = new String(byteCp1251, "Cp1251");
			winLikeDOS = new String(byteCp1251, "Cp866");
			winLikeUnix = new String(byteCp1251, "KOI8-R");
			dosLikeWin = new String(byteCp866, "Cp1251");
			dosLikeDOS = new String(byteCp866, "Cp866");
			dosLikeUNIX = new String(byteCp866, "KOI8-R");
			unixLikeWin = new String(byteKOI8R, "Cp1251");
			unixLikeDOS = new String(byteKOI8R, "Cp866");
			unixLikeUNIX = new String(byteKOI8R, "KOI8-R");
			
			System.out.print(msg + "Cp1251: ");
			System.out.write(byteCp1251);
			System.out.println();
			System.out.print(msg + "Cp866: ");
			System.out.write(byteCp866);
			System.out.println();
			System.out.print(msg + "KOI8-R: ");
			System.out.write(byteKOI8R);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println(msg + "char array      : " + s1);
		System.out.println(msg + "deafult encoding: " + s2);
		System.out.println(msg + "string constant: " + s3);
		System.out.println();
		System.out.println(msg + "Cp1251 -> Cp1251: " + winLikeWin);
		System.out.println(msg + "Cp1251 -> Cp866: " + winLikeDOS);
		System.out.println(msg + "Cp1251 -> KOI8-R: " + winLikeUnix);
		System.out.println(msg + "Cp866 -> Cp1251: " + dosLikeWin);
		System.out.println(msg + "Cp866 -> Cp866: " + dosLikeDOS);
		System.out.println(msg + "Cp866 -> KOI8-R: " + dosLikeUNIX);
		System.out.println(msg + "KOI8-R -> Cp1251: " + unixLikeWin);
		System.out.println(msg + "KOI8-R -> Cp888: " + unixLikeDOS);
		System.out.println(msg + "KOI8-R -> KOI8-R: " + unixLikeUNIX);
	}
}