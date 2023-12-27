package practice;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		String s = Integer.toString(n);
		if(n == Integer.parseInt(s)) {
			System.out.println("good job");
		}else {
			System.out.println("wrong answer");
		}

	}

}
