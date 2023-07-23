//Fibonacci program using with space complexity O(1)

import java.util.*;
class DP {
/*	public static int fibo(int n , int[] dp) {
		
		if(n<=1) {
			return n;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
	}*/
	public static void main(String[] args) { 
		int n= 5;
		int prev2 = 0;					//SC => O(1)
		int prev1 = 1;					//TC => O(N)
								
		for(int i=2;i<=n;i++) {
			int curri = prev1 + prev2;
			prev2 = prev1;
			prev1 = curri;
		}
		System.out.println(prev1);
	}
}// 0 1 2 3 4 5 6  7  8 
//  0 1 1 2 3 5 8 13 21 ...
