package recursion;

public class Advance_recursion {
	static int rows;
	static int cols;

	public static void main(String[] args) {
		int a[]= {1,5,7,3,2,4,8,9,0,0,0,0};//This code will work for n = even only;
		System.out.println(coinMax(a,0,a.length-1));
//	int a[][]= {{1,1,1,1,1,1,1,1},
//				{1,1,1,1,1,1,0,0},
//				{1,0,0,1,1,0,1,1},
//				{1,2,2,2,2,0,1,0},
//				{1,1,1,2,2,0,1,0},
//				{1,1,1,2,2,2,2,0},
//				{1,1,1,1,1,2,1,1},
//				{1,1,1,1,1,2,2,1}};
//	floodFill(a,0,0,3,1);
//printMatrix(a);
//		}
//		
//	
//	static void floodFill(int a[][],int r, int c , int toFill, int prevFill) {
//		rows =a.length;
//		 cols = a[0].length;
//		if(r<0||r>=rows||c<0||c>=cols) {
//			return ;
//		}
//		if(a[r][c]!=prevFill) {
//			return ;
//			
//		}
//		a[r][c]=toFill;
//		floodFill(a,r-1,c,toFill,prevFill);
//		floodFill(a,r,c-1,toFill,prevFill);
//		floodFill(a,r+1,c,toFill,prevFill);
//		floodFill(a,r,c+1,toFill,prevFill);
//	}
//	static void printMatrix(int a[][]) {
//		for(int i =0;i<rows;i++) {
//			for(int j =0;j<cols;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
	}
	static int coinMax(int a[],int l,int r) {
		if(l+1==r) {
			return Math.max(a[l], a[r]);
		}
		return Math.max(a[l]+Math.min(coinMax(a,l+2,r), coinMax(a,l+1,r-1)),
				a[r]+Math.min(coinMax(a,l+1,r-1),coinMax(a,l,r-2)));
		
	}
	
}
