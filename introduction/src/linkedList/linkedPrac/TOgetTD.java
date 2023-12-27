package linkedList.linkedPrac;

import java.util.*;

public class TOgetTD {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll= new LinkedList<>();
		
		getTimeDiff(al);		
		getTimeDiff(ll);
		
		

	}
	public static void getTimeDiff(List<Integer>list) {
		long start = System.currentTimeMillis();
		
		for(int i = 0;i<10000000;i++) {
			list.add(i);
		}
			long end = System.currentTimeMillis();
			System.out.println(list.getClass().getName()+" "+ (end-start));
     
     
		
	}

}
