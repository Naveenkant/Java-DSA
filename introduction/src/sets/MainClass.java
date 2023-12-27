package sets;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {

		Set<Integer> x = new HashSet<>();
		Set<Integer> set = new HashSet<>();
		x.add(2);
		x.add(34);
		x.add(5);
		
		Set<Integer> y = new HashSet<>();
//		y.add(21);
		y.add(12);
//		y.add(15);
		System.out.println(x.containsAll(y));
//		System.out.println(x);
		
	}

}
