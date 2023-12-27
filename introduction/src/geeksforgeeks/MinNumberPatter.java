package geeksforgeeks;

import java.util.*;

public class MinNumberPatter {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
int t =sc.nextInt();
while(t-->0) {
	String s= sc.next();
	findMinFromPattern(s);
	System.out.println();
}
	}
	static void findMinFromPattern(String s){
		Stack st = new Stack<>();
		for(int i=0;i<=s.length();i++){
			st.push(i+1); 

			if(s.length()==i || s.charAt(i)=='I' ){ 
				while(!st.empty()){ 
					System.out.print(st.peek());
					st.pop();
				}
			}
		}
	}
}
