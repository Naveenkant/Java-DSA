package code_forces;
import java.io.*;
 
import java.util.*;

	public class C  {
		
	 	public static void main(String[] args){
	 			
	 	Scanner sc=new Scanner(System.in);
	 	String s=sc.next();
	 	System.out.println(find(s));
	 	}
	 	static int find(String s) {
	 		int hash[] = new int[1000];
	 		 
	 		  for (int i = 0; i < s.length(); i++) 
	 		  {
	 			  char c=s.charAt(i);
	 		    hash[c] = i;
	 		  }
	 		
	 		  int maxIndex = -1;
	 		  int res = 0;
	 		  for (int i = 0; i < s.length(); i++) {
	 			  char c=s.charAt(i);
	 		    maxIndex = Math.max(maxIndex, hash[c]);
	 		    
	 		    if (maxIndex == i) 
	 		    {
	 		      res++;
	 		    }
	 		  }
	 		 
	 		  return res;
	 		
	 	}
	}