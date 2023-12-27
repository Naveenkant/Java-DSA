package vectorAndStacks;
import java.util.*;
public class MainClass {

	public static void main(String[] args) throws Exception {
		
		MyStack<Integer> stack= new MyStack<>();
		Vector<Integer> v=new Vector();
		v.add(4);
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		System.out.println(stack.pop());
	
		System.out.println(stack);
		
	}

}
