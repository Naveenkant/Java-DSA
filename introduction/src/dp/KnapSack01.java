package dp;

public class KnapSack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap=10;
		int w[]= {1,3,4,6};
		int v[]= {20,30,10,50};
		
		
int dp[][]=new int[5][cap+1];
for (int i = 0; i < w.length + 1; i++) {
    dp[i][0] = 0;
}
for (int c= 0; c < cap + 1; c++) {
    dp[0][c] = 0;
}
	for(int i=1;i<=w.length;i++) {
		for(int j=1;j<=cap;j++) {
			
				int maxValWithoutCurr=dp[i-1][j];
				int maxValWithCurr=0;
				
				int weightofCurr=w[i-1];
				if(cap>=weightofCurr) {
					maxValWithCurr=v[i-1];
					
					int remainingcapacity=cap-weightofCurr;
					maxValWithCurr+=dp[i-1][remainingcapacity];
					
				}
				dp[i][j]=Math.max(maxValWithoutCurr,maxValWithCurr);
			}
				
		
		
	}
	System.out.println(dp[w.length][cap]);
}
	public void check() {
		System.out.println("hello");
	}
}
