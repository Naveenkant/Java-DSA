package geeksforgeeks;

import java.util.Scanner;

public class ReverseStringStack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
			
		    int pos1=0,pos2=0;
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int a []= new int[n];
		    for(int i = 0;i<n;i++){
		        a[i]=sc.nextInt();
		        
		    }
		    for(int i = 0;i<n;i++){
		    for(int j =i;j<n-1;i++){
		    	int sum = 0;
		        for(int l= i;l<=j;l++){
		            sum+=a[l];
		        }
		            if(k==sum){
		                pos1= i+1;
		                 pos2=j+1;
		                break;
		            }
		        }
		    

		    }
		    System.out.print(pos1+" "+pos2);
		    
		}
}

}
