package internalWorkingOfHashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class MainClass {

	public static void main(String[] args) {
		
//		String s1 = "CAT";
//		String s2 = "ACT";
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
//		HashMap<Integer, String> map = new HashMap<>();
//		
//		map.put(12, "");
		
//		int a[] = {1, 2, 3, 4, 5};
//		matrixMultiplication(a.length, a);
		
		int n = 5;
		for(int diff = 1; diff<n; diff++) {
			for(int row = 0, col = diff; row<n-diff; row++, col++) {
				System.out.print(row+""+col+" ");
			}
			System.out.println();
		}
		
		
	}

	static int matrixMultiplication(int n, int a[]){
        int dp[][] = new int[n][n];
        for(int len = 2; len<n; len++) {
            int col = len;
            for(int row = 0; row<n-len; row++) {
                dp[row][col] = Integer.MAX_VALUE;
                for(int k = row+1; k<col; k++) {
                    dp[row][col] = Math.min(dp[row][col], 
                    dp[row][k] + dp[k][col] + 
                    a[row]*a[k]*a[col]);
                }
                col++;
            }
        }
        
        for(int xx[]: dp) {
            for(int e: xx) {
                System.out.print(e+" ");
            }
            System.out.println();
        }
        
        return dp[0][n-1];
    }
	
}

class Student {
	String name;
	int rollNo;
	boolean enrolled;
	List<String> subjects;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo, name, enrolled, subjects);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && rollNo == other.rollNo;
//	}
	
	
}
