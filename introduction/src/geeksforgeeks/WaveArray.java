package geeksforgeeks;
import java.util.*;
public class WaveArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
		}
convertToWave(a,n);
	}
 static void convertToWave(int arr[], int n){
	ArrayList<Integer> al = new ArrayList<>();
	ArrayList<Integer> bl = new ArrayList<>();	
	ArrayList<Integer> cl = new ArrayList<>();

	
        for(int i =1;i<n;i+=2) {
        	al.add(arr[i]);
        }
        for(int i =0;i<n;i+=2) {
        	bl.add(arr[i]);
        }
        for(int i =0;i<n/2;i++) {
//    		System.out.print(al.get(i)+" ");
    		cl.add(al.get(i));
//    		System.out.print(bl.get(i)+" ");
    		cl.add(bl.get(i));
    	}
        if((n&1)==1) {
//        	System.out.println(bl.get(n/2));
        	cl.add(bl.get(n/2));
        	
        }
        for(int i =0;i<n;i++) {
        	arr[i]=cl.get(i);
        	
        }
        	
        }
      
     
    }

