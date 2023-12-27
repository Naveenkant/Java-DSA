package geeksforgeeks;

import java.util.*;

public class WordsPhoneDigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Map<Integer,String>map =new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
//		System.out.println(map);
		String s = "abc";
		String cur = "";
		subseq(s,0,cur);
//int n =sc.nextInt();
int arr[]= {2,3,4};
	}
	static void subseq(String s,int i,String cur) {
		
		if(i==s.length()) {
			System.out.println(cur);
			return;
		}
		subseq(s,i+1,cur+s.charAt(i));
		subseq(s,i+1,cur);
	}
	 
}
