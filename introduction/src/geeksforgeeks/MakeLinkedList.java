package geeksforgeeks;

public class MakeLinkedList<E> {

	public class Node<E> {
	public	E data;
public		Node<E> next;
		
		Node (E d){
			data = d;
			next = null;	
		}
			
		}
	Node head;
			public void addToLast(E data){
				
			
				Node <E> newAdd = new Node<E>(data);
				Node<E> temp = head;
				if(head==null) {
					head  = newAdd;
				}else {
					while(temp.next!=null) {
						temp= temp.next;
						
						
					}
					temp.next = newAdd;
				}
			}
			public E removeLast() throws Exception {
				Node  toRemove = null ;
				Node <E> temp = head;
				
				if(temp==null) {
					
					throw new Exception("can't remove last element from the empty ll");
						}
				if(temp.next==null) {
					toRemove    =temp;
					temp = null;
					return(E) toRemove.data;
				}
				
					while(temp.next.next!=null) {
						temp = temp.next;
					
					}
					 toRemove= temp.next ;
					temp.next  = null;
				
				return (E) toRemove.data;
				
}
			// this is the method to print reverse linked list
			public void print(Node head) {
		    Node<E> temp = head;
		    
		    if(head==null)

		        return;
		             else
		    print(head.next);
		    
		    System.out.println(head.data);
		             
		    return;
				
				}
		   
				
			
			 public int size() {
				 Node <E> temp = head;
			    int count = 0;
			   while(temp!=null) {
				   count++;
				   temp= temp.next;
			   }
			   return(int) count;
				 
			    }
			 public boolean isEmpty() {
				 Node<E> temp = head;
				 if(head==null) {
					 return true;
				 }else {
					 return false;
				 }	 
			 }
			 public boolean isContains(E data) {
				Node <E> temp = head;
				while(temp.next!=null) {
					temp   =temp.next;
					if(temp.data==data) {
						return true;
					}else {
						return false;
					}
				}
				return false;
 
			 }	
			 
			}
	


