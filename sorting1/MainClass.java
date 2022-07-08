package sorting1;

public class MainClass {
	
	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static void intersectionOfTwoSortedArrays(int a[], int b[]) {
		int i = 0;
		int j = 0;
		
//		i = 1
//		j = 3
//		int a[] = {2, 5, 6, 6, 8, 8};
//		int b[] = {1, 1, 2, 3, 6, 6, 9};
		
		while(i < a.length && j < b.length) {
			if(i > 0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
			if(a[i] == b[j]) {
				System.out.print(a[i]+" ");
				i++;
				j++;
			} else if(a[i] > b[j]) {
				j++;
			} else if(a[i] < b[j]) {
				i++;
			}
		}
	}
	
	static void selectionSort(int a[]) {
		for(int i = 0; i<a.length-1; i++) {
			int min = i;
			for(int j = i+1; j<a.length; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			swap(a, min, i);
		}
	}
	
	static void insertionSort(int a[]) {
		for(int i = 1; i<a.length; i++) {
			
			printArray(a);
			System.out.println();
			
			int j = i-1;
			int temp = a[i];
			for(; j>=0; j--) {
				if(temp < a[j]) {
					a[j+1] = a[j];
				} else {
					break;
				}
			}
			a[j+1] = temp;
		}
	}
	
	
	static void bubbleSort(int a[]) {
		for(int i = 0; i<a.length-1; i++) {
			boolean isSwapped = false;
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					isSwapped = true;
					swap(a, j, j+1);
				}
			}
			if(!isSwapped) break;
		}
	}
	
	static void printArray(int a[]) {
		for(int e: a) {
			System.out.print(e+" ");
		}
	}

	public static void main(String[] args) {
//		int a[] = {9, 5, 2, 6, 3, 1, 3};
//		bubbleSort(a);
//		insertionSort(a);
//		selectionSort(a);
		
//		printArray(a);
		int a[] = {2, 2, 5, 6, 6, 8, 8};
		int b[] = {1, 1, 2, 2, 3, 6, 6, 9};
		
		intersectionOfTwoSortedArrays(a, b);
	}

}
