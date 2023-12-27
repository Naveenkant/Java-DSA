package deque.practice;

import java.util.*;

public class Mypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.offerLast(34);
		ad.offerLast(35);
		ad.offerLast(36);
		ad.offerLast(37);
		ad.offerLast(38);
		
		
//		ad.offerLast(11);
//		ad.offerLast(22);
//		ad.offerLast(33);
		System.out.println(ad);
		System.out.println(ad.peekFirst());
//		System.out.println(ad.peekLast());
		
	}

}
