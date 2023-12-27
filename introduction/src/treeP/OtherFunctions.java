package treeP;

import java.util.*;

public class OtherFunctions extends TreeTraversal{

	public static void main(String[] args) {
		Node root =new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		
//		Node root = createTree();
//System.out.println(getSize(root));
//		System.out.println(WidthOfTree(root));\
//System.out.println(BTTODLL(root));
		printSpiral(root);
	}
	
	//this function will give the total nodes of tree
static int getSize(Node root) {
	if(root==null)return 0;
	else 
		return 1+getSize(root.left)+getSize(root.right);
}

// this function will give us the maximum value among complete tree
static int getMax(Node root) {
	if(root==null) {
		return Integer.MIN_VALUE;
	}
	else 
		return Math.max(
				root.key, Math.max( 
			   getMax(root.left), getMax(root.right)));
}

// this function will tell us how our tree looks from the left side
void PrintLeftView(Node root) {
	if(root==null)return;
	Queue<Node>q = new LinkedList<Node>();
	q.add(root);
	while(q.isEmpty()==false) {
		int count =q.size();
		for(int i=0;i<count;i++) {
			Node curr=q.poll();
			if(i==0)System.out.println(curr.key+" ");
			if(curr.left!=null)q.add(curr.left);
			if(curr.right!=null)q.add(curr.right);
		}		
	}
}
// Children Sum Property
boolean isCsum(Node root) {
	if(root==null)return true;
	if(root.left==null&&root.right==null)return true;
	int sum=0;
	if(root.left!=null) {
		sum+=root.left.key;
	}
	if(root.right!=null) {
		sum+=root.right.key;
	}
	isCsum(root.left);
	return (root.key==sum&&isCsum(root.left)&&isCsum(root.right));
}
// Function to check whether a binary tree is balanced or not.
/*  boolean isBalanced(Node root)
{
if (root==null)return true;
int l=height(root.left);
int r = height(root.right);
// here isBalanced in return will check for every node
if(Math.abs(l-r)<=1&&isBalanced(root.left)&&isBalanced(root.right))return true;
else return false;

}  */
public static int isBalanced(Node root){
    if(root==null)
        return 0;
    int lh=isBalanced(root.left);
    if(lh==-1)return -1;
    int rh=isBalanced(root.right);
    if(rh==-1)return -1;
    
    if(Math.abs(lh-rh)>1)
        return -1; 
    else
        return Math.max(lh,rh)+1;
}

// Maximum Width of binary tree
// hint is to use level order traversal
static int WidthOfTree(Node root) {
		if(root==null)return 0;
		Queue<Node>q = new LinkedList<Node>();
q.add(root);
int max =0;
while(q.isEmpty()==false) {
	
	int  c=q.size();
if(max<c)
	max=c;
	for(int i=0;i<c;i++) {
		Node cur=q.poll();

		if(cur.left!=null)q.add(cur.left);
		if(cur.right!=null)q.add(cur.right);
	}
}
	return max;
}

 // Convert binary tree to Doubly Linked List
static Node prev = null;
static Node head=null;
static  Node BTTODLL(Node root) {
	if(root==null)return root;
	 head = BTTODLL(root.left);
	
	if(prev==null) {
		head = root;
	}
	else {
		root.left=prev;
		prev.right=root;
	}
	prev=root;
	BTTODLL(root.right);
	return head;
}

// Construct a tree from inorder and preorder traversal
// Here we can reduce the time complexity O(n*n) to O(n)
//by using hashSet by store pre[]data as its key and indexes in in[] as values
int preindex=0;
Node cTree(int in[],int pre[],int is,int ie) {
	if(is>ie)return null;
	Node root =new Node(pre[preindex++]);
	int inIndex = 0;
	for(int i=is;i<=ie;i++) {
		if(in[i]==root.key) {
			inIndex=i;
			break;
		}
	}
	root.left=cTree(in,pre,is,inIndex-1);
	root.right=cTree(in,pre,inIndex+1,ie);
	return root;
}

 // here we will print the tree in spiral form
// left to right and right to left
static void printSpiral(Node root) {
//if(root==null)return ;
//Queue<Node> q = new LinkedList<>();
//Stack<Integer>s = new Stack<>();
//boolean reverse = false;
//
//q.add(root);
//while(q.isEmpty()==false) {
//	int len=q.size();
//	for(int i=0;i<len;i++) {
//		Node cur=q.poll();
//		if(reverse)s.push(cur.key);
//		else System.out.print(cur.key+" ");
//		
//		if(root.left!=null)q.add(root.left);
//		if(root.right!=null)q.add(root.right);
//	}
//	if(reverse) {
//		while(s.isEmpty()==false) {
//			System.out.print(s.pop()+" ");
//		}
//	}
//	reverse=!reverse;
//	System.out.println();
//}
	if(root==null)return ;
	Stack<Node>s1 = new Stack<>();
	Stack <Node>s2=new Stack<>();
	s1.push(root);
	while(!s1.isEmpty()||!s2.isEmpty()) {
	while(!s1.empty()) {
		Node temp = s1.peek();
		s1.pop();
		System.out.print(temp.key+" ");
		
		if(temp.right!=null)s2.add(temp.right);
		if(temp.left!=null)s2.add(temp.left);
	}
	while(!s2.empty()) {
		Node temp = s2.peek();
		s2.peek();
		System.out.print(temp.key+" ");
	
		if(temp.left!=null)s1.add(temp.left);
		if(temp.right!=null)s1.add(temp.right);
	}
	}
}
// Diameter of Binary Tree(Naive solution)
/* int Diameter(Node root){
	 if(root==null)return 0;
	 int d1 =1+height(root.left)+height(root.right);
	 int d2 =Diameter(root.left);
	 int d3 = Diameter(root.right);
	 return Math.max(d1,Math.max(d2, d3));	
}
*/
 // Diameter of Binary Tree(Efficient Solution)
int res=0;
 int DiameterHt (Node root) {
	 if(root==null)return 0;
	 int lh=DiameterHt(root.left);
	 int rh=DiameterHt(root.right);
	 res=Math.max(res, 1+lh+rh);
	 return 1+Math.max(lh, rh);
			 }
 // Lowest Common Ancestor(LCA)(Naive Solution)
 boolean findPath(Node root,ArrayList<Node> p,int n) {
	 if(root==null)return false;
	 p.add(root);
	 if(root.key==n)return true;
	 if(findPath(root.left,p,n)||findPath(root.right,p,n)) {
		 return true;
	 }
	 p.remove(p.size()-1);
	 return false;
 }

 Node LCA(Node root,int n1,int n2) {
	 ArrayList<Node>path1=new ArrayList<>();
	 ArrayList<Node>path2=new ArrayList<>();
	 if(findPath(root,path1,n1)==false||findPath(root,path2,n2)==false) {
		 return null;
	 }
	 for(int i=0;i<path1.size()-1&&i<path2.size()-1;i++) 
		 if(path1.get(i+1)!=path2.get(i+1)) 
			 return path1.get(i);
	return null;	 
	 
 }
}
