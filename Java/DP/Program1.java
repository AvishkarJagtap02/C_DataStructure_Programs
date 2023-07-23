//Fibonacci program using Dynamic programming
//memoization
import java.util.*;
class DP {
	public static int fibo(int n , int[] dp) {
		
		if(n<=1) {
			return n;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
	}
	public static void main(String[] args) { 
		int n= 5;
		int dp[] = new int[n+1];		//TC => O(N)
							//SC => O(N)
		Arrays.fill(dp,-1);
		System.out.println(fibo(n,dp));
	}
}
