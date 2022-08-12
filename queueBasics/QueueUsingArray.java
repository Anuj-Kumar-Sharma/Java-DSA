package queueBasics;

public class QueueUsingArray {
	
	int rear;
	int a[];
	int n;
	
	public QueueUsingArray(int n) {
		rear = -1;
		a = new int[n];
		this.n = n;
	}
	
	void enqueue(int data) throws Exception {
		if(isFull()) throw new Exception("Queue Array is Full");
		rear++;
		a[rear] = data;
	}
	
	int dequeue() throws Exception {
		if(isEmpty()) throw new Exception("Queue is Empty");
		int ans = a[0]; // front is always 0
		for(int i = 0; i<rear; i++) {
			a[i] = a[i+1];
		}
		rear--;
		return ans;
	}
	
	private boolean isFull() {
		return rear == n-1;
	}
	
	boolean isEmpty() {
		return rear == -1;
	}

}
