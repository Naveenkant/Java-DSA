package linkedList.linkedPrac;

public class MylinkedList<E> {
	Node<E> head;
	
	public void add(E data) {
		
		Node<E> toAdd  = new Node<E>(data);
		if(isEmpty()) {
			head= toAdd;
			return;
		}
	      		
		Node<E> temp = head;
		while(temp.next !=null) {
			temp  = temp.next;
		}
		temp.next = toAdd;
	}
	public boolean isEmpty() {
		return head ==null;
	}
	
	public E removeLast() throws Exception {
		Node<E> temp = head;
		
		if(temp==null) {
			throw new Exception("cannot remove last element from empty list");
		}
		
		if(temp.next==null) {
			Node toRemove = head;
			head= null;
			return(E) toRemove.data;
		}
		
		while(temp.next.next !=null) {
			temp  = temp.next;
		}
		Node toRemove = temp.next;
		temp.next=null;
		return(E) toRemove.data;
	}
	
	
	public E getLast() throws Exception{
Node<E> temp = head;
		
		if(temp==null) {
			throw new Exception("cannot get last element from empty list");
		}
		while(temp.next !=null) {
			temp  = temp.next;
		}
		return temp.data;
	}
	
	void print() {
		Node<E> temp = head;
		while(temp !=null) {
			System.out.println(temp.data+"  ");
			temp  = temp.next;
		}
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
