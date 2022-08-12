package queueBasics;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) throws Exception {
		
//		QueueUsingLL q = new QueueUsingLL();
//		QueueUsingArray q = new QueueUsingArray(4);
		
		QueueUsingCircularArray q = new QueueUsingCircularArray(4);
		
		
		Scanner sc = new Scanner(System.in);
		
		// ask user for number of elements
		
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			q.enqueue(sc.nextInt());
		}
		
		// keep enqueueing untill user presses -1
		
		while(true) {
			int data = sc.nextInt();
			if(data == -1) break;
			q.enqueue(data);
		}
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(50);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());

	}

}
