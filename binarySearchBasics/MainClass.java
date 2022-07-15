package binarySearchBasics;

public class MainClass {
	
	static int binarySearch(int a[], int key) {
		int l = 0;
		int r = a.length-1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(a[mid] == key) return mid;
			if(key > a[mid]) l = mid+1;
			else r = mid-1;
		}
		return -1;
	}
	
//	1, 2, 4, 4, 4, 5, 9, 11, 11, 11, 11, 14
//	l = 8
//	r = 7
//	key = 8
//	
//	ans = 8
//	mid = 7
	
	static int leftOccurence(int a[], int key) {
		int l = 0;
		int r = a.length-1;
		int ans = -1;
		while(l <= r) {
			int mid = (l+r)/2;
			if(a[mid] == key) {
				ans = mid;
				r = mid-1;
			}
			else if(key > a[mid]) l = mid+1;
			else r = mid-1;
		}
		return ans;
	}
	
	static int searchRotatedSorted(int a[], int key) {
		int l = 0, r = a.length-1;
		while(l <= r) {
			int mid = l + (r-l)/2;
			if(a[mid] == key) return mid;
			if(a[l] <= a[mid]) { // left part sorted
				if(key >= a[l] && key < a[mid]) { // left side present
					r = mid-1;
				} else { // right side present
					l = mid+1;
				}
			} else { // right part sorted
				if(key > a[mid] && key <= a[r]) { // right side present
					l = mid+1;
				} else { // left side present
					r = mid-1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		int a[] = {1, 2, 4, 4, 4, 5, 9, 9, 11, 11, 11, 14};
		int a[] = {4, 5, 6, 7, 1, 2, 3};
		int key = 1;
		
//		System.out.println(leftOccurence(a, key));
		System.out.println(searchRotatedSorted(a, key));

	}

}
