package patterns;

import java.util.Scanner;

public class SidMooc {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		if(n%2==0) {
			System.out.println("Invalid");
		}else if(n%2!=0) {
			
			for(int i = 1;i<=n;i++) {
				if(i<=(n+1)/2) {
					for(int j= 1;j<=(n+1)/2-i;j++) {
						System.out.print(" ");
					}
					for(int j = 1;j<=i;j++) {
					System.out.print("* ");	
					
					}
					System.out.println();
				}else if(i>(n+1)/2) {
					for(int j=1;j<=i-(n+1)/2;j++) {
						System.out.print(" ");
					}
					for(int j =1;j<=n-i+1;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
				}
		}
		
	}

}
