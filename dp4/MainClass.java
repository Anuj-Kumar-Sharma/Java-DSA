package dp4;

import java.util.*;

public class MainClass {
	
	static int longestIncreasingSubsequence(int a[]) {
		int n = a.length;
		int dp[] = new int[n];
		
		dp[0] = 1;
		for(int i = 1; i<n; i++) {
			dp[i] = 1;
			for(int j = 0; j<i; j++) {
				if(a[i] > a[j]) {
					dp[i] = Math.max(dp[i], 
							dp[j]+1);
				}	
			}
		}
		
		int max = 0;
		for(int e: dp) {
			max = Math.max(max, e);
		}
		
		return max;
	}
	
	static int maxSumLIS(int a[]) {
		int n = a.length;
		int dp[] = new int[n];
		
		dp[0] = a[0];
		for(int i = 1; i<n; i++) {
			dp[i] = a[i];
			for(int j = 0; j<i; j++) {
				if(a[i] > a[j]) {
					dp[i] = Math.max(dp[i], 
							dp[j]+a[i]);
				}	
			}
		}
		
		int max = 0;
		for(int e: dp) {
			max = Math.max(max, e);
		}
		
		return max;
	}
	
	
	static int maxNonOverlappingBridges(Integer a[][]) {
		Arrays.sort(a, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1]-o2[1];
				} else {
					return o1[0]-o2[0];
				}
			}
		});
		int n = a.length;
		int b[] = new int[n];
		for(int i = 0; i<n; i++) {
			b[i] = a[i][1];
		}
		return longestIncreasingSubsequence(b);
	}

	public static void main(String[] args) {
//		int a[] = {4, 6, 1, 3, 5, 9, 8};
//		
//		System.out.println(maxSumLIS(a));
		
		Integer a[][] = {
				{0,2}, {1, 1}, {2, 7}
		};

	}

}
