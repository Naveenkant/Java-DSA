package vectorAndStacks.MyOwnPrac;

import linkedList.linkedPrac.MylinkedList;
import vectorAndStacks.MyStack.Node;

public class MyStackP <E> {
Node head;
 MylinkedList ll = new MylinkedList();


//	public static class Node{
//		public int data;
//		public Node  next;
//		
//		public Node(int data) {
//			this.data = data;
//			next = null;
//		}
//	}
//	// get max method;
//	public int getMax() {
//		Node temp = head;
//		Node max = head;
//		while(temp.next!=null) {
//			if(max.data < temp.next.data) {
//				max = temp.next;
//				
//			}
//			temp = temp.next;
//		}
//		
//		return max.data;
//		
//	}
//	// print function
////	void print() {
////		Node temp = head;
////		while(temp!= null) {
////			System.out.println(temp.data+" ");
////			temp = temp.next;
////		}
////	}
//	void push (int data) {
//		Node temp = head;
//		Node toAdd = new Node(data) ;
//		if(head==null) {
//			head= toAdd;
//			return;
//		}
//		while(temp.next!=null) {
//			temp = temp.next;
//			
//		}
//		temp.next = toAdd;
//	}
	
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("not allowed");
			
		}
	
		return (E) ll.removeLast();
	}
	E peek() throws Exception {
	return	(E) ll.getLast();
	}

}
