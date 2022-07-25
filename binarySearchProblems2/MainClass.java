package binarySearchProblems2;

import java.util.ArrayList;

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
	
//	int a[] = {1, 2, 4, 8, 9};
//	int k = 3;
	
//	l = 4
//	r = 3
//	mid = 4
//	
//	cows = 2
//	prev = 8
//	
//	ans = 3
	
	static boolean canAccomodate(int a[], int k, int dis) {
		int prev = a[0];
		int cows = 1;
		for(int i = 1; i<a.length; i++) {
			if(a[i]-prev >= dis) {
				cows++;
				prev = a[i];
				if(cows == k) return true;
			}
		}
		return false;
	}
	
	static int aggressiveCows(int a[], int k) {
		if(a.length < k) return -1;
		int l = 1;
		int r = a[a.length-1];
		int ans = -1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(canAccomodate(a, k, mid)) {
				ans = mid;
				l = mid+1;
			} else {
				r = mid-1;
			}
		}
		return ans;
	}
	
	int M = 10000003;
    public int paint(int n, int t, ArrayList<Integer> a) {
        long s = 0, e = (long)Long.MAX_VALUE;
        int ans = 0;
        while(s <= e) {
            long m = (s+e)/2;
            // System.out.println("s "+s+" m "+m+" e "+e);
            if(isSafe((long)n, (long)t, a, m)) {
                ans = (int)m;
                e = m-1;
            } else {
                s = m+1;
            }
        }
        return ans%M;
    }
    
    public boolean isSafe(long n, long t, ArrayList<Integer> a, long m) {
        
        int k = 1;
        long cur = 0;
        for(int e: a) {
            if((t*(long)e) > m) return false;
            cur = cur + (t * (long)e);
            if(cur > m) {
                k++;
                cur = (t*(long)e);
            }
        }
        if(cur <= m && k <= n) return true;
        return false;
    }
	
	public static void main(String[] args) {
//		int a[] = {3, 1, 4, 7, 2, 5, 2, 9};
//		int k = 3;
		
//		System.out.println(woodCutterProblem(a, k));
		
//		System.out.println(allocateBooks(a, k));
		
		int a[] = {1, 2, 4, 8, 9};
		int k = 3;
		
		System.out.println(aggressiveCows(a, k));

	}

}
