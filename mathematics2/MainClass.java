package mathematics2;

import java.util.Arrays;

public class MainClass {

	public static boolean isPrime(int n) {
		if(n == 1) return false;
		for(int i = 2; i<n; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
	
	public static boolean isPrimeEfficient(int n) {
		if(n == 1) return false;
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
	
//	i = 5, 11, 17, 23, 29
	
//	i = 5
	
	public static boolean isPrimeMoreEfficient(int n) {
		if(n == 1) return false;
		if(n == 2 || n == 3) return true;
		if(n % 2 == 0|| n % 3 == 0) return false;
		
		for(int i = 5; i*i <= n; i += 6) {
			if(n % i == 0 || n % (i+2) == 0) return false;
		}
		
		return true;
	}
	
	
	public static void printDivisors(int n) {
		for(int i = 1; i*i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
				if(n/i != i) System.out.println(n/i);
			}
		}
	}
	
	public static void printSortedDivisors(int n) {
		int i = 1;
		for(; i*i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		i--;
		for(; i >= 1; i--) {
			if(n % i == 0) {
				if(n/i != i) System.out.println(n/i);
			}
		}
	}
	
	public static void printUntillNPrimeNumbers(int n) {
		for(int i = 1; i<=n; i++) {
			if(isPrimeMoreEfficient(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	
	public static void sieveOfEratosthenes(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		
		for(int i = 2; i*i <= n; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j<=n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		for(int i = 2; i<=n; i++) {
			if(isPrime[i]) System.out.println(i);
		}
		
	}
	
	static int fastPower(int a, int b) {
		
		if(b == 0) return 1;
		
		int halfRes = fastPower(a, b/2);
		
		int fullRes = halfRes * halfRes;
		
		if(b % 2 != 0) fullRes = fullRes * a;
		
		return fullRes;
	}
	
	public static void main(String[] args) {
		
//		System.out.println(isPrime(53));
//		System.out.println(isPrimeEfficient(911));
//		System.out.println(isPrimeMoreEfficient(41));
		
//		printDivisors(25);
//		printSortedDivisors(7);
		
//		printUntillNPrimeNumbers(30);
		
//		sieveOfEratosthenes(20);
		
		System.out.println(fastPower(3, 3));

	}

}
