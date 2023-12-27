package recursion;

import java.util.Scanner;

public class Sum_NaturalNo {
static int stepcount;
	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b = sc.nextInt();
		
		int  y= path(a,b);
		System.out.println(y);
//		System.out.println(stepcount);

	}
	static int power(int a,int b ) {
		if(b==0) {
	return	1;
		}else {
			return a*power(a,b-1);
		}
	}
	static int fastp(int a,int b ) {
		stepcount++;
		if(b==0) {
	return	1;
		}else if(b%2==0) {
			return a*fastp(a*a,b/2);
		}
		return a*fastp(a,b-1);
	}
	static int path(int n ,int m) {
		if(n==1||m==1)return 1;
		
		return path(n,m-1)+path(m,n-1);
		
	}

}
