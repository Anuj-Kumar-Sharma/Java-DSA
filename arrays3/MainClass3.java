package arrays3;

import java.util.HashSet;
import java.util.Set;

public class MainClass3 {
	
	static boolean searchInAMatrix(int a[][], int key) {
		int row = 0;
		int col = a.length-1;
		
		while(row < a.length && col >= 0) {
			if(a[row][col] == key) {
				return true;
			} else if(key > a[row][col]) {
				row++;
			} else {
				col--;
			}
		}
		return false;
	}
	
	static void rotateMatrix(int a[][]) {
		int n = a.length;
		transposeOfAMatrix(a);
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n/2; j++) {
				int swap = a[i][j];
				a[i][j] = a[i][n-j-1];
				a[i][n-j-1] = swap;
			}
		}
	}
	
	
	static void printMatrix(int a[][]) {
		int n = a.length;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	static void transposeOfAMatrix(int a[][]) {
		int n = a.length;
		
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				int swap = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = swap;
			}
		}
	}
	
	
	
	static boolean subArrayWithZeroSum(int a[]) {
		
		int n = a.length;
//		int prefixSum[] = new int[n];
//		
//		prefixSum[0] = a[0];
		
//		a = {2, 3, 1, -4, 4, -2};
//		sum = 2
//		
//		set = {2, 5, 6}
		
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += a[i];
			if(set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}
	
	public static void main(String[] args) {
//		int a[] = {2, 3, 1, -4, 4, -2};
//
//		System.out.println(subArrayWithZeroSum(a));
	
//		int a[][] = {
//				{1, 2, 3},
//				{4, 5, 6},
//				{7, 8, 9}
//		};
//		
//		printMatrix(a);
//		
////		transposeOfAMatrix(a);
//		
//		rotateMatrix(a);
//		
//		printMatrix(a);
		
		
		int a[][] = {
				{1, 4, 5, 7},
				{2, 5, 6, 9},
				{6, 10, 11, 13},
				{8, 12, 15, 18}
		};
		
		int key = 14;
		 
		System.out.println(searchInAMatrix(a, key));
		
	}

}
