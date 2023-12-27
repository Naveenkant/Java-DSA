package treeP;
import java.util.*;
 class Node{
	
	public static int key ;
	public Node left;
public 	Node right;
public	Node(int k){
		key = k;
	}
}
public class TreeTraversal {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	
		 Node root =createTree();
System.out.println(preorder(root));
	System.out.println(height(root));
	}
	
	 public static Node createTree() {
			Node root =null;
			System.out.println("Enter data");
		int data = sc.nextInt();
				if(data==-1)return null;
				 root=new Node(data);

					System.out.println("enter left for "+data);
					root.left=createTree();
					System.out.println("enter right for "+data);
					root.right=createTree();
					return root;
			
		}
	 
	 static ArrayList<Integer> preorder(Node root)
	    {
	        ArrayList<Integer>al = new ArrayList<>();
	        
//	        if(root==null)return al;
	        
	        al.add(root.key);
	       
	        preorder(root.left);
	        preorder(root.right);
	        return al;
	    }
	
static void inorder(Node root) {
	if(root!=null) {
		inorder(root.left);
		System.out.println(root.key);
		inorder(root.right);
	}
	
}
static void preOrder(Node root) {
	if(root==null)return ;
	
	System.out.print(root.key+" ");
	preOrder(root.left);
	preOrder(root.right);

}
static void postOrder(Node root) {
	if(root==null)return ;
	postOrder(root.left);
	postOrder(root.right);

	System.out.print(root.key+" ");
}
static int height(Node root) {
	// Time complexty is O(n);
	// Auxiliary space is required is h+1;
	if(root==null)return 0;
	else
		return Math.max(height(root.left), height(root.right))+1;
	
}
void printKdist(Node root, int k) {
	if(root==null)return;
	if(k==0) {
		System.out.println(root.key+" ");
	}else {
		printKdist(root.left,k-1);
		printKdist(root.right,k-1);
	}
}
}
