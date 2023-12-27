package practice;

import java.util.Scanner;

public class StringINput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s1=sc.next();
//        int x=sc.nextInt();
        if (s1.length()<15){
            
            for(int j= s1.length();j<15;j++){
            System.out.print(" ");
            }

        }
        System.out.printf(s1);
	}

}
