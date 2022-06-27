package maths1;

public class MainClass {
	
	static int gcd(int a, int b) {
		System.out.println(a+" "+b);
		if(a == b) return a;
		if(a < b) return gcd(b, a);
		return gcd(a-b, b);
	}
	
	static int gcdEuclidModified(int a, int b) {
//		System.out.println(a+" "+b);
		if(a < b) return gcdEuclidModified(b, a);
		if(a%b == 0) return b;
		return gcdEuclidModified(a%b, b);
	}

//	n = 131
//	temp = 0
//	rev = 131
//	
//	ld = 1
	
	public static boolean palindromeNumbers(int n) {
		int rev = 0;
		int temp = n;
		
		while(temp > 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp /= 10;
		}
		
		return n == rev;
	}
	
	public static void main(String[] args) {
//		int n = 11221;
//		
//		System.out.println(palindromeNumbers(n));
		
		int a = 12;
		int b = 24;
//		System.out.println(gcd(a, b));
		
		System.out.println(gcdEuclidModified(a, b));
	}

}
