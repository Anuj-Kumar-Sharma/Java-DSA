package doubtsRecursion;

import java.util.Arrays;

public class MainClass {
	
	static int maxRods(int N, int a, int b, int c, int[] dp) {
		if(N == 0) return dp[N] = 0;
		if(N < 0) return -1; 
		
		if(dp[N] != -2) return dp[N];
		
		int cutA = maxRods(N-a, a, b, c, dp);
		int cutB = maxRods(N-b, a, b, c, dp);
		int cutC = maxRods(N-c, a, b, c, dp);
		
		int res = Math.max(cutA, Math.max(cutB, cutC));
		
		if(res == -1) return dp[N] = -1;
		
		return dp[N] = res + 1;
	}
	
	static boolean subSetSum(int sum, int a[], int N) {
		if(sum < 0) return false;
		if(N < 0) return false;
		
		if(sum == 0) return true;
		
		return subSetSum(sum-a[N], a, N-1) ||
				subSetSum(sum, a, N-1);
		
	}
	
	public static void main(String[] args) {
//		int N = 25;
//		int a = 6;
//		int b = 7;
//		int c = 13;
//		
//		int dp[] = new int[N+1];
//		Arrays.fill(dp, -2);
//		
//		System.out.println(maxRods(N, a, b, c, dp));
//		
//		for(int i = 0; i<=N; i++) {
//			System.out.println(i+" "+dp[i]);
//		}
		
		int a[] = {3, 34, 4, 12, 5, 2};
		int sum = 31;
		
		System.out.println(subSetSum(sum, a, a.length-1));
	}

}
