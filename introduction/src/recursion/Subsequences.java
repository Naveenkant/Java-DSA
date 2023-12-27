package recursion;

import java.util.Scanner;

public class Subsequences {
	static int sum=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String cur="";
		PowerSet(s,0,cur);
		
	
			}
	static void PowerSet(String s , int i ,String cur) {
//		System.out.println(i);
//		System.out.println(sum);
//		sum++;
		if(i==s.length()) {
//			System.out.println(i);
			System.out.println(cur);
			return;
		}
		PowerSet(s,i+1,cur+s.charAt(i));
		PowerSet(s,i+1,cur);
//PowerSet(s,i+1,cur);
	}
	

}
