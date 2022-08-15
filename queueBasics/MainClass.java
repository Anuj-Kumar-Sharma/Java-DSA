package queueBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	
	
	static int fun(List<String> h) {
		int ans = 0;
		int n = h.size();
		int m = h.get(0).length();
		int a[][] = new int[n][m];
		
		for(int i = 0; i<n; i++) {
			String cur = h.get(i);
			for(int j = 0; j<m; j++) {
				a[i][j] = cur.charAt(j) - '0';
			}
		}
		
		for(int i = 0; i<m; i++) {
			int max = 0;
			for(int j = 0; j<n; j++) {
				for(int k = 0; k<m; k++) {
					max = Math.max(max, a[j][k]);
				}
 			}
			ans += max;
			for(int j = 0; j<n; j++) {
				int maxN = 0, maxI = 0;
				for(int k = 0; k<m; k++) {
					if(a[j][k] > maxN) {
						maxN = a[j][k];
						maxI = k;
					}
				}
				a[j][maxI] = 0;
			}
		}
		
		return ans;
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		List<String> l = new ArrayList<String>();
		l.add("137");
		l.add("364");
		l.add("115");
		l.add("724");
		
		System.out.println(fun(l));
		
//		QueueUsingLL q = new QueueUsingLL();
//		QueueUsingArray q = new QueueUsingArray(4);
		
//		QueueUsingCircularArray q = new QueueUsingCircularArray(4);
//		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		// ask user for number of elements
//		
//		int n = sc.nextInt();
//		for(int i = 0; i<n; i++) {
//			q.enqueue(sc.nextInt());
//		}
//		
//		// keep enqueueing untill user presses -1
//		
//		while(true) {
//			int data = sc.nextInt();
//			if(data == -1) break;
//			q.enqueue(data);
//		}
//		
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		q.enqueue(50);
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());

	}

}
