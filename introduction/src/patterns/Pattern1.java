package patterns;

public class Pattern1 {

	public static void main(String[] args) {
//		there are two methods to do this pattern 
//		method no.1
		
//		int n = 5;
//		
//		for(int i =0; i<=n; i++) {
//			for(int j =i; j<=n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println( );
//		}
//		
//		method no. 2
		int n = 5;
		for (int i =1; i<=n;i++) {
			for (int j =1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
