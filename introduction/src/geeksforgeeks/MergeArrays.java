package geeksforgeeks;

import java.util.*;

public class MergeArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int k = sc.nextInt();
int a[][]=new int[k][k];
for(int i =0;i<k;i++) {
	 for(int j =0;j<k;j++) {
		 a[i][j]=sc.nextInt();
	 }
}
System.out.println(mergeKArrays(a,k));

	}
	 public static ArrayList<Integer> mergeKArrays(int[][] a,int k) 
	    {
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 for(int i =0;i<k;i++) {
			 for(int j =0;j<k;j++) {
				 al.add(a[i][j]);
			 }
		 }
		 
Arrays.sort(al.toArray());


			return al ;
	    
	    }

}
