package geeksforgeeks;

public class TestMyLL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MakeLinkedList mll = new MakeLinkedList();
		

		mll.addToLast(34);
		mll.addToLast(35);
		mll.addToLast(36);
		mll.addToLast(37);
		mll.addToLast(38);
		
//		mll.removeLast();
		mll.print(mll.head);
//		System.out.println(mll.size());
//		if(mll.isEmpty()) {
//			System.out.println("the list is empty");
//		}else {
//			System.out.println("the list is not empty");
//		if(mll.isContains(45)) {
//			System.out.println("yes it is present in the list");
//		}else {
//			System.out.println("no it is not present in the list");
//		}
		System.out.println();
		
	}

}
