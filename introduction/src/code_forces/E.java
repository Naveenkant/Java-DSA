package code_forces;
import java.util.*;
public class E {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
		}
	}
 int gcd(int a,int b) {return a%b==0?b:gcd(b,a%b); }

 long fastpow(long a,long b) {
	long res=1;
	while(b>0) {
		if((b&1)==1) 
		res=(res*a)%1000000007;
		a=(a*a)%1000000007;
		b=b>>1;
	}
	return res;
}
 boolean[] seiveOfEratosthenes(int n ) {
	boolean isPrime[] = new boolean [n+1];
	Arrays.fill(isPrime, true);
	isPrime[0]=false;
	isPrime[1]=false;
	for(int i=2;i*i<=n;i++) {
		for(int j=2*i;j<=n;j+=i) {
			isPrime[j]=false;
		}
	}
	return isPrime;

}
static boolean isprime(int n){
    if (n <= 1) return false;
    else if (n == 2) return true;
    else if (n % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(n); i += 2)
        if (n % i == 0) return false;
    return true;   
}	
int nCr(int n, int r) {
	int p = 1, k = 1;
	if (n - r < r)
		r = n - r;
 
	if (r != 0) {
		while (r>0) {
			p *= n;
			k *= r;
			int m = gcd(p, k);
 
			p /= m;
			k /= m;
 
			n--;
			r--;
		}
	}
 
	else p = 1;
	return p;
}
}


