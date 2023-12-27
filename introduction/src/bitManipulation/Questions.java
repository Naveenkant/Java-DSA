package bitManipulation;

import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	  System.out.println("kusnef");
	  String  s=sc.next();
//		String s ="naveen";
		char[] c=s.toCharArray();
	int len = c.length;
//System.out.println(palin("9999999"));
//	if(isPalindrome(c))
		
	if(len%2==0) {
		
			if(c[len/2-1]<c[len/2]) {
				
				c[len/2-1]++;
//				System.out.println(c[len/2]);
				for(int i =0;i<len;i++) {
					c[len-i-1]=c[i];
				}
				for(char ci :c) {
					System.out.print(ci);
				}
			}else if(c[len/2-1]>c[len/2]) {
				for(int i =0;i<len;i++) {
					c[len-i-1]=c[i];
				}
				for(char ci :c) {
					System.out.print(ci);
				}		
			}else if(c[len/2-1]==c[len/2]) {
				if(c[len/2-1]==9) {
					if(c[len/2-2]<9) {
						c[len/2-2]++;
						c[len/2-1]=0;
						for(int i =0;i<len;i++) {
							c[len-i-1]=c[i];
						}
						for(char ci :c) {
							System.out.print(ci);
						}
					}
				}
					if(c[len/2]>c[len/2+1]) {
						for(int i =0;i<len;i++) {
							c[len-i-1]=c[i];
						}
						for(char ci :c) {
							System.out.print(ci);
						}
					}else if(c[len/2]<c[len/2+1])
						c[len/2-1]++;
					for(int i =0;i<len;i++) {
						c[len-i-1]=c[i];
					}
					for(char ci :c) {
						System.out.print(ci);
					}
				}
	}
	
	
	}
//	static boolean palin(String s) {
//		char c[] = s.toCharArray();
//		boolean pal = true;
//		for(int i=0;i<c.length;i++) {
//			if(c[i]!=c[c.length-1-i]) {
//				pal = false;
//			}
//		}
//		return pal;
//		static int reverse(int A) {
//		      
//	        int sum =0;
//	       
//	// boolean palin =false;
//	   
//	    if(A>0) {
//	    while(A>0) {
//	        int lastdigit = A%10;
//	        sum=sum*10+lastdigit;
//	       
//	        A/=10;
//	    }
////	     if(sum==temp)palin =true;
//	    }else {
//	        while(A<0) {
//	            int lastdigit = A%10;
//	            sum=sum*10+lastdigit;
//	         
//	            A/=10;
//	        }
////	         if(sum==temp)palin= true;
//	    }
//	    if(A>Integer.MAX_VALUE||A<Integer.MIN_VALUE)
//	    return 0;
//	    else return sum;
//	    }
//		
//		public static void main(String[] args) {
//			
//			
//			
//			Scanner sc =new Scanner(System.in);
//	int n = sc.nextInt();
//	System.out.println(reverse(n));
//	}
	}
//}
