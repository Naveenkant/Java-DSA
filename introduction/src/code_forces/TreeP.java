package code_forces;
import java.util.*;
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val){
		this.val=val;
	}
}
public class TreeP {
	public static void main(String[] args) {
		
	
HashMap<Integer,Integer>map=new HashMap<>();
String s="";
StringBuilder sb=new StringBuilder();
	}
	 public TreeNode createBinaryTree(int[][] d) {
	        class pair{
	            TreeNode root;
	            boolean check;
	            public pair(TreeNode root,boolean check){
	                this.root=root;
	                this.check=check;
	            }
	        }
	        pair vis[]=new pair[100000+1];
	        for(int i=0;i<d.length;i++){
	          int a=d[i][0];
	            int b=d[i][1];
	            if(vis[a]==null){
	                TreeNode f=new TreeNode(d[i][0]);
	                vis[a]=new pair(f,false);
	            }
	            if(vis[b]==null){
	                TreeNode s=new TreeNode(d[i][1]);
	               vis[b]=new pair(s,true);
	            }
	            vis[b].check=true;
	            if(d[i][2]==1){
	                vis[a].root.left=vis[b].root;
	            }else{
	                vis[a].root.right=vis[b].root;
	            }
	        }
	        for(int i=0;i<d.length;i++){
	            int a=d[i][0];
	            if(vis[a].check==false)return vis[a].root;
	        }
			return null;
	    }
	
}