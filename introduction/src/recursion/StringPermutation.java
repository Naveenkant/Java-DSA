package recursion;

import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
String s=sc.next();
StringP(s,0,s.length());

	}
static void StringP(String s, int l ,int r) {
	if(l==r) {
		System.out.println(s);
		return;
	}
	for(int i =l;i<=r;i++) {
		swap(s,l,i);
		StringP(s,l+1,r);
		swap(s,l,i);
	}
}
static void swap(String s, int l , int i) {
	int temp = l ;
	l=i;
	i=temp;
}
}
