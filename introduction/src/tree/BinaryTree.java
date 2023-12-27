package tree;

public class BinaryTree {

	public static void main(String[] args) {
		binarytree a= new binarytree();
		Node root = a.createNewNode(2);
		root.left=a.createNewNode(7);
		root.right=a.createNewNode(5);
		root.left.left=a.createNewNode(2);
		root.right.right = a.createNewNode(9);
		root.right.right.left=a.createNewNode(4);
		root.left.right=a.createNewNode(6);
		root.left.right.left=a.createNewNode(5);
		root.left.right.right=a.createNewNode(11);
System.out.println();
	}
	 static class Node{
		int data;
		Node left;
		Node right;
		
	}
	 static class binarytree{
		public Node createNewNode(int k ) {
			Node a = new Node();
			a.data=k;
			a.left=null;
			a.right=null;
			return a;
		}
	}

}
