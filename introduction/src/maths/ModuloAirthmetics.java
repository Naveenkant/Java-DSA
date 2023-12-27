package maths;
public class ModuloAirthmetics {

	public static void main(String[] args) {
	
System.out.println(fastPower(2,100));
	}
	static int fastPower(int a, int b) {
		int res = 1;
	while(b>0) {
	if((b&1)!=0) {
		res=((res%1000000007)*a)%1000000007;
	}
	a=a*a;
	b=b/2;
	}
	return res;
	
	}
static int gcd(int a,int b) {
	if(a==0)return b;
	return gcd(b%a,a);
}
}
