package binarySearchProblems1;

public class MainClass {

	static int binarySearch(int a[], int key, int l, int r) {
		while(l <= r) {
			int mid = (l+r)/2;
			if(a[mid] == key) return mid;
			if(key > a[mid]) l = mid+1;
			else r = mid-1;
		}
		return -1;
	}
	
	static int searchInInfiniteSortedArray(int a[], int key) {
		if(a.length == 0) return -1;
		if(a[0] == key) return 0;
		int index = 1;
		//key = 14
//		index = 16
		while(a[index] <= key) {
			index *= 2;
		}
		
		return binarySearch(a, key, index/2, index);
		
	}
	
	// n = 44
	// ans = 5->6
	// l = 7
	// r = 6
	// mid = 7
	
	static int sqrt(int n) {
		int ans = 1;
		int l = 1, r = n;
		while(l <= r) {
			System.out.println(l+" "+r);
			int mid = (l+r)/2;
			int midSq = mid*mid;
			if(midSq == n) return mid;
			if(midSq > n) r = mid-1;
			else {
				ans = mid;
				l = mid+1;
			}
		}
		return ans;
	}
	
	public double findMedianSortedArrays(int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        if(n1 > n2) return findMedianSortedArrays(a2, a1);
        
        int l = 0, r = n1; // binary search in a1
        while(l <= r) {
            int m1 = (l+r)/2;
            int m2 = (n1+n2+1)/2 - m1;
            
            // [0...m1-1] left of a1, [m1...n1-1] right of a1
            // [0...m2-1] left of a2, [m2....n2-1] right of a2
            
            int max1 = m1 == 0 ? Integer.MIN_VALUE : a1[m1-1];
            int max2 = m2 == 0 ? Integer.MIN_VALUE : a2[m2-1];
            
            int min1 = m1 == n1 ? Integer.MAX_VALUE : a1[m1];
            int min2 = m2 == n2 ? Integer.MAX_VALUE : a2[m2];
            
            if(max1 <= min2 && max2 <= min1) {
                if((n1+n2)%2 == 0) {
                    return ((double)Math.max(max1, max2) + (double)Math.min(min1, min2))/2;
                } else {
                    return (double)Math.max(max1, max2);
                }
            } else if(max2 > min1) {
                l = m1+1;
            } else {
                r = m1-1;
            }
        }
        return 0.0;
    }
	
	static int upperBound(int a[], int key) {
		int l = 0, r = a.length-1;
		int ans = -1;
		
		while(l <= r) {
			System.out.println(l+" "+r+" "+ans);
			int mid = (l+r)/2;
			if(a[mid] <= key) {
				l = mid+1;
			} else {
				ans = mid;
				r = mid-1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
//		int a[] = {1, 2, 3, 4, 6, 7, 8, 11, 13, 14, 17, 17, 19, 23, 25, 27, 28, 29, 31, 34, 35, 36};
//		int key = 14;
		
//		int n = 44;
		
//		System.out.println(searchInInfiniteSortedArray(a, key));
//		System.out.println(sqrt(n));
		
		int a[] = {2, 4, 5, 6, 8, 9, 12};
		int key = 9;
		
		System.out.println(upperBound(a, key));
	}

}
