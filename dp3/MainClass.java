package dp3;

import java.util.Arrays;

public class MainClass {

	 static int editDistance(String s1, String s2) {
			int n = s1.length();
			int m = s2.length();
			
			int dp[][] = new int[n+1][m+1];
//			for(int i = 0; i<=n; i++) {
//				Arrays.fill(dp[i], -1);
//			}
			
			return editDistanceTabular(s1, s2, n, m, dp);
//			return editDistanceRecursion(s1, s2, n, m, dp);
		}
	 
	 static int editDistanceTabular(String s1, String s2, int n, int m, int dp[][]) {
		 for(int i = 0; i<=m; i++) {
			 dp[0][i] = i;
		 }
		 for(int i = 0; i<=n; i++) {
			 dp[i][0] = i;
		 }
		 for(int i = 1; i<=n; i++) {
			 for(int j = 1; j<=m; j++) {
				 if(s1.charAt(i-1) == s2.charAt(j-1)) {
					 dp[i][j] = dp[i-1][j-1];
				 } else {
					 dp[i][j] = Math.min(Math.min(
							 dp[i-1][j], 
							 dp[i][j-1]), 
							 dp[i-1][j-1]) + 1;
				 }
			 }
		 }
		 
		 for(int i = 0; i<=n; i++) {
			 for(int j = 0; j<=m; j++) {
				 System.out.print(dp[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 return dp[n][m];
	 }
		
	static int editDistanceRecursion(String s1, String s2, int n, int m, int dp[][]) {
		if(n == 0) return m;
		if(m == 0) return n;
		
		if(dp[n][m] != -1) return dp[n][m];
		
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			return dp[n][m] =  editDistanceRecursion(s1, s2, n-1, m-1, dp);
		} else {
			return dp[n][m] = Math.min(Math.min(editDistanceRecursion(s1, s2, n-1, m, dp), 
					editDistanceRecursion(s1, s2, n, m-1, dp)), 
					editDistanceRecursion(s1, s2, n-1, m-1, dp)) + 1;
		}
	}
	
	static int minimumJumps(int a[]) {
		int dp[] = new int[a.length+1];
		
		Arrays.fill(dp, -1);
		minimumJumps(a, 0, dp);
		
		for(int e: dp) {
			System.out.print(e+" ");
		}
		
		return dp[0];
	}
		
	static int minimumJumps(int a[], int i, int dp[]) {
		if(i >= a.length-1) {
			return 0;
		}
		
		if(dp[i] != -1) return dp[i];
		
		if(a[i] == 0) return Integer.MAX_VALUE;
		
		int min = Integer.MAX_VALUE;
		for(int j = 1; j<=a[i]; j++) {
			min = Math.min(min, minimumJumps(a, i+j, dp) + 1);
		}
		
		return dp[i] = min;
	}
	
	public static void main(String[] args) {
//		String s1 = "abcde";
//		String s2 = "padelm";
//		
//		System.out.println(editDistance(s1, s2));
		
		int a[] = {3, 2, 4, 1, 3, 5, 1, 1, 2};
		
		System.out.println(minimumJumps(a));

	}

}
