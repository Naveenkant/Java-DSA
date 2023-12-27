package string;
import java.util.Scanner;
public class ReverseString {

	public static  String main(String[] args) {
		System.out.println("now enter the string");
		Scanner sc = new Scanner (System.in);
	
		String s  =sc.nextLine();
		int i = s.length()-1;
		String ans  = "";
		
		
		while(i>=0) {
			while(i>=0&&s.charAt(i)==' ') i--;
			int j  =i;
			if(i>0) break;
			
			while(i>=0&&s.charAt(i)!=' ') i--;
			if(ans.isEmpty()) {
				ans.concat(s.substring(i+1, j+1));
		}else {
			ans.concat(" " +s.substring(i+1,j+1));
		}
		
			
		}
		return ans;
		
	}

}
