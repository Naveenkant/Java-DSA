package recursion;

public class Circle_Gungame {

	public static void main(String[] args) {
		
System.out.println(jos(8,3));
	}
	static int jos(int n,int k) {
	if(n==1)return 0;
	return(jos(n-1,k)+k)%n;
	}

}
