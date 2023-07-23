//Fibonacci program in dp (Recursive solution in tabuklation format)

import java.util.*;
class DP {
	public static void main(String[] args) { 
		int n= 5;
		int[] dp = new int[n+1];
		Arrays.fill(dp,-1);
		dp[0] = 0;
		dp[1] = 1;
								
		for(int i=2;i<=n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		System.out.println(dp[n]);
	}
}
//In this Solution We need only last two values but we are maintaining the whole array
//SO in the next solution we will consider dp[i-1]=prev1 and dp[i-2] = prev2

// 0 1 2 3 4 5 6  7  8 
//  0 1 1 2 3 5 8 13 21 ...
