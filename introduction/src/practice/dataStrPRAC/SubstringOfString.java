package practice.dataStrPRAC;
import java.util.*;

public class SubstringOfString {

	
	public static void main(String[] args) {

		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("enter the main string names quantity");
		 int n = sc.nextInt();
		 System.out.println("enter the sub string names quantity");
		 int m  = sc.nextInt();
		 int count = 0;
		 int count1 = 0;
		 int []ans = new int[m];
		 String[] str = new String [n];
		 String[] sub = new String [m];
		 System.out.println("now enter main str  names");
		 for(int i = 0;i<n;i++) {
			  sc.nextLine();
			 str[i]=sc.next();
		 }
		 
		 System.out.println("now enter the sub str names");
		 for(int i = 0;i<m;i++) {
			 sc.nextLine();
			 sub[i]=sc.next();
		 }
		
			 for(int j = 0;j<m;j++) {
				
               count = 0;
				 
				 for(int i  =0;i<n;i++) {
				 if(str[i].equals(sub[j])) {
					 count++;
				 }
				 
			 }
				 
			 ans[j]= count;
		 }
			 
			 for(int j = 0;j<m;j++) {
				 System.out.println(ans[j]);
			 }
		 
	}

}
