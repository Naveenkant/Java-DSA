package interview;
import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		List<List<String>>e=new ArrayList<>();
		List<String>f=new ArrayList<>();
		f.add("INSERT");
		f.add("milk");
		f.add("4");
		List<String>s=new ArrayList<>();
		s.add("INSERT");
		s.add("coffee");
		s.add("3");
		List<String>t=new ArrayList<>();
		t.add("VIEW");
		t.add("_");
		t.add("_");
		List<String>fo=new ArrayList<>();
		fo.add("INSERT");
		fo.add("pizza");
		fo.add("5");
		List<String>fi=new ArrayList<>();
		fi.add("INSERT");
		fi.add("gum");
		fi.add("1");
		List<String>si=new ArrayList<>();
		si.add("VIEW");
		si.add("_");
		si.add("_");
		e.add(f);
		e.add(s);
		e.add(t);
		e.add(fo);
		e.add(fi);
		e.add(si);

		System.out.println(getItems(e));
}
	    static String HI = String.valueOf((char)(127)); 
	    
	    static int kthPrice;
	    static String cur;  
	    static TreeMap<Integer, TreeSet<String>> map = new TreeMap<>(createMapEntry());	    

	static List<String>getItems(List<List<String>>entries){
		List<String>result=new ArrayList<>();
		for(int i=0;i<entries.size();i++) {
			List<String>cur=entries.get(i);
			if(cur.get(0).equals("INSERT")) {
				insert(cur.get(1),Integer.parseInt(cur.get(2)));
			}else {
				result.add(view());
			}
		}
		return result;
		
	}
	   
	    static  void insert(String name, int price){
	        if (map.size() == 1){
	            kthPrice = price;
	            cur = HI;
	        }
	        map.computeIfAbsent(price, o -> new TreeSet<>()).add(name);

	        if (price == kthPrice && name.compareTo(cur) < 0 || price < kthPrice){
	            cur = map.get(kthPrice).lower(cur); 
	        }
	        if (cur == null){ 
	            kthPrice = map.lowerKey(kthPrice);
	            cur = map.get(kthPrice).last();
	        }
	    }

	    static  String view(){
	        String ans = cur;
	        cur = map.get(kthPrice).higher(cur); 
	        if (cur == null){ 
	            kthPrice = map.higherKey(kthPrice);
	            cur = map.get(kthPrice).first();
	        }
	        return ans;
	    }
}