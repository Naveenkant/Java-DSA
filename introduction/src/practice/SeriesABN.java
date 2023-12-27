package practice;
import java.util.Scanner;
public class SeriesABN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	        
//	        in.close();
//	        int base = 2;
	        int sum = 0;
	        for(int k = 1;k<=n;k++){
//	              for(int j = 0;j<n;j++){
	// base = base*base;
	            sum =sum +(a+2*b);
	        
	            System.out.print(sum+" ");
	            byte x = 45;
	            //  }
	            }
	        }
	        
	}

}
