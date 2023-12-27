package array;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

//int a[]= {30,40,50,70,60};
//int max = 0;
//for (int i = 0;i<a.length;i++) {
//	if(a[i]>max) {
//		max  = a[i];
//		
//	}
//	
//}
//System.out.println(max);
//	}
//
//}
// and if we want to take user input then we have to define two loops
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int a[]= new int [n];
		int max = 0;//,min = 0;
		int i, pos1 = 0,pos2 =0 ;
		int min = a[0];
		for( i = 0;i<n; i++) {
			a[i]= sc.nextInt();
			
			for(int j = 0;j<n;j++) {
				if(a[j]>max) {
					max = a[j];
					pos1=j;
				}
//				for(int k = 0;k<n;k++) {
				if (a[j]<min) {
					min = a[j];
					pos2 = j;
				}
				}
			}
//		}
		System.out.println(max +"  " +pos1+"  "+min+"  "+ pos2);
		
		
		
		
		
		
	}
}