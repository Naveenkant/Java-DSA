package array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
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

			System.out.println("result of array c");
			for(int i = 0;i<rows;i++) {
				for(int j = 0;j<cols;j++) {
//					System.out.print(c[i][j]+" ");
					c[i][j]=0;      
					for(int k=0;k<2;k++)      
					{      
					c[i][j]+=a[i][k]*b[k][j];      
					
				}
					System.out.print(c[i][j]+" ");
		
			}
				System.out.println();
				}
	}

}
