package recursion1;

public class MainClass1 {
	
	static int i = 0;
	static void dummyFunction() {
		System.out.println(i++);
		dummyFunction();
	}
	
//	N = 5
	
	static void printNNaturalNumbers(int N) {
		if(N == 0) return;
		
		printNNaturalNumbers(N-1); 
		System.out.println(N);
	}
	
//	N = 5 15		
//	N = 4 10
//	N = 3 6
//	N = 2 3
//	N = 1 1
//	N = 0 0
	
	static int sumOfNNaturalNumbers(int N) {
		if(N == 0) return 0;
		
		int subProblem = sumOfNNaturalNumbers(N-1);
		
		return subProblem + N;
	}
	
	static int countPathsInAMatrix(int n, int m) {
		if(n == 1 || m == 1) return 1;
		
		int rightSideAns = countPathsInAMatrix(n, m-1);
		int downSideAns = countPathsInAMatrix(n-1, m);
		
		return rightSideAns + downSideAns;
	}
	
	public static void main(String[] args) {
//		dummyFunction();
		
//		printNNaturalNumbers(5);
		
//		System.out.println(sumOfNNaturalNumbers(5));
		
//		System.out.println(Math.pow(3, 5));
		
		System.out.println(countPathsInAMatrix(4, 3));
	}
}
