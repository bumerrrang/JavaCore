/** page 569
 * 
 */
package part4;

import java.net.*;
import java.io.*;

/**
 * @author bumerang
 *
 */
public class PostURL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String req = "This text is posting to URL";
		try {
			URL url = new URL("http://www.bhv.ru/cgi-bin/some.pl");
			URLConnection uc = url.openConnection();
			uc.setDoOutput(true);
			uc.setDoInput(true);
			uc.setUseCaches(false);
			uc.setRequestProperty("content-type", "application/octet-stream");
			uc.setRequestProperty("content-length", "" + req.length());
			uc.connect();
			DataOutputStream dos = new DataOutputStream(uc.getOutputStream());
			dos.writeBytes(req);
			dos.close();
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			String res = null;
			while((res = br.readLine()) != null) {
				System.out.println(res);
			}
			br.close();
		} catch (MalformedURLException me) {
			System.err.println(me);
		} catch (UnknownHostException he) {
			System.err.println(he);
		} catch (UnknownServiceException se) {
			System.err.println(se);
		} catch (IOException ioe) {
			System.err.println(ioe);
		}
	}
}