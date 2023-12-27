package comptetiveques;

import java.util.Arrays;
import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
	
		
		
		int a[]= {2,4,2,6,1,7,8,9,2,1};
		int s = a.length;
		int c[] =new int[s];
		Arrays.fill(c, 1);
		
		for(int i= 1;i<s;i++) {
			if(a[i]>a[i-1]) {
				 c[i]=c[i-1]+1;
			}
		}
		for(int i= s-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				c[i]=Math.max(c[i+1]+1,c[i]);
			}
		}
		int sum = 0;
		for(int i = 0;i<s;i++) {
			sum = sum+c[i];
		}
		System.out.println(sum);
	}

}
