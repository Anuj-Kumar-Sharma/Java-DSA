package arrays4;

import java.util.Arrays;

public class MainClass4 {
	
//	a[] = {1, 2, 7, 8, 10, 12};
//	sum = 50;
//	l = 0;
//	r = 5
	
	
	static boolean threeSum(int a[], int sum) {
		int n = a.length;
		Arrays.sort(a);
		for(int i = 0; i<n-2; i++) {
			boolean found = twoSum(a, sum-a[i], i+1);
			if(found) return true;
		}
		return false;
	}
	
	static boolean twoSum(int a[], int sum, int l) {
//		int l = 0;
		int r = a.length-1;
		
		while(l < r) {
			int curSum = a[l] + a[r];
			if(curSum > sum) {
				r--;
			} else if(curSum < sum) {
				l++;
			} else {
				return true;
			}
		}
		return false;
	}
	
	
	static int maxValueOfJMinusI(int a[]) {
		
		int n = a.length;
		int[] rightMax = new int[n];
		int[] leftMin = new int[n];
		
		rightMax[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) 
			rightMax[i] = Math.max(rightMax[i+1], a[i]);
		
		leftMin[0] = a[0];
		for(int i = 1; i<n; i++)
			leftMin[i] = Math.min(leftMin[i-1], a[i]);
		
//		i = {0, 1, 2, 3, 4, 5, 6}
//		a = {4, 3, 5, 1, 4, 2, 1};
//		l = {4, 3, 3, 1, 1, 1, 1};
//		r = {5, 5, 5, 4, 4, 2, 1};
//		
//		i = 7
//		j = 6
//		
//		ans = 3
		
		int i = 0, j = 0;
		int ans = 0;
		while(i < n && j < n) {
			if(leftMin[i] < rightMax[j]) {
				ans = Math.max(ans, j-i);
				j++;
			} else {
				i++;
			}
		}
		return ans;
	}
	
	static int trappingRainWater(int a[]) {
		int ans = 0;
		
		int leftMax = 0, rightMax = 0;
		int l = 0, r = a.length-1;
		
//		{3, 4, 5, 1, 7, 2, 6, 5, 4, 1};
//		
//		leftMax = 5
//		rightMax = 6
//		
//		ans = 4 + 4
		
		while(l < r) {
			if(a[l] <= a[r]) {
				if(a[l] > leftMax) leftMax = a[l];
				else ans += (leftMax-a[l]);
				l++;
			} else {
				if(a[r] > rightMax) rightMax = a[r];
				else ans += (rightMax-a[r]);
				r--;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
//		int a[] = {4, 3, 5, 1, 4, 2, 1};
		
//		int a[] = {3, 4, 5, 1, 7, 2, 6, 5, 4, 1};
		
//		int ans = trappingRainWater(a);
		
//		System.out.println(maxValueOfJMinusI(a));
		
		int a[] = {1, 2, 7, 8, 10, 12};
		int sum = 50;
//		System.out.println(twoSum(a, sum));
	
	}
}
