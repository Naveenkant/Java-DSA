package polymorphismpraac;

public class MainClass {
	public  static void main(String[] args) {
		
	// runtime poly
	Dog d = new Dog ();
	
	Pet p = d;
System.out.println(d.name);
System.out.println(p.name);

}
	// compile time poly
//	public static void greeting () {
//		System.out.println("hi, dear");
//	}
//	public static void greeting(String a) {
//		System.out.println(a);
//	}
//	public static void greeting (String a , int count) {
//		for(int i=0;i<count;i++) {
//			System.out.println(a);
//		}
//	}
}