package doubtSession2;

import java.util.*;

public class MainClass {
	
	static int largestSubarraywithEqual0And1(int a[]) {
		int n = a.length;
		int prefixSum[] = new int[n];
		

//		if(a[0] == 0) {
//			prefixSum[0] = -1;
//		} else {
//			prefixSum[0] = 1;
//		}
		
		prefixSum[0] = a[0] == 0 ? -1: 1;
		
		for(int i = 1; i<n; i++) {
			prefixSum[i] = a[i] == 0 ? 
					prefixSum[i-1]-1: prefixSum[i-1]+1;
		}
		
//		int a[] = {0, 0, 0, 0, 1, 0, 1, 1, 0, 1};
		
//		prefix[] = {-1, -2, -3, -4, -3, -4, -3, -2, -3, -2}
// 		ans = 8
//		
//		-1 -> 0
//		-2 -> 1
//		-3 -> 2
//		-4 -> 3
		
		
		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for(int i = 0; i<n; i++) {
			if(map.containsKey(prefixSum[i])) {
				ans = Math.max(ans,  i - map.get(prefixSum[i]));
			} else {
				map.put(prefixSum[i], i);
			}
		}
		return ans;
	}
	
	static int LongestOnes(int a[]) {
		int curCount = 0;
		int maxCount = 0;
		
		for(int element: a) {
			if(element == 0) {
				maxCount = Math.max(maxCount, curCount);
				curCount = 0;
			} else {
				curCount++;
			}
		}
		maxCount = Math.max(maxCount, curCount);
		return maxCount;
	}

//	int a[] = {1, 2, 4, 4, 2, 3};
//	
//	curElement = 4
//	count = 0
	
	static int majorityElement(int a[]) {
		int curElement = -1;
		int count = 0;
		
		for(int i = 0; i<a.length; i++) {
			if(count == 0) {
				curElement = a[i];
				count = 1;
			} else {
				if(a[i] == curElement) {
					count++;
				} else {
					count--;
				}
			}
		}
		int finalCount = 0;
		for(int e: a) {
			if(e == curElement) {
				finalCount++;
			}
		}
		
		if(finalCount > a.length / 2) {
			return curElement;
		} else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[] = {2, 2, 2, 4, 5, 6, 2, 2, 2, 4};
		
//		System.out.println(majorityElement(a));
		
//		int a[] = {0, 0, 0, 0, 1, 0, 1, 1, 0, 1};
		
		int a[] = {0, 0, 0, 1, 1, 0, 1};
		
		System.out.println(largestSubarraywithEqual0And1(a));
		
	}

}
