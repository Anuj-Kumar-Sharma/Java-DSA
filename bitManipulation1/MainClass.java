package bitManipulation1;

public class MainClass {
	
//	001010 -> 00101 -> 0010 -> 0001 -> 000
//	n = 10>>1 = 5>>1 = 2>>1 = 1>>1 = 0
//	count = 2
	
//	1111
//	1110
//	1100
//	1000
//	0000
	
//	1010
//	1000
//	0000
	
	static int countSetBitsOptimised(int n) {
		int count = 0;
		while(n > 0) {
			System.out.println(n);
			count++;
			n = (n & (n-1));
		}
		
		return count;
	}
			
	static int countSetBits(int n) {
		int count = 0;
		
		while(n > 0) {
			if((n & 1) == 1) {
				count++;
			}
			n =  n>>1;
//			n >>= 1;
		}
		return count;
	}
	
	static boolean isPowerOfTwo(int n) {
		int res = n & (n-1);
		return res == 0;
	}
	
	
//	5 ->            00000000101
//	mask = 1 << 2 = 00000000100
//	                00000000100
	
	static int findIthBit(int n, int i) {
		int mask = 1 << i;
		
		int result = n&mask;
		
		if(result == 0) return 0;
		else return 1;
	}
	
	static int toggleIthBit(int n, int i) {
		int mask = 1 << i;
		return n^mask;
	}

	public static void main(String[] args) {
		int n = 5;
//		System.out.println(findIthBit(n, 2));
		
		
//		int b = ~a;
//		
//		System.out.println(a+" "+b);
		
//		System.out.println(countSetBits(10));
		System.out.println(countSetBitsOptimised(10));

	}

}
