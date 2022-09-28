package dp1;

import java.util.Arrays;

public class MainClass {
	
	static int minCoins(int a[], int n) {
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		minCoinsDP(a, n, dp);
		
		for(int e: dp) {
			System.out.print(e+" ");
		}
		
		return dp[n];
	}
	
	static int minCoinsDP(int a[], int n, int dp[]) {
		if(n < 0) return Integer.MAX_VALUE;
		
		if(dp[n] != -1) return dp[n];
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<a.length; i++) {
			min = Math.min(min, minCoinsDP(a, n-a[i], dp));
		}
		return dp[n] = min+1;
	}
	
	static int fib(int n) {
		if(n == 0) return 0;
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		dp[1] = 1;
		
		fibDP(n, dp);
		
		return dp[n];
	}
	
	static int fibDP(int n, int dp[]) {
		if(dp[n] != -1) return dp[n];
		
		return dp[n] = fibDP(n-1, dp) + 
				fibDP(n-2, dp);
	}
	
	static int rodCuttingProblem(int price[], int n) {
		int dp[] = new int[n+1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		
		rodCuttingProblemDP(price, n, dp);
		
//		for(int e: dp) {
//			System.out.print(e+" ");
//		}
//		
		return dp[n];
	}
	
	static int rodCuttingProblemDP(int price[], int n, int[] dp) {
		if(n < 0) return -100000;
		if(dp[n] != -1) return dp[n];
		if(n == 0) return 0;
		
		int max = -1;
		for(int i = 0; i<price.length; i++) {
			max = Math.max(max, price[i] + rodCuttingProblemDP(price, n-i-1, dp));
		}
		
		return dp[n] = max;
	}
	

	public static void main(String[] args) {
		
//		int a[]= {8, 6, 1};
//		int n = 15;
//		
//		System.out.println(minCoins(a, n));
		
//		int n = 0;
//		System.out.println(fib(n));
		
		int price[] = {3, 6, 10, 9, 12};
		int n = 300;
		
		System.out.println(rodCuttingProblem(price, n));
		
	}

}
