package queue;
import linkedList.linkedPrac.MylinkedList.Node;
public class MyQueue<E> {

      private Node<E> head,rear;
      
      public void enqueue(E e) {
    	  Node<E> toAdd = new Node<E>(e);
    	 
    	  if(head ==null)
    	  {
    		  head = rear= toAdd;
    		 return; 
    	  }
    	  rear.next =toAdd;
    	  rear = rear.next;
    	 
      }
      public  E dequeue() {
    	  Node<E>temp = head;
    	  if(head==null) {
    		  return null;
    	  }
    	  if(head==null) {
    		  rear=null;
    	  }
    	  head = head.next;
    	  return temp.data;
      }
	
}
