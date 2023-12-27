package geeksforgeeks;

public class PalindromeString {

	public static void main(String[] args) {
	

	}
	int isPlaindrome(String S){
		boolean ispalin =true;
		for(int i =0;i<S.length();i++) {
			if(S.charAt(i)!=S.charAt(S.length()-1-i)) {
				ispalin = false;
				break;
			}
		}
		if(ispalin)return 1;
		else return 0;
	}
}
