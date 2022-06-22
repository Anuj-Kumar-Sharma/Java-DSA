package backtracking;

public class MainClass {

	public static boolean isSafe(int a[][], int n, int row, int col) {
		for(int i = 0; i < n; i++) {
			if(a[i][col] == 1) return false;
		}
		
		for(int i = row, j = col; i>=0 && j >=0; i--, j--) {
			if(a[i][j] == 1) return false;
		}
		
		for(int i = row, j = col; i>=0 && j < n; i--, j++) {
			if(a[i][j] == 1) return false;
		}
		
		return true;
	}
	
	public static boolean nQueen(int a[][], int n, int row) {
		
		if(row == n) return true;
		
		for(int col = 0; col < n; col++) {
			if(isSafe(a, n, row, col)) {
				a[row][col] = 1;
				if(nQueen(a, n, row+1)) {
					return true;
				}
				a[row][col] = 0;
			}
		}
		return false;
	}
	
	public static boolean ratInAMaze(int a[][], boolean vis[][], 
			int i, int j) {
		
		int n = a.length;
		//Base conditions
		if(i >= n || j >= n || a[i][j] == 0 || vis[i][j]) {
			return false;
		}
		// Base condition for successfully reached
		if(i == n-1 && j == n-1) return true;
		
		// Mark this cell as visited
		vis[i][j] = true;
		
		// check if a path is possible from down
		if(ratInAMaze(a, vis, i+1, j)) return true;
		
		// check if a path is possible from right
		if(ratInAMaze(a, vis, i, j+1)) return true;
		
		// Mark this cell as unvisited & Backtrack
		vis[i][j] = false;
		
		// backtrack
		return false;
	}
	
	
	public static void main(String[] args) {
		int a[][] = {
				{1, 1, 0, 1},
				{1, 1, 1, 1},
				{0, 0, 1, 0},
				{1, 1, 1, 1}
		};
		
		boolean vis[][] = new boolean[a.length][a.length];
		
		boolean isPathPossible = ratInAMaze(a, vis, 0, 0);
		
		System.out.println(isPathPossible);
		
		for(boolean [] array: vis) {
			for(boolean e: array) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
		
		
//		int n = 5;
//		int a[][] = new int[n][n];
//		
//		nQueen(a, n, 0);
//		
//		for(int[] array: a) {
//			for(int e: array) {
//				System.out.print(e+" ");
//			}
//			System.out.println();
//		}
	}

}
