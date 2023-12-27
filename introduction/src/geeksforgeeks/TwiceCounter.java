package geeksforgeeks;

import java.util.*;

public class TwiceCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String a[]= {"geeks","for","geeks"};
System.out.println(countWords(a,n));
	}
	static public int countWords(String list[], int n){
		Map<String,Integer> map =new HashMap<>();
		for(int i =0;i<list.length;i++) {
			if(!map.containsKey(list[i])) {
				map.put(list[i], 1);
			}else {
				int value = map.get(list[i]);
				value++;
				map.replace(list[i], value);
			}
		}
		int cnt=0;
		for(String s:map.keySet()) {
			if(map.get(s)==2) {
				cnt++;
			}
		}
		return cnt;
      
    }
}
