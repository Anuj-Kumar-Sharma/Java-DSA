package collectionFramework;

import java.util.*;

public class LearnLists {

	public static void main(String[] args) {
		
		Stack<Integer> list = new Stack<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list.add(23);
		list.add(45);
		list.add(3); // O(1)
		list.add(4);
		
		
		list2.add(300);
		list2.add(4500);
		
		list.addAll(list2);
		
		System.out.println(list);
		
		list.set(1, null);
		list.set(0, 100); // O(1)
//		
		System.out.println(list);
		
		list.remove(0); // O(n)
		
		System.out.println(list); 
		
		list.add(0, 23);
		System.out.println(list); 
		
		System.out.println(list.contains(-1));
		
		
//		for(int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i)*2);
//		}
		
//		for(int e: list) {
//			System.out.println(e*2);
//		}
//		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		System.out.println(list.get(0));
		
		
	}

}
