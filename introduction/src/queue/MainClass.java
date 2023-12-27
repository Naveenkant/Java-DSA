package queue;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {

		MyQueue <Integer> mq= new MyQueue<>();
		
		mq.enqueue(12);
		mq.enqueue(1);
		mq.enqueue(132);
		mq.enqueue(1235);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());

		System.out.println(mq.dequeue());

		System.out.println(mq.dequeue());

	}

}
