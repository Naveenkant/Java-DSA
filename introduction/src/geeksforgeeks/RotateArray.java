package geeksforgeeks;

import java.util.*;

public class RotateArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
while(t-->0) {
	ArrayList<Integer> al = new ArrayList();	
	ArrayList<Integer> bl = new ArrayList();

	int n= sc.nextInt();
	int k = sc.nextInt();
	int a[]=new int[n];
	for(int i =0;i<n;i++) {
		a[i] =sc.nextInt();
				}
	
	for(int i =0;i<k;i++) {
		al.add(a[i]);

	}
	for(int i =k;i<n;i++) {
		bl.add(a[i]);

	}
	bl.addAll(al);
	
	for(int i =0;i<n;i++) {
		System.out.print(bl.get(i)+" ");
		
	}
}

	}

}
