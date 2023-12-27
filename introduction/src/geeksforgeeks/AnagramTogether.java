package geeksforgeeks;

import java.util.*;

public class AnagramTogether {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	Map<String,List<String>> map=new HashMap<>();
	
	String w[] = {"act","god","cat","dog","tac"};
	
	System.out.println(Anagrams(w));
	}
public static List<List<String>> Anagrams(String[] string_list) {
	 Map<String,List<String>> map=new HashMap<>();
     for(String s :string_list) {
     char arr[]=s.toCharArray();
     Arrays.sort(arr);
     String ss = new String(arr);
     if(!map.containsKey(ss)) {
     	map.put(ss,new ArrayList<String>());
     }
     map.get(ss).add(s);
     }
     return new LinkedList<>(map.values());
     
    }
}
