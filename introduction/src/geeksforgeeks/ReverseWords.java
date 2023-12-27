package geeksforgeeks;

import java.util.*;

public class ReverseWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println(reverseWords("i.like.this.program.very.much"));
String s ="i.like.this.program.very.much";
	}
	static String reverseWords(String s) {
		ArrayList<String>al = new ArrayList<>();
		String f="";
		String p ="";
		String ff="";
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)=='.') {
				al.add(f);
				f="";
			}else
			f+=s.charAt(i);
			if(i==s.length()-1)al.add(f);
		}
		
		for(int i=al.size()-1;i>=0;i--) {
			p+=al.get(i);
			p+='.';
		}
		ff=p.substring(0,p.length()-1);
	return ff;
       
    }
}
