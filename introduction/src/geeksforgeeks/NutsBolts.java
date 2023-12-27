package geeksforgeeks;

import java.util.*;

public class NutsBolts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n  = 5;
				char nuts[] = {'@', '%', '$','#', '^'};
			char	bolts[] = {'%', '@', '#', '$', '^'};
matchPairs(nuts,bolts,n);
	}
	static void matchPairs(char nuts[], char bolts[], int n) {

	     	 
	      
	      Arrays.sort(nuts);
	      Arrays.sort(bolts);
	      
	    }
}
