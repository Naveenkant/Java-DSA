package samsung;
import java.util.*;
public class SpaceshipDijkstra {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int sx=sc.nextInt();
            int sy=sc.nextInt();
            int dx=sc.nextInt();
            int dy=sc.nextInt();
            int x[]=new int[n*2+2];
            int y[]=new int[n*2+2];
            x[0]=sx;x[1]=dy;y[0]=sy;y[1]=dy;
            
            int graph[][]=new int[n*2+2][n*2+2];
            for(int i[]:graph)Arrays.fill(i,-1);
            for(int i=2;i<n*2+2;i+=2){
                int x1=sc.nextInt();
                int y1=sc.nextInt();
                int x2=sc.nextInt();
                int y2=sc.nextInt();
                x[i]=x1;y[i]=y1;x[i+1]=x2;y[i+1]=y2;
                int dist=sc.nextInt();
                graph[i][i+1]=graph[i+1][i]=dist;
            }
            for(int i=0;i<n*2+2;i++){
                for(int j=i+1;j<n*2+2;j++){
                    if(i>=2 && i%2==0){
                        if(j == i+1)
                        continue;
                    }
                    graph[i][j]=Math.abs(x[i]-x[j])+Math.abs(y[i]-y[j]);
                    graph[j][i]=Math.abs(x[i]-x[j])+Math.abs(y[i]-y[j]);
                }
            
            }
            System.out.println(dijkstra(graph,n));
            }
           
        
        }
   static int findmin(int dist[],boolean vis[],int n){
        int node=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n*2+2;i++){
            if(vis[i]==false && dist[i]!=Integer.MAX_VALUE &&  dist[i]<min){
                min=dist[i];
                node=i;
            }
        }
        return node;
    }
    static int dijkstra(int graph[][],int n){
        boolean vis[]=new boolean[n*2+2];
        int dist[]=new int[n*2+2];
        Arrays.fill(dist,Integer.MAX_VALUE);
        // vis[0]=true;
        dist[0]=0;
        for(int i=0;i<n*2+1;i++){
            int u=findmin(dist,vis,n);
            vis[u]=true;
            for(int v=0;v<2*n+2;v++){
            if(!vis[v] && dist[u]!=Integer.MAX_VALUE && graph[u][v]!=-1 &&  dist[u]+graph[u][v] <dist[v]){
                dist[v]=dist[u]+graph[u][v];
            }
                
                }
        }
        return dist[1];
    }
    }
