package sets.prac;

import java.util.*;

public class HasSet {

	public static void main(String[] args) {
		Set <Integer> set = new HashSet<>();
		int a []= {3,4,-1,4,3,-6,7,2};
 
		boolean founded = false;
		int sum = 0;
		
		for( int elements: a) {
			set.add(sum);
			if(sum==0) {
				founded = true;
				break;
			}
			if(founded) break;
		}
		if(founded) {
		System.out.println("yes the subarray is present ");
		
		}else {
			System.out.println("no there is no subarray present ");
		}
		for(int i =0;i<a.length;i++) {
//			int sum = 0;
//			for(int j = i;j<a.length;j++) {
//			
//				sum+=a[j];
//				if(sum==0) {
//					founded = true;
//					
//					break;
//				}
//				
//			}
//			if(founded)  break;
//				
//			}
//		if(founded) {
//			System.out.println("yes there is subarray present");
//		}else {
//			System.out.println("no there is no subarray present");
		
		
		
		
		
			
		
	}

}
}
