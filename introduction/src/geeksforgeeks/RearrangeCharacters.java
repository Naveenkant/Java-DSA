package geeksforgeeks;

import java.util.*;

public class RearrangeCharacters {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
int t =sc.nextInt();
while(t-->0) {
	Map<Character , Integer> map = new HashMap<>();
	String s = sc.next();
	int len = s.length(); 
	int l=s.length()/2;;
	if((len&1)==0) {
		 l+=1;
	}else {
		l+=2;
	}
	
	 for(int i =0;i<s.length();i++) {
	if(!map.containsKey(s.charAt(i))) {
		map.put(s.charAt(i), 1);
	}else {
		int value=map.get(s.charAt(i));
		value++;
	map.replace(s.charAt(i), value);
	}

}
	 boolean noti = true;

 
	 for(char ch : map.keySet()) {
		 if(map.get(ch)>=l) {
			 noti=false;
			 break;
		 }
	 }
	 if(noti)System.out.println("1");
	 else System.out.println("0");	 
	
	}

	}

}
