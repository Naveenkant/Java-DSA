package linkedList.again_;

import java.util.*;

public class MainLinkedList {
Node head;

public void deletefront() {
	head = head.next;
	
}
public void deletemid(int value) {
	Node tail = null;
	Node temp = head;
	while(temp.data<value) {
		tail = temp;
		temp = temp.next;
	}
	tail.next = temp.next;
	
}
public void addfront(int value) {
	Node toAdd = new Node(value);
	Node temp =head;
	toAdd.next  =head;
	head = toAdd;
}
public void addmid(int value) {
	Node toAdd = new Node(value);
	Node tail = null;
	Node temp = head;
	while(temp.data<=value) {
		tail = temp;		
		temp= temp.next;
	}

	tail.next = toAdd;
	toAdd.next = temp;
	
}
public int deleteLast() throws Exception{
	Node temp = head;
	if(temp==null) {
		throw new Exception("we can't remove elements from empty list");
	}
	if(temp.next== null) {
		Node removal = temp;
		temp = null;
	}
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	Node removal = temp.next;
	temp.next = null;
	
	return removal.data;
	
}

void print() {
	Node temp = head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp =temp.next;
	}
}

 void addLast(int data) {
	Node toAdd  = new Node(data);
	
	if(isEmpty()) {
		head = toAdd;
		return;
	}
	Node temp = head;
	while(temp.next!=null) {
		temp = temp.next;
	}
	temp.next = toAdd;
	
	
}
 boolean isEmpty() {
	 if(head==null) {
		 return true;
	 }else {
		 return false;
	 }
 }
	static class  Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;			
		}
	}
}
