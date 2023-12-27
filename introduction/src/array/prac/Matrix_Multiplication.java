package array.prac;

import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int c[][]=new int[3][3];
		int sum = 0;
		int a[][]= {{1,2,3},{3,0,1},{-1,6,8}};
	int	b[][] = {{2,0,1},{3,-5,2},{2,2,2}};
		for(int i= 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k = 0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				
			}
		}
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(c[i][j]+" ");
		}
			System.out.println();
		}
	}

}
