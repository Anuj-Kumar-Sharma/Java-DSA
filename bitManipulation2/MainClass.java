package bitManipulation2;

public class MainClass {

	public static int[] twoNonRepeatingElements(int a[]) {
		int xor = 0;
		
		for(int e: a) {
			xor = xor ^ e;
		}
		
//		2, 1, 4, 1, 2, 3, 4, 7
//		xor = 3^7 = 4 (100)
//		mask = 4 (100)
		
		int temp = xor;
		int mask = xor & (~(xor-1));
		
		for(int e: a) {
			if((mask & e) == 0) {
				temp = temp ^ e;
			}
		}
		
		int firstNumber = temp;
		int secondNumber = xor ^ firstNumber;
		
		int res[] = new int[2];
		res[0] = firstNumber;
		res[1] = secondNumber;
		
		return res;
	}
	
	
	public static int oneNonRepeatingElement(int a[]) {
		int ans = 0;
		
		for(int e: a) {
			ans = ans ^ e;
		}
		
		return ans;
	}
	
	static int swapTwoBits(int n, int i, int j) {
		int ith = (n >> i) & 1;
		int jth = (n >> j) & 1;
		
		if(ith == jth) return n;
		
		int mask = (1 << i) | (1 << j);
		return n ^ mask;
	}
	
	static long reverse32BitUInt(long n) {
		long res = 0;
		int i = 0;
		while(i <= 31) {
			if((n & (1<<i)) != 0)
				res += (1L<<(31-i));
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		int a[] = {2, 1, 4, 1, 2, 3, 4, 7};
	
//		System.out.println(oneNonRepeatingElement(a));
		
//		int res[] = twoNonRepeatingElements(a);
//		
//		for(int e: res) {
//			System.out.println(e);
//		}
		
//		System.out.println(swapTwoBits(10, 1, 2));
		
//		System.out.println(Integer.MAX_VALUE);
//
//		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(reverse32BitUInt(3));
}

}
