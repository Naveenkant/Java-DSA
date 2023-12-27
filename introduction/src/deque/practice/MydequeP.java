package deque.practice;

public class MydequeP<E> {
Node<E> head,tail;
	public void addToHead(E data) {
		Node<E> toadd = new Node<>(data);
		if(head==null) {
			head = tail = toadd;
		}head.next  = toadd;
		toadd.prev= head;
		head = toadd;
		
		
	}
	
	public E removefromTail() {
		if(head==null) {
			return null;
		}
		Node<E> toremove = tail;
		tail = tail.next;
		tail.prev = null;
		
		if(tail==null) {
			head =null;		}
	return toremove.data;
	}
	public void addtoTail(E data) {
		Node<E> toAdd = new Node(data);
		if(tail ==null) {
			tail = head = toAdd;
			
		}
		tail.prev = toAdd;
		toAdd.next = tail;
		tail = toAdd;
	}
	public E removefromHead() {
		if(head==null) {
			return null;
		}
		if(head==null) {
			tail=null;
		}
		Node<E> toremove = head;
		head=head.prev;
		head.next = null;
		
		return toremove.data;
		
	}
	void print() {
		Node<E> temp = tail;
		while(temp!=head.next) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public class Node<E>{
		 E data;
		 Node<E> next,prev;
		 
		 public Node(E data) {
			 this.data = data;
			 this.next = null;
			 this.prev = null;
		 }
		
	}

}
