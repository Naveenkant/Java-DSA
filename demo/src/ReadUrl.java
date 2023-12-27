

	import java.io.BufferedInputStream;
	import java.net.*;
	import java.io.*;

	public class ReadUrl {

		
		


		

			public static void main(String[] args) throws Exception {

			URL u = new URL("https://www.youtube.com"); InputStream in = u.openStream(); in = new BufferedInputStream(in);

			Reader r = new InputStreamReader(in);

			int c;

			while ((c = r.read()) != -1) {

			System.out.print((char) c);

		

			}

		}

	}


