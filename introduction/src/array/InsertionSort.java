package array;

public class InsertionSort {

	public static void main(String[] args) {
		
int temp,i,j;
		int a[]= {85,12,59,45,72,51};
		for(i=1;i<=a.length-1;i++) {
			 temp = a[i];
			 j  =i-1;
			while((j>=0)&&(temp<=a[j])){
				a[j+1]=a[j];
				j=j-1;

			}
			a[j+1]=temp;
			
		}
		for(int item:a) {
			System.out.println(a[i]);
		}
	}

}
