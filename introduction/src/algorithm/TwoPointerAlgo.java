package algorithm;
//import java.lang.reflect.Array;
import java.util.*;
public class TwoPointerAlgo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		boolean cas = false;
		int n  = sc.nextInt();
		int a[]= new int [n];
		Arrays.sort(a);
		for(int i = 0; i<n;i++) {
			a[i]= sc.nextInt();
			
		}
		int i = 0,j=a.length-1;
while(i<j) {
	if(a[i]+a[j]>x) {
		j--;
	}else if(a[i]+a[j]<x) {
		i++;
	}else {
		System.out.println("true");
	}
		
	
}
System.out.println("false");
		
	}

}
