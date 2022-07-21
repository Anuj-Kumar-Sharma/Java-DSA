package collectionFramework;

import java.util.*;

public class LearnMaps {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Wicket", 6);
		map.put("Ball", 2);
		map.put("Bat", 4);
		
		
//		if(!map.containsKey("Bat")) {
//			map.put("Bat", 3);
//		}
//		
//		System.out.println(map.get("Helmet"));
//		
////		map.putIfAbsent("Bat", 3);
//		
//		System.out.println(map);
//		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry: entries) {
			System.out.println(entry.toString());
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		

	}

}
