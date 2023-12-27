package practice;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int games []= {2,2,2,2,2,2};
		int win[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[]winposition: win) {
			System.out.println(winposition[0]);
			System.out.println(winposition[1]);
			System.out.println(winposition[2]);
			
		}
		
	}

}
