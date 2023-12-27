package array;
import java.util.Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		int beg =0,end=n-1,ser,mid;
//		Boolean b = new Boolean (false);
		
		int []a=new int[n];
		Arrays.sort(a);
		System.out.println("enter the elements of array");
		for(int  i=0; i<n; i++) {
	         a[i]= sc.nextInt();
			
		}
		System.out.println("enter the searching element");
		ser = sc.nextInt();
		while (beg<=end) {
			mid = (beg+end)/2;
			if(a[mid]==ser) {
//				b =true;
				System.out.println("location of the serched number is: "+(mid+1));
				break;
				
			}else if(a[mid]>ser) {
				end = mid - 1;
				
				
			}else if(a[mid]<ser) {
				beg = mid+1;
			
				mid = (beg+end)/2;
			
			} if(beg>end)
			System.out.println("the number is not in the array ");
		}
		}	
	}