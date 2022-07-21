package collectionFramework;

import java.util.*;

public class LearnQueue {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(12);
		q.add(23);
		q.add(45);
		
		System.out.println("peek" + q.peek());
		
		System.out.println(q.remove());
		
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.poll());
		

	}

}
