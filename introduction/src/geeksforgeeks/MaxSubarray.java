package geeksforgeeks;

import java.util.*;

public class MaxSubarray {

	private static final int Integer_MIN = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
			int	arr[] = {1,2,3,4,5,6,7,8,9,-50};
			System.out.println(maxSubarraySum(arr,n));;
	}
	static int maxSubarraySum(int a[], int n){
		
		int maxsum=Integer.MIN_VALUE;
		int cursum=0;
		for(int i =0;i<n;i++) {
			cursum+=a[i];
			if(cursum>maxsum) {
				maxsum=cursum;
			}
			if(cursum<0) {
				cursum=0;
			}
		}
		return maxsum;
	    
	   
	    
	}
}
