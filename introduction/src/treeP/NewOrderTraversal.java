package treeP;
import treeP.TreeTraversal;
import java.util.*;

public class NewOrderTraversal extends TreeTraversal{

	public static void main(String[] args) {
		NewOrderTraversal f = new NewOrderTraversal();
	Node root =	f.createTree();
	printLevelOrder(root);
	}
	// Method 1
	void printLevel(Node root) {
		if(root==null)return;
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		while(q.isEmpty()==false) {
			Node curr=q.poll();
			if(curr.left!=null)
				q.add(curr.left);
			if(curr.right!=null)
				q.add(curr.right);
		}
	}
	// Method 2
	static void printLevelOrder(Node root) {
		if(root==null)return;
		Queue<Node>q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(q.size()>1) {
			Node curr =q.poll();
			if(curr==null) {
				System.out.println();
				q.add(null);
				continue;
			}
			System.out.print(curr.key+" ");
			if(curr.left!=null) q.add(curr.left);
			if(curr.right!=null) q.add(curr.right);
		}
	}
	// Method 3
	void printLevelOrderLine(Node root) {
		if(root==null)return;
		Queue<Node>q = new LinkedList<Node>();
q.add(root);

while(q.isEmpty()==false) {
	int  c=q.size();
	for(int i=0;i<c;i++) {
		Node cur=q.poll();
		System.out.println(cur.key+" ");
		if(cur.left!=null)q.add(cur.left);
		if(cur.right!=null)q.add(cur.right);
		
	}
	System.out.println();
}
	}
	
}
