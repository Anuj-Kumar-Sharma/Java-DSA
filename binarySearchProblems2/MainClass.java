package binarySearchProblems2;

public class MainClass {
	
	static boolean isEnough(int a[], int k, int cut) {
		int total = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i] > cut) {
				total += (a[i]-cut);
			}
		}
		System.out.println(total);
		return total >= k;
	}

	static int woodCutterProblem(int a[], int k) {
		int l = 0, r = -1;
		for(int e: a) {
			r = Math.max(r, e);
		}
		int ans = -1;
		while(l <= r) {
			int mid = (l+r)/2;
			System.out.println(l+" "+r +" "+mid);
			if(isEnough(a, k, mid)) {
				ans = mid;
				l = mid+1;
			} else {
				r = mid-1;
			}
		}
		return ans;
	}
	
	static boolean isSafe(int a[], int k, int pages) {
		int students = 1;
		int cur = a[0];
		for(int i = 1; i<a.length; i++) {
			if(cur > pages) return false;
			cur += a[i];
			if(cur > pages) {
				students++;
				cur = a[i];
			}
		}
		if(cur > pages) return false;
		return students <= k;
	}
	
	static int allocateBooks(int a[], int k) {
		if(a.length < k) return -1;
		int l = 0, r = 0;
		for(int e: a) r += e;
		
		while(l <= r) {
			int mid = (l+r)/2;
			if(isSafe(a, k, mid)) {
				r = mid-1;
			} else {
				l = mid+1;
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		int a[] = {3, 1, 4, 7, 2, 5, 2, 9};
		int k = 3;
		
//		System.out.println(woodCutterProblem(a, k));
		
		System.out.println(allocateBooks(a, k));

	}

}
