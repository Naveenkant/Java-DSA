package recursion;

import java.util.Scanner;

public class Grid_Paths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(grid(a,b));

	}
	static int grid(int n, int m ) {
		if(n==1||m==1)
			return 1;
		return grid(n-1,m)+grid(n,m-1);
	}

}
