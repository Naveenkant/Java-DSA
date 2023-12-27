package vectorAndStacks;

import linkedList.linkedPrac.MylinkedList;
import linkedList.linkedPrac.MylinkedList.Node;

public class MyStack<E> {
Node<E> head;
	private MylinkedList<E> ll = new MylinkedList<>();
	
	
	
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty is not allowed");
			
		}
		return (E) ll.removeLast();
		}
		
	E peek() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("peeking  from empty is not allowed");
			
		}
		return (E) ll.getLast();
		
	}
	 public static class Node<E>{
   	  public E data;
   	  public Node<E> next;
   	  
   	  public Node(E data) {
   		  this.data = data;
   		  next = null;
   	  }
     }
	
}
