package array;

import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {

//		int a[][]= new int [5][3];
//		System.out.println(a[3][1]);
		
//		int b[][]= {{2,1,3,5,6,0},{6,67,4,4},{5,6,7,8,9,0}};
//		System.out.println(b[0][2]);
		// hello my name is naveen kumar and what are you doing my brother is reading biology because tommorow is his paper of biology
		
		// now ques. on matrix
		Scanner sc = new Scanner (System.in);
	   System.out.println("enter the row size");
		int rows = sc.nextInt();
		System.out.println("enter the columns size");
		int cols = sc.nextInt();
		
		int a[][]= new int [rows][cols];
		int b[][]= new int [rows][cols];
		System.out.println("enter the values of first matrix");

		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
							a[i][j]= sc.nextInt();
				
			}
		}
		System.out.println("enter the values of second matrix");
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				
				b[i][j]= sc.nextInt();
		
	}

}

		int c [][]= new int [rows][cols];
		for(int i = 0;i<rows;i++) {
			
			for(int j = 0;j<cols;j++) {
				c[i][j]= a[i][j]+b[i][j];
		
			}
		}
		System.out.println("result array c is :");
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
				

			}
			System.out.println();
		}
}
}