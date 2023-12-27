package builderPattern;

public class MainClass {

	public static void main(String[] args) {
		User user1=new User.UserBuilder().setUserEmail("hello").getUser();
		System.out.println(user1.getUserEmail());
	}

}
