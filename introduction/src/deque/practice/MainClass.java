package deque.practice;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		MydequeP<Integer> ad = new MydequeP<>();
	ad.addToHead(3);
	ad.addToHead(4);
	ad.addToHead(5);
	ad.addToHead(6);
	ad.addtoTail(2);
	ad.addtoTail(1);
	
	System.out.println(ad.removefromTail());
	System.out.println(ad.removefromTail());
	System.out.println(ad.removefromTail());
	System.out.println(ad.removefromHead());
	ad.print();
	
	
	}
	

}
