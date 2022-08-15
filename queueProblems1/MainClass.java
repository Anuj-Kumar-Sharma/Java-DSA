package queueProblems1;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainClass {
	

	static int circularTourProblem(int p[], int d[]) {
		int n = p.length;
		int start = 0;
		int cur = 0;
		int deficiet = 0;
		
		for(int i = 0; i<n; i++) {
			cur += (p[i]-d[i]);
			if(cur < 0) {
				deficiet += cur;
				cur = 0;
				start = i+1;
			}
		}
		if(cur+deficiet >= 0) return start;
		return -1;
	}
	
	//	[1, 2, 3, 4, 5, 6]

	static Queue<Integer> reverseK(Queue<Integer> q, int k) {
		if(q.isEmpty() || k <= 0 || k > q.size()) return q;
		int n = q.size();
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i = 0; i<k; i++) {
			stack.push(q.poll());
		}
		
		while(!stack.isEmpty()) {
			q.add(stack.pop());
		}
		
		for(int i = 0; i<n-k; i++) {
			q.add(q.poll());
		}
		
		return q;
	}
	
	public static void main(String[] args) {
//		Queue<Integer> q = new ArrayDeque<>();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		q.add(5);
//		q.add(6);
//		int k = 2;
//		
//		System.out.println(q);
//		reverseK(q, k);
//		System.out.println(q);
		
		
		int p[] = {6, 10, 2, 3, 20};
		int d[] = {5, 8, 4, 5, 6};
		System.out.println(circularTourProblem(p, d));
		
	}

}
