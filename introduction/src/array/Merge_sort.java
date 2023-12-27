package array;

public class Merge_sort {
int []array;
int[]tempmergearray;
int length;
	public static void main(String[] args) {

		int input[]= {3,45,67,11,23,0};
		Merge_sort ob = new Merge_sort();
		ob.sort(input);

		for(int i:input) {
			System.out.println(i);
		}
	}

	private void sort(int input[]) {
	this.array = input;
	this.length = input.length;
	this.tempmergearray = new int[length];
	divideArray(0,length-1);
		
	}

	private void divideArray(int lowerindex, int higherindex) {
		if(lowerindex<higherindex) {
			int middle = (lowerindex + (higherindex-lowerindex))/2;
			//It will sort left side array
			divideArray(lowerindex,middle);
			//It will sort right side array
			divideArray(middle+1,higherindex);
			
			mergeArray(lowerindex,middle,higherindex);
		}
		
	}

	private void mergeArray(int lowerindex, int middle, int higherindex) {
	
		for(int i = lowerindex;i<=higherindex;i++) {
			tempmergearray[i]=array[i];
		}
		int i = lowerindex;
		int j = middle+1;
		int k = lowerindex;
		
		while(i<=middle&&j<=higherindex) {
			
			if(tempmergearray[i]>=tempmergearray[j]) {
				array[k]=tempmergearray[i];
				i++;
			}else {
				array[k]=tempmergearray[j];
				j++;
			}
			k++;
			
		}
		while(i<=middle) {
			array[k]= tempmergearray[i];
			i++;
			k++;
			
		}
		
	}

	

}
