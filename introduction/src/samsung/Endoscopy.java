package samsung;
import java.io.*;

import java.util.*;
class Node{
    int x;
    int y;
    int l;
    Node(int x,int y,int l){
        this.x=x;
        this.y=y;
        this.l=l;
    }
}
 class qq{
    static int front ;
    static int back;
    int capacity;
    static Node queue[];

    qq(int c){
        front=back=0;
      
        capacity=c;
        queue=new Node[c];
    }
    static void add(Node ele){
    	queue[back++]=ele;
    	System.out.println(back);
    }
    static Node poll(){
        return queue[front++];
    }
    static boolean isEmpty(){
        return front==back;
    }
}

class Endoscopy {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int r=sc.nextInt();
            int c=sc.nextInt();
            int l=sc.nextInt();
               int mat[][]=new int [n][m];
               boolean vis[][]=new boolean[n][m];
            for(int i=0;i<n;i++){
                for(int j =0;j<m;j++){
                  mat[i][j]=sc.nextInt();
                }
            }

            if(mat[r][c]>0){
                System.out.println(solve(r,c,l,vis,mat));
            }else{
                System.out.println(0);
            }

        }

    }
    static   boolean isValid(int i,int j,int row,int col){
            return (i<row && i>=0 && j<col && j>=0);
        }
    static   boolean left(int mat[][],int x,int y){
            if(mat[x][y]==1 || mat[x][y]==3 ||
             mat[x][y]==6 || mat[x][y]==7)return true;
            return false;
        }
    static  boolean right(int mat[][],int x,int y){
            if(mat[x][y]==1 || mat[x][y]==3 ||
             mat[x][y]==4 || mat[x][y]==5)return true;
            return false;
        }
    static  boolean up(int mat[][],int x,int y){
            if(mat[x][y]==1 || mat[x][y]==2 ||
             mat[x][y]==4 || mat[x][y]==7)return true;
            return false;
        }
    static  boolean down(int mat[][],int x,int y){
            if(mat[x][y]==1 || mat[x][y]==2 ||
             mat[x][y]==5 || mat[x][y]==6)return true;
            return false;
        }
       static int solve(int r,int c,int l,boolean vis[][],int mat[][]){
           int ans=0;
        qq queue=new qq(1000000);
        queue.add(new Node(r,c,l));
        vis[r][c]=true;
        int rr=mat.length;
        int cc=mat[0].length;

        while(qq.isEmpty()==false){
            Node cur=qq.poll();
            int row=cur.x;
            int col=cur.y;
            int len=cur.l;
            if(len==0)continue;
            ans++;
             if(isValid(row,col-1,rr,cc) && left(mat,row,col) && 
             right(mat,row,col-1) && !vis[row][col-1]){
                 qq.add(new Node(row,col-1,len-1));
                 vis[row][col-1]=true;
             }
             if(isValid(row,col+1,rr,cc) && right(mat,row,col) && 
             left(mat,row,col+1) && !vis[row][col+1]){
                 qq.add(new Node(row,col+1,len-1));
                 vis[row][col+1]=true;
             }
             if(isValid(row-1,col,rr,cc) && up(mat,row,col) && 
             down(mat,row-1,col) && !vis[row-1][col]){
                 qq.add(new Node(row-1,col,len-1));
                 vis[row-1][col]=true;
             }
             if(isValid(row+1,col,rr,cc) && down(mat,row,col) && 
             up(mat,row+1,col) && !vis[row+1][col]){
                 qq.add(new Node(row+1,col,len-1));
                 vis[row+1][col]=true;
             }
                    }
                    return ans;
       }
    }

