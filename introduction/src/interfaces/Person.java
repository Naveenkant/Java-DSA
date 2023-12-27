package interfaces;

public class Person implements Student ,Youtuber {

	public static void main(String[] args) {
	
		Person obj = new Person();
//	  obj.makeVideo();
//	  obj.study();
	
		
		Youtuber obj2 = obj;
	obj2.VideoEditing();
	obj2.makeVideo();
	
	
	
	}

	@Override
	public void makeVideo() {
System.out.println("Person is making a good video");		
	}

	@Override
	public void study() {
System.out.println("Person is studying");		
	}

	@Override
	public void VideoEditing() {
		System.out.println("Youtuber is editing");
		
	}

}
