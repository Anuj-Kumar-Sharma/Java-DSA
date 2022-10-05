package dp5;

import java.util.Arrays;

public class MainClass {

	static int matrixChainMultiplication(int a[]) {
		int n = a.length;
		int dp[][] = new int[n][n];
		
		for(int len = 2; len<n; len++) {
			for(int row = 0, col = len; row<n-len; row++, col++) {
				
				dp[row][col] = Integer.MAX_VALUE;
				for(int k = row+1; k<col; k++) {
					dp[row][col] = Math.min(dp[row][col], 
							dp[row][k] + dp[k][col] + a[row]*a[k]*a[col]);
				}
				
			}
		}
		
		return dp[0][n-1];
		
	}
	
	static int palindromicPartitioningProblem(char[] s) {
		int n = s.length;
		int dp[][] = new int[n][n];
		
		for(int len = 1; len<n; len++) {
			for(int row = 0, col = len; row<n-len; row++, col++) {
				if(isPalindrome(s, row, col)) {
					dp[row][col] = 0;
				} else {
					dp[row][col] = Integer.MAX_VALUE;
					for(int k = row; k<col; k++) {
						dp[row][col] = Math.min(dp[row][col], 
								dp[row][k] + dp[k+1][col] + 1);
					}
				}
			}
		}
		
		
		return dp[0][n-1];
	}
	
	static boolean isPalindrome(char[] s, int i, int j) {
		while(i < j) {
			if(s[i] != s[j]) return false;
			i++; j--;
		}
		return true;
	}
	
	static int optimalStrategy(int a[], int i, int j) {
		int n = a.length;
		int dp[][] = new int[n][n];
		for(int x[]: dp) {
			Arrays.fill(x, -1);
		}
		optimalStrategy(a, i, j, dp);
		
		for(int x[]: dp) {
			for(int e: x) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
		return dp[0][n-1];
	}
	
	
	static int optimalStrategy(int a[], int i, int j, int dp[][]) {
		if(i+1 == j) return dp[i][j] = Math.max(a[i], a[j]);
		
		if(dp[i][j] != -1) return dp[i][j];
		
		int left = a[i] + Math.min(optimalStrategy(a, i+2, j, dp), optimalStrategy(a, i+1, j-1, dp));
		
		int right = a[j] + Math.min(optimalStrategy(a, i+1, j-1, dp), optimalStrategy(a, i, j-2, dp));
		
		return dp[i][j] = Math.max(left, right);	
	}
	
	static void learnDiagonalMatrix() {
		int n = 5;
		
		for(int len = 0; len<n; len++) {
			for(int row = 0, col = len; row<n-len; row++, col++) {
				
				System.out.print("("+row+","+col+")");
				
			}
			System.out.println();
		}
	}
	
	static int countBSTWithNKeys(int n) {
		int dp[] = new int[n+1];
		dp[0] = 1;
		
		for(int i = 1; i<=n; i++) {
			int res = 0;
			for(int j = 0; j<i; j++) {
				res += dp[j] * dp[i-j-1];
			}
			dp[i] = res;
		}
		
		for(int e: dp) {
			System.out.print(e+" ");
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		
//		learnDiagonalMatrix();
		
//		int a[] = {2, 3, 1, 2, 5};
//		System.out.println(matrixChainMultiplication(a));
		
//		String s = "abacc";
//		System.out.println(palindromicPartitioningProblem(s.toCharArray()));
		
//		int a[] = {1, 10, 2, 10, 100, 30};
//		System.out.println(optimalStrategy(a, 0, a.length-1));
		
		int n = 10;
		System.out.println(countBSTWithNKeys(n));
	}

}
