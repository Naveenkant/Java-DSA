package oops;
import oops.A.B;
import oops.A.C;
public  class StaticKeyword {

	 static class Person {
		int age;
		String name ;
		
		static String breed="Homosapiens";
	}
	
	public static void main(String[] args) {
		// static
		 A objA = new A();
		 B objB = objA.new B();
		C objC =new C(); 
		
		
	}

}
