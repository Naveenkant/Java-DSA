package geeksforgeeks;

public class CountNode {

	

		class Node{
		    int data;
		    Node next;
		    Node(int a){ 
		    	this.data = a;
		    	this.next = null; 
		    	}
		}
//		class CountNodes{
		    



		    public int getCount(Node head)
		    {
		        
		       int length = 0;
//		        Node head1 = head;
		    
		    while(head!=null){
		        head = head.next;
		        length++;
		        
		    }
			return length;
//			 Node t = node.next;
//	         node.data = t.data;
//	         node.next = t.next; 
		        
		    }
		    
		    
		        
		    }
//	}


