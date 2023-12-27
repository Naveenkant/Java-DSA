package ifelse;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		if(n%4==0) {
			System.out.println(n+ " is the leap year");
		}else {
			System.out.println(n+" is not the leap year");
		}
		System.out.println();
		
	}

}
