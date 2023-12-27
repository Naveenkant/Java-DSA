package oops.ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
try {
	int a = 5;
	int b = 0;
	int c = a/b;
	 System.out.println(c);
	 
}catch(ArithmeticException e) {
	System.out.println(e.getMessage()+" occured ,please check it");
}
	System.out.println("Very important code");	
		System.out.println("need to run");
	}

}
