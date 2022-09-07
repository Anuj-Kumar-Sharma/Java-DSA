package priorityQueue1;

import java.util.*;

public class MainClass {
	
	
	static int findKthSmallest(int a[], int k) {
		if(k > a.length) return -1;
		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i<k; i++) {
			pq.offer(a[i]);
		}
		
		for(int i = k; i<a.length; i++) {
			System.out.println(pq);
			if(pq.peek() > a[i]) {
				pq.poll();
				pq.offer(a[i]);
			}
		}
		System.out.println(pq);
		return pq.peek();
	}
	
	static int findKthLargest(int a[], int k) {
		if(k > a.length) return -1;
		Queue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i<k; i++) {
			pq.offer(a[i]);
		}
		
		for(int i = k; i<a.length; i++) {
			System.out.println(pq);
			if(pq.peek() < a[i]) {
				pq.poll();
				pq.offer(a[i]);
			}
		}
		System.out.println(pq);
		return pq.peek();
	}
	

	public static void main(String[] args) {
		
		
		int a[] = {1, 4, 9, 2, 5, 6, 7};
		int k = 3;
		System.out.println(findKthLargest(a, k));
		
//		Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//		
//		pq.offer(5);
//		pq.offer(10);
//		pq.offer(9);
//		pq.offer(1);
//		
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq);

	}

}
