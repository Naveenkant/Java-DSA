package methods;

public class Introduction {
// here main is also a method
	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber  =45;
		int result = maxOf(firstNumber,secondNumber);
		
		maxOf(66,77);
		maxOf(55,8);
		
		System.out.println(result);   		
		sayHi();
		sayHi();
		maxOf(44);
	}

	static int maxOf(int a , int b) {
		// it shows pass by reference after declaring the values of a and b according to me but i am in doubt here 
//		a=99;
//		b=890;
		if (a>b) {
			return a;
		}else {
				return b;
				
		}
	}
	static int maxOf(float b) {
		return 0;
	}
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("good morning");
	}
	
}
