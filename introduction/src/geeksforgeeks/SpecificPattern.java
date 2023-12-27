package geeksforgeeks;

import java.util.*;

public class SpecificPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String>al =new ArrayList<>();
		al.add("abb");
		al.add("abc");
		al.add("xyz");
		al.add("xyy");
		String pattern ="foo";
System.out.println(f(al,pattern));

	}
	public static ArrayList<String> f(ArrayList<String>dict,String pattern){
		ArrayList<String>al =new ArrayList<>();
		for(int i =0;i<dict.size();i++) {
			
			if(hash(dict.get(i)).contentEquals(hash(pattern))) {
				
				al.add(dict.get(i));
			}
		}
		return al;
	}

	static String hash(String  s) {
		Map<Character,Integer>map=new HashMap<>();
		int sum=0;
		String f ="";
		for(int i =0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				sum++;
				map.put(s.charAt(i), sum);
				f+=sum;
			}else {
				int value=map.get(s.charAt(i));
				f+=value;
			}
		}
		return f;
	}
}
