package geeksforgeeks;

import java.util.Scanner;

public class RearrangeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = 5;
long[] a= {4,0,2,1,3};
arrange(a,n);

	}
	 static void arrange(long a[], int n){
		 long b[]=new long[n];
	     for(int i =0;i<n;i++) {
	    	 b[i]=a[(int) a[i]];
	     }
	     for(int i =0;i<n;i++) {
	    	 a[(int) i]=b[(int) i];
	    	 System.out.print(a[(int) i]+" ");
	     }
	    }
}
