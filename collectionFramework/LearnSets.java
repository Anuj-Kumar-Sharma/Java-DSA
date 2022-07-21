package collectionFramework;

import java.util.*;

public class LearnSets {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Kiwi");
		set.add("Apple");
		set.add("Mango");
		set.add("Orange");
		
		set.remove("Kiwi");
		
		System.out.println(set);

	}

}
