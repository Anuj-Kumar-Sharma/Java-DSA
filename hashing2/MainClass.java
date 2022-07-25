package hashing2;

import java.util.*;

public class MainClass {
	
//	{2, 5, -3, -4, 2, 3, 2};
	
	static int largestSubarrayWithZeroSum(int a[]) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int ans = 0;
		int cs = 0;
		for(int i = 0; i<a.length; i++) {
			int e = a[i];
			cs += e;
			if(map.containsKey(cs)) {
				int prev = map.get(cs);
				ans = Math.max(ans, i-prev);
			} else {
				map.put(cs, i);
			}
		}
		return ans;
	}
	
	static int longestConsecutiveSubsequence(int a[]) {
		Set<Integer> set = new HashSet<>();
		for(int e: a) set.add(e);
		int ans = 1;
		for(int e: set) {
			if(!set.contains(e-1)) {
				int len = 1;
				while(set.contains(++e)) {
					len++;
				}
				ans = Math.max(ans, len);
			} 
		}
		return ans;
	}
	
	static class Pair {
		int i, j;
		public Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
	
	static void fourSum(int a[], int x) {
		Map<Integer, Pair> map = new HashMap<>();
		int n = a.length;
		for(int i = 0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				map.put(a[i]+a[j], new Pair(i, j));
			}
		}
		
		for(Map.Entry<Integer, Pair> entry: map.entrySet()) {
			int firstSum = entry.getKey();
			Pair firstPair = entry.getValue();
			int secondSum = x-firstSum;
			if(map.containsKey(secondSum)) {
				Pair secondPair = map.get(secondSum);
				if(firstPair.i != secondPair.i && firstPair.i != secondPair.j &&
						firstPair.j != secondPair.i && firstPair.j != secondPair.j) {
					System.out.println(firstPair.i +" "+firstPair.j+" "+secondPair.i+" "+secondPair.j);
				}
			}
		}
//		
//		System.out.println("not found");
	}

	public static void main(String[] args) {
//		int a[] = {2, 5, -3, -4, 2, 3, 2};
//		System.out.println(largestSubarrayWithZeroSum(a));
		
		int a[] = {2, 3, 4, 6, 8, 2, 3};
		int x = 15;
//		System.out.println(longestConsecutiveSubsequence(a));
		fourSum(a, x);
	}

}
