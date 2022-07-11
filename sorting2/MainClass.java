package sorting2;

public class MainClass {
	
	
	static void mergeSort(int a[], int l, int h) {
		if(l < h) {
			int mid = (l+h)/2;
			mergeSort(a, l, mid);
			mergeSort(a, mid+1, h);
			merge(a, l, mid, h);
		}
	}
	
	static void merge(int[] a, int l, int mid, int h) {
		int b[] = new int[a.length];
		int i = l; // i is for left subarray
		int j = mid+1; // j is for right subarray
		int k = l; // k is for b[]
		
		while(i <= mid && j <= h) {
			if(a[i] <= a[j]) {
				b[k] = a[i];
				i++;
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}
		
		if(i > mid) {
			while(j <= h) {
				b[k] = a[j];
				k++; j++;
			}
		} else {
			while(i <= mid) {
				b[k] = a[i];
				k++; i++;
			}
		}
		
		for(i = l; i<=h; i++) {
			a[i] = b[i];
		}
	}


	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void random(int a[], int l, int h) {
		int randomIndex = l + (int)(Math.random() * (h-l+1));
		swap(a, l, randomIndex);
	}
	
	static int partition(int a[], int l, int h) {
		int i = l;
		int j = h;
		random(a, l, h);
		int pivot = a[l];
		while(i < j) {
			while(i < j && a[i] <= pivot) i++;
			while(a[j] > pivot) j--;
			if(i < j) {
				swap(a, i, j);
			}
		}
		swap(a, l, j);
		return j;
	}
	
	static void quickSort(int a[], int l, int h) {
		if(l < h) {
			int pivot = partition(a, l, h);
			quickSort(a, l, pivot-1);
			quickSort(a, pivot+1, h);
		}
	}
	
	public static void main(String[] args) {
		int a[] = {5, 1, 9, 5, 3, 1, 2, 1, 2, 3};
//		quickSort(a, 0, a.length-1);
		
		mergeSort(a, 0, a.length-1);
		
		for(int e: a) System.out.print(e+" ");
	}

}
