package array.prac;

public class Merge_sort {
	static int a[];
	static int b [];
	public static void main(String[] args) {

		int input[]= {3,45,67,11,23,0};
		Merge_sort ob = new Merge_sort();
		ob.mergesort(0,input.length-1);
		for(int k=0;k<b.length;k++) {
			System.out.println(b[k]+" ");
		}
	}

	private  void mergesort(int low, int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergesort(low, mid);
			mergesort(mid+1,high);
			
			merge(low,mid,high);
			
		}
		
	}

	private  void merge(int low, int mid, int high) {
		
		int i = low;
	int	j = mid+1;
		int h = low;
		a=new int[6];
		b=new int[6];
		while(i<=mid&&mid+1<=high) {
			if(a[i]<=a[j]) {
				b[h]= a[i];
				i++;
				
			}else {
				b[h]=a[j];
				j++;
				
			}
			h++;	
		}
		if(i>mid) {
			for(int k = j;k<=high;k++) {
				b[h]= a[k];
				h++;
			}
			if(j>high) {
				for(int k = i;k<=mid;k++) {
					b[h]=a[k];
					h++;
				}
			}
		}
		
		
	}

}
