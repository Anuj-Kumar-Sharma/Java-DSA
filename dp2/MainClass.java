package dp2;

import java.util.Arrays;

public class MainClass {
	
	public int longestCommonSubsequence(String a, String b) {
        int m = a.length();
		int n = b.length();
		
		int dp[][] = new int[m+1][n+1];
		// for(int i = 0; i<=m; i++) {
		// 	Arrays.fill(dp[i], -1);
		// }
		int ans =  lcsTabular(a, b, m, n, dp);
		
		// for(int i = 0; i<=m; i++) {
		// 	for(int j = 0; j<=n; j++) {
		// 		System.out.print(dp[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
		
		return ans;
    }
    
    int lcsTabular(String a, String b, int m, int n, int dp[][]) {
        for(int i = 1; i<=m; i++) {
            for(int j = 1; j<=n; j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    
    int lcs(String a, String b, int m, int n, int dp[][]) {
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(dp[m][n] != -1) return dp[m][n];
		
		if(a.charAt(m-1) == b.charAt(n-1)) {
			return dp[m][n] =  lcs(a, b, m-1, n-1, dp) + 1;
		} else {
			return dp[m][n] = Math.max(lcs(a, b, m-1, n, dp), lcs(a, b, m, n-1, dp));
		}
	}
	
	
	
	public static void main(String[] args) {
		String a = "APBDT";
		String b = "LAT";
		
		System.out.println(longestCommonSubsequence(a, b));
	}

}
