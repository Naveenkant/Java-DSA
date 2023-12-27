package methods;
class Dog {
	 int legs ;
	 
}
public class PassByValue {

	public static void main(String[] args) {
		
//int c = 445;
//int d =33;
//  swap(c,d);
//  System.out.println(c+"  "+d);

//	  Dog c  =new Dog();
//		c.legs=4;
//		Dog d = new Dog();
//		d.legs=5;
//		swap(c,d);
//		System.out.println(c.legs+"  "+d.legs);
		Dog c  =new Dog();
		c.legs = 4;
		changeDog(c);
		System.out.println(c.legs);
	}

 static	void swap(int a, int b ) {
	
		int temp = a;
		a = b;
		b= temp;
		
	}
 static void swap(Dog a,Dog b) {
	 Dog temp  =a;
	 a = b; 
	 b = temp;
 }
 static void changeDog (Dog dog) {
	 dog.legs = 8;
 }
 
}
