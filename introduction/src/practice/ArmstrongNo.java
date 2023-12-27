package practice;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int result = 0;
		int rem ;
		while(n!=0){
			  rem = n%10;
			  result = result+(rem*rem*rem);
			  n/=10;
			}
			if(result==n){
			  System.out.println("0");
			}else{
			  System.out.println("1");
			}
			
	}

}
