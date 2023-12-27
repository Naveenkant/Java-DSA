package code_forces;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef {
static int MOD=1000000007;
	public static void main(String[] args) {
		
		 try {
			   
				FastReader sc = new FastReader();
				    int t=sc.nextInt();
				    while(t-->0){


				    	String s=sc.next();
				    	StringBuilder sb=new StringBuilder(s);
				    	int n=s.length();
				    	int total=0;
				    for(int i=0;i<n;i++) {
				    	if(i==n-1&&sb.charAt(i)=='N') {
				    		sb.setCharAt(i, 'P');
				    		total++;
				    	}
				    	if(i-1>=0&&sb.charAt(i-1)=='N'&&sb.charAt(i)=='N') {
				    		sb.setCharAt(i, 'P');
				    		total++;
				    	}
				    }
				    int tn=0;
				    for(int i=0;i<n;i++) {
				    	if(sb.charAt(i)=='N')tn++;
				    }
int reqn=n/3;
total=total+Math.abs(reqn-tn);
				    System.out.println(total);
				    }
		 }
				    catch(Exception e)
				    {
				        return;
				    }
				    
	}
	
	

}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(
            new InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() { return Integer.parseInt(next()); }

    long nextLong() { return Long.parseLong(next()); }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try {
            str = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

