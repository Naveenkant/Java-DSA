package javaProject.Networking;
import java.net.*;
public class Introduction {

	public static void main(String[] args) {

		try {
			URL  obj = new URL("http://EEC:80/index.html") ;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}

}
