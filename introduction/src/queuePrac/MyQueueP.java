package queuePrac;


public class MyQueueP<E> {

	public  class Node<E>{
	public E data;
	public Node<E> next;
	
	public Node(E data) {
		this.data = data;
		next = null;
	}
	}
	private Node <E>head, rear;
	public void enqueue(E e) {
		Node<E> toAdd = new Node(e);
		if(head==null) {
			head = rear = toAdd;
		}
		rear.next = toAdd;
	    rear = rear.next;
	}

	public E dequeue() {
		if(head==null) {
			
			return null;
		}
		Node<E> temp = head;
		head = head.next;
		
		
		if(head==null) {
			rear = null;
		}
			return  temp.data;
		
	}
}
