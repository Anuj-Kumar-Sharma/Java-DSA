package hashingBasics;

import java.util.*;

public class Problems {

	static int countDistinctElements(int a[]) {
		Set<Integer> set = new HashSet<>();
		for(int e: a) {
			set.add(e);
		}
		System.out.println(set);
		return set.size();
	}
	
	static void frequencyOfElements(int a[]) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<a.length; i++) {
			int e = a[i];
			if(map.containsKey(e)) {
				int temp = map.get(e);
				map.put(e, temp+1);
			} else {
				map.put(e, 1);
			}
			System.out.println(e+" "+ map);
		}
		
		System.out.println(map);
		
	}
	
	static class Pair {
		int a, b;
		Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	
	static Pair pairWithGivenSum(int a[], int sum) {
		Set<Integer> set = new HashSet<>();
		for(int e: a) {
			int comp = sum-e;
			if(set.contains(comp)) return new Pair(e, comp);
			set.add(e);
		}
		return null;
	}
	
	static boolean zeroSumSubarray(int a[]) {
		Set<Integer> set = new HashSet<>();
		int cs = 0;
		set.add(0);
		for(int e: a) {
			cs += e;
			if(set.contains(cs)) return true;
			set.add(cs);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int a[] = {10, -10};
//		System.out.println(countDistinctElements(a));
		
//		frequencyOfElements(a);
		int sum = 1;
		Pair pair = pairWithGivenSum(a, sum);
		if(pair != null) 
			System.out.println(pair.a+" "+pair.b);
		
		System.out.println(zeroSumSubarray(a));
	}

}
