package practice;
import java.util.*;

public class HackerRank {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		long r ;
		int c=0;
		long k = sc.nextLong();
		long n =sc.nextLong();
		int sum =0;
		while(n>0) {
			r=n%10;
			sum+=r;
			n/=10;
			}
		while(sum<k) {
			n++;
			c++;
			while(n>0) {
				r=n%10;
				sum+=r;
				n/=10;
				}
		}
		if(sum>k) {
			System.out.println(0);
		}else if(k>=sum) {
			
			System.out.println(c);
		}
		
	}
		
	}
	


