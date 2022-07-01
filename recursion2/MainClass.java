package recursion2;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
	
	static void towerOfHanoi(int n, char from, char to, char aux) {
		if(n == 0) return;
		
		towerOfHanoi(n-1, from, aux, to);
		System.out.println("Move "+n+" from "+from+" to "+to);
		towerOfHanoi(n-1, aux, to, from);
	}
	
	
	

	static void generateAllSubsets(String s) {
		Set<String> set = new HashSet<>();
		utilGenerateAllSubsets(s, 0, "", set);
		for(String st: set) {
			System.out.println(st);
		}
	}
	
	static void utilGenerateAllSubsets(String s, int i, String cur, Set<String> set) {
		if(i == s.length()) {
//			System.out.println(cur);
			set.add(cur);
			return;
		}
		
		utilGenerateAllSubsets(s, i+1, cur, set);
		utilGenerateAllSubsets(s, i+1, cur + s.charAt(i), set);
	}

	static int sumOfDigits(int n) {
//		System.out.println(n);
		if(n == 0) return 0;
		
		int lastDigit = n % 10;
		
		return lastDigit + sumOfDigits(n/10);
//		int sum = 0;
//		while(n > 0) {
//			sum += n%10;
//			n /= 10;
//		}
//		return sum;
	}
	
	public static void main(String[] args) {
		int n = 2314;
		
//		System.out.println(sumOfDigits(n));
		
//		generateAllSubsets("aaa");
		
		towerOfHanoi(2, 'A', 'C', 'B');

	}

}
