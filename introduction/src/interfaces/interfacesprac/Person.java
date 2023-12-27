 package interfaces.interfacesprac;

public   class Person implements Student , Youtuber{

	public static void main(String[] args) {
		Person obj = new Person();
		obj.study();
		
		
		
	}

public 	void study() {
System.out.println("person is studying");		
	}
public void makVideo() {
	System.out.println("person is making a good video");
}

@Override
public void editVideo() {
	// TODO Auto-generated method stub
	
}
}
