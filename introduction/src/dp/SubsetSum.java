package dp;

import java.util.*;

public class SubsetSum {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];

for (int i = 0; i < n; i++) {
    a[i] = sc.nextInt();
  
}

if(check(a,n)) {
	boolean pp=true;
	while(pp) {
for(int i=0;i<n;i++) {
	if((a[i]&1)==0) {
		a[i]/=2;
	}else {
		System.out.println(1);
		System.out.println(i+1);
		pp=false;
		break;
	}
}
	}
}else {
	System.out.println(0);
}

	}
static boolean check(int a[],int n) {
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=a[i];
	}
	if((sum&1)==1) {
		return false;
	}
	boolean dp[][]=new boolean[n+1][sum/2+1];
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=sum/2;j++) {
			if(i==0&&j==0) {
				dp[i][j]=true;
			}else if(i==0) {
				dp[i][j]=false;
			}else if(j==0) {
				dp[i][j]=true;
			}else {
				if(dp[i-1][j]==true) {
					dp[i][j]=true;
				}else {
					int val=a[i-1];
					if(j>=val) {
						if(dp[i-1][j-val]==true) {
							dp[i][j]=true;
						}
					}
				}
			}
		}
		}
		return dp[n][sum/2];
	
}

}
