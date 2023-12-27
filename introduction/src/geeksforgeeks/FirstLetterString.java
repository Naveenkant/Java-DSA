package geeksforgeeks;

import java.util.*;

public class FirstLetterString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

String s="geeks for geeks";
System.out.println(firstAlphabet(s));
	}
	static String firstAlphabet(String S) {
		String m ="";
		m+=S.charAt(0);
		for(int i =1;i<S.length();i++) {
			if(S.charAt(i)==' ') {
				m+=S.charAt(i+1);
			}
		}
		return m;
      
    }

}
