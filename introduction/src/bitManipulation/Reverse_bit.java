package bitManipulation;

import java.util.Scanner;

public class Reverse_bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sum=0;
		long a =sc.nextLong();
		long b =0;
		for(long i =0;i<32;i++) {
			long k =a&1;
			b<<=1;
			b|=k;
			a>>=1;
		
		}
		System.out.println(b);

	}

}
