import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cli {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Scanner sc = new Scanner (System.in);
		Socket s  = new Socket("127.0.0.1",1342);
Scanner sc1 = new Scanner (s.getInputStream());

    System.out.println("Enter any number");
    
   int   num  = sc.nextInt();
   
   System.out.println("Now this number get multiplied by 10 "
		+ "by server and then the result reuturn to client");
   
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(num);
		String temp = sc1.nextLine();
		System.out.println(temp);
	}
}