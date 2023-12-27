package patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n,i,j;
		char c ='A';
		char d='F';
		System.out.println("enter the number of rows");
	  n = sc.nextInt();
	  for(int t = 1;t<=2*n-1;t++) 
		  if(t<=n) {
		  System.out.print("" + c);
		  c++;
//		  break;
		  
		  } else if(t>n) {
			  System.out.print(""+ d);
			  d--;
//			  break;
		  }
		  System.out.println();
	  
//	  for(i = 1; i<=n;i++) {
//		  for( j = 1;j<=2*n-2*i;j++){
//		        if(j==n-i+1){
//		            for(int k=1;k<2*i-1;k++){
//		               System.out.print(" ");
//	  }
//
//	}
//		        System.out.print("*");
//
//}
//		  System.out.println();
//	  }
		  
	  for(i =1; i<=n;i++) {
		  
		  for(j =1,c='A',d='F';j<=2*n-1;j++) {
			  
			  if(j>=1&&j<=n-i) {
				  System.out.print(""+ c++);
				  
			  }else if(j>=n+i&&j<=2*n-1) {
				  System.out.print(""+ d--);
				  
			  }else {
				  System.out.print(" ");
			  }
			  
				  
		  }
		  
		  System.out.println();
		  
		  
	  }
	}
}
		  
	  
