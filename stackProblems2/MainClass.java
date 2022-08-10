package stackProblems2;

import java.util.ArrayDeque;

public class MainClass {
	
	static int[] previousSmaller(int a[]) {
		int ans[] = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i = 0; i<a.length; i++) {
			int e = a[i];
			while(!stack.isEmpty() && a[stack.peek()] >= e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(i);
		}
		return ans;
	}
	
	static int[] nextSmaller(int a[]) {
		int ans[] = new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i = a.length-1; i>=0; i--) {
			int e = a[i];
			while(!stack.isEmpty() && a[stack.peek()] >= e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = a.length;
			} else {
				ans[i] = stack.peek();
			}
			stack.push(i);
		}
		return ans;
	}
	
	static int maxmaximumAreaInHistogramOptimised(int a[]) {
		int ps[] = previousSmaller(a);
		int ns[] = nextSmaller(a);
		
		int max = 0;
		for(int i = 0; i<a.length; i++) {
			int width = ns[i]-ps[i]-1;
			int curArea = width * a[i];
			max = Math.max(max, curArea);
		}
		
		return max;
	}
	
	
	static int maximumAreaInHistogram(int a[]) {
		int n = a.length;
		int max = 0;
		for(int i = 0; i<n; i++) {
			int l = i, r = i;
			while(l >= 0 && a[l] >= a[i]) l--;
			while(r < n && a[r] >= a[i]) r++;
			
			int width = r-l-1;
			int curArea = a[i] * width;
			max = Math.max(max, curArea);
		}
		return max;
	}
	
	static int maximumAreaSubMatrix(int a[][]) {
		int b[] = new int[a[0].length];
		int max = 0;
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<b.length; j++) {
				if(a[i][j] == 0) {
					b[j] = 0;
				} else {
					b[j]++;
				}
			}
			int cur = maxmaximumAreaInHistogramOptimised(b);
			max = Math.max(max, cur);
		}
		
		return max;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		MinStack minStack = new MinStack();
		minStack.push(10);
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.push(1);
		System.out.println(minStack.min());
		minStack.pop();
		minStack.push(5);
		System.out.println(minStack.min());
		minStack.pop();
		System.out.println(minStack.min());
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.push(10);
		System.out.println(minStack.min());
		
		
//		int a[][] = {
//				{1, 1, 0, 1}, 
//				{1, 1, 0, 1}, 
//				{0, 0, 1, 1}, 
//				{1, 1, 0, 0}
//				};
//		System.out.println(maximumAreaSubMatrix(a));
		
//		int a[] = {4, 3, 9, 2, 5, 1, 8, 3};
//		
//		System.out.println(maximumAreaInHistogram(a));
//		System.out.println(maxmaximumAreaInHistogramOptimised(a));
//		
		
//		int a[] = {4, 2, 1, 4, 3, 0, 2, 3};
//		System.out.println(maximumAreaInHistogram(a));
		
//		TwoStacks obj = new TwoStacks(5);
//		obj.push1(10);
//		obj.push1(20);
//		obj.push1(30);
//		
//		obj.push2(40);
//		obj.push2(60);
//		
//		System.out.println(obj.pop1());
//		System.out.println(obj.pop1());
//		
//		System.out.println(obj.pop2());
//		System.out.println(obj.pop2());
//		
//		System.out.println(obj.pop2());

	}

}
