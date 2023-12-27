package practice;

import java.util.Scanner;

public class MoocJava {

	public static void main(String[] args) {


Scanner sc = new Scanner (System.in);
System.out.println("enter any number");
int n = sc.nextInt();
int sum =0,i;

for( i  =1; i<n; i++) {
	


if((2*i)%3==0) {
	sum +=2*i;
	System.out.println(sum);
}
}
	}
}

