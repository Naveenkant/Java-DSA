package linkedList.again_;

import java.util.*;

public class SelfRun {

	public static void main(String[] args) throws Exception {
	MainLinkedList  myll = new MainLinkedList();
	
	myll.addLast(1);
	myll.addLast(2);
	myll.addLast(3);
	myll.addLast(5);
	

	myll.deletemid(3);
	myll.deletefront();
	
myll.print();

		

	}

	

}
