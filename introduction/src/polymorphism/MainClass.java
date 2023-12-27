package polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
//		Dog d = new Dog ();
//		
//		Pet p = d;
//		Animal a = p;
//		
//		d.walk();
//		p.walk();
		
//		Here it prints "dog is walking " in both lines bcoz the objects is of dogs
		
		greetings ("good" ,5);
	}
	public static void greetings () {
		System.out.println("hi there");
	}
	public static void   greetings (String s ) {
		System.out.println(s);
	}
	public static void greetings (String s , int count) {
		System.out.println(s);
	}

}
