package arrays2;

public class MainClass {
	
	static int containerWithMostWater(int a[]) {
		
		int maxArea = 0;
		int l = 0;
		int r = a.length-1;
		
		while(l < r) {
			int height = Math.min(a[l], a[r]);
			int distance = r-l;
			
			int area = height*distance;
			maxArea = Math.max(maxArea, area);
			
			if(a[l] < a[r]) {
				l++;
			} else {
				r--;
			}
		}
		
		return maxArea;
	}
	
	
	
	
	
//	{-2, 7, -6, -4, 1, -3, 8};
//	
//	cur = 8
//	max = 8
	
	static int largestSumSubArray(int a[]) {
		
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
//		int start = 
//		int ansStart = 
//		int end = 
		
		for(int i = 0; i<a.length; i++) {
			curSum += a[i];
			if(maxSum < curSum) {
				maxSum = curSum;
				//update end
			}
			if(curSum < 0) {
				curSum = 0;
				// reset start = i
			}
		}
		
		return maxSum;
	}
	
	
//
//	largest = 7
//	3 4 6 7
	
	static void leadersinAnArray(int a[]) {
		int largest = Integer.MIN_VALUE;
//		int b[] = new int[a.length];
//		int j = 0;
		for(int i = a.length-1; i>=0; i--) {
			if(a[i] > largest) {
				largest = a[i];
				System.out.print(a[i]+" ");
//				b[j++] = a[i];
			}
		}
//		for(j=j-1; j>=0; j--) {
//			System.out.println(b[j]+" ");
//		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {-2, -7, -6, -4, -1, -3, -8};
//		leadersinAnArray(a);
		int ans = largestSumSubArray(a);
//		
		System.out.println(ans);
		
		
//		int a[] = {1, 4, 6, 2, 4, 5, 8, 3, 7};
//		int ans = containerWithMostWater(a);
//		System.out.println(ans);
	}

}
