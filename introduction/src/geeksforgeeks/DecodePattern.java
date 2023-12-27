package geeksforgeeks;

import java.util.*;

public class DecodePattern {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			if(n==1) {
				System.out.println(1);
			
			}
			else if(n==2) {
				System.out.println(11);
			
			}else {
			String s = "11";
			
			for(int i =3;i<=n;i++) {
				s+='$';
				int len = s.length();
				int cnt=1;
				String temp="";
				char a[]=s.toCharArray();
				
			for(int j =1;j<len;j++) {
				if(a[j]!=a[j-1]) {
					temp+=cnt;
					temp+=a[j-1];
					
					cnt =1;
				}
				else cnt++;
			}

			s =temp;
			}
			System.out.println(s);
		}
		}

	}

}
