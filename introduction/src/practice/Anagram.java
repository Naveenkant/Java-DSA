package practice;

public class Anagram {

	public static void main(String[] args) {
        boolean isAnagram = true;
		String a = "Naveen";
		String b = "aveeNn";
		 
		
		int al[]= new int [256];
		
		int bl[]=new int [256];
		
		for(char c :a.toCharArray()) {
		int  index =(int) c;
		al[index]++;
		
		}
		for(char c :b.toCharArray()) {
			int  index =(int) c;
			bl[index]++;
			
			}
		for(int i = 0;i<256;i++) {
			if(al[i]!=bl[i]) {
				isAnagram = false;
				
			}
			
		}
		if(isAnagram) {
			System.out.println("the two strings are anagrams");
		}else{
			System.out.println("the two strings are not anagram");
		}
	}

}
