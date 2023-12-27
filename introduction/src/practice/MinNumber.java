package practice;

import java.util.Scanner;

public class MinNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
//		int n = sc.nextInt();
		int a []= {45,67,89,78};
		int min = a[0];
//		for (int i = 0; i<n;i++) {
//			a[i]= sc.nextInt();
			for (int  j = 0;j<a.length;j++) {
				if (min>a[j]) {
					min = a[j];
				
				
			}
		}
		System.out.println(min);
	}

}
