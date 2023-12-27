package code_forces;
import java.util.*;

import java.lang.*;
class Graph1{
public static void  main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();

    int f[]=new int[n+2];
    int i;
 
    f[0] = 0;
    f[1] = 1;
 
    for(i = 2; i <= n; i++){
       f[i] = f[i - 1] + f[i - 2];
    }
   System.out.println(f[n-1]);
    }
}
